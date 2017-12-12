package com.vaadin.addon.charts.examples.dynamic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vaadin.addon.charts.AbstractChartExample;
import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.ChartClickEvent;
import com.vaadin.addon.charts.PointClickEvent;
import com.vaadin.addon.charts.PointSelectEvent;
import com.vaadin.addon.charts.PointUnselectEvent;
import com.vaadin.addon.charts.SeriesCheckboxClickEvent;
import com.vaadin.addon.charts.SeriesHideEvent;
import com.vaadin.addon.charts.SeriesLegendItemClickEvent;
import com.vaadin.addon.charts.SeriesShowEvent;
import com.vaadin.addon.charts.SkipFromDemo;
import com.vaadin.addon.charts.model.AbstractSeries;
import com.vaadin.addon.charts.model.AxisTitle;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.DataSeries;
import com.vaadin.addon.charts.model.DataSeriesItem;
import com.vaadin.addon.charts.model.Dimension;
import com.vaadin.addon.charts.model.PlotLine;
import com.vaadin.addon.charts.model.PlotOptionsSeries;
import com.vaadin.addon.charts.model.Series;
import com.vaadin.addon.charts.model.Tooltip;
import com.vaadin.addon.charts.model.XAxis;
import com.vaadin.addon.charts.model.YAxis;
import com.vaadin.addon.charts.model.style.SolidColor;
import com.vaadin.shared.Registration;
import com.vaadin.ui.checkbox.Checkbox;
import com.vaadin.ui.common.HasClickListeners;
import com.vaadin.ui.event.ComponentEventListener;
import com.vaadin.ui.html.Label;
import com.vaadin.ui.button.Button;
import com.vaadin.ui.layout.FlexLayout;
import com.vaadin.ui.layout.HorizontalLayout;
import com.vaadin.ui.layout.VerticalLayout;
import com.vaadin.ui.radiobutton.RadioButtonGroup;

@SkipFromDemo
public class ServerSideEvents extends AbstractChartExample {

    private Chart chart;
    private Label lastEvent = new Label();
    private Label eventDetails = new Label();
    private int id = 0;
    private VerticalLayout historyLayout = new VerticalLayout();
    private int eventNumber = 0;
    private DataSeriesItem firstDataPoint;
    private VerticalLayout eventListeners;
    private Checkbox visibilityToggling;

    @Override
    public void initDemo() {
        eventDetails.setId("eventDetails");
        lastEvent.setId("lastEvent");
        historyLayout.setId("history");
        chart = new Chart();
        chart.setId("chart");
//        chart.setWidth("500px");

        final Configuration configuration = chart.getConfiguration();
        configuration.getChart().setType(ChartType.SCATTER);
        configuration.getTitle().setText("Test server side events.");
        configuration.getSubTitle().setText(
                "When an event occurs, the details are shown below the chart");
        configuration.setExporting(true);
        configuration.getChart().setAnimation(false);
        configuration.getChart().setZoomType(Dimension.XY);

        XAxis xAxis = configuration.getxAxis();
        xAxis.setMinPadding(0.2);
        xAxis.setMaxPadding(0.2);

        YAxis yAxis = configuration.getyAxis();
        yAxis.setTitle(new AxisTitle("Value"));
        PlotLine plotline = new PlotLine();
        plotline.setValue(0);
        plotline.setWidth(1);
        plotline.setColor(new SolidColor("#808080"));
        yAxis.setPlotLines(new PlotLine[] { plotline });
        yAxis.setMinPadding(0.2);
        yAxis.setMaxPadding(0.2);

        YAxis yAxis1 = new YAxis();
        yAxis1.setTitle("Another axis");
        yAxis1.setOpposite(true);
        configuration.addyAxis(yAxis1);

        PlotOptionsSeries opt = new PlotOptionsSeries();
        opt.setShowCheckbox(true);
        opt.setAllowPointSelect(true);

        configuration.setPlotOptions(opt);
        configuration.setTooltip(new Tooltip(false));
        final DataSeries series1 = createDataSeries(0);
        final DataSeries series2 = createDataSeries(20);
        DataSeries series3 = createDataSeries(100);
        series3.get(0).setY(105);
        series3.get(3).setY(95);
        series3.setName("Another axis");
        series3.setyAxis(1);
        firstDataPoint = series1.get(0);
        firstDataPoint.setSelected(true);
        configuration.setSeries(series1, series2, series3);

        chart.drawChart();

        final FlexLayout toggles = createControls();
        FlexLayout eventListeners = addEventListeners();

        chart.setSeriesVisibilityTogglingDisabled(false);
        visibilityToggling.setValue(false);

//        lastEvent.setCaption("Last event");
//        eventDetails.setCaption("Details");
//        historyLayout.setCaption("History");
        VerticalLayout layout = new VerticalLayout();
//        layout.setSpacing(true);
        layout.add(toggles);
        HorizontalLayout chartAndListeners = new HorizontalLayout(chart,
                eventListeners);
        chartAndListeners.setSizeUndefined();
//        chartAndListeners.setSpacing(true);
        layout.add(chartAndListeners);
        layout.add(lastEvent);
        layout.add(eventDetails);
        layout.add(historyLayout);
        add(layout);
    }

    private FlexLayout addEventListeners() {
        eventListeners = new VerticalLayout();
//        eventListeners.setCaption("Event listeners:");

        final ComponentEventListener<ChartClickEvent> listener = event -> logEvent(event);
        addToggleForListener("Chart click", "ChartClick", new ListenerToggle() {

            private Registration registration;

            @Override
            public void add() {
                registration = chart.addChartClickListener(listener);
            }

            @Override
            public void remove() {
                registration.remove();
            }
        });

        final ComponentEventListener<PointClickEvent> pcListener = event -> logEvent(event);
        addToggleForListener("Point click", "PointClick", new ListenerToggle() {

            private Registration registration;

            @Override
            public void add() {
                registration = chart.addPointClickListener(pcListener);
            }

            @Override
            public void remove() {
                registration.remove();
            }
        });

        final ComponentEventListener<SeriesCheckboxClickEvent> cbListener = event -> logEvent(event);
        addToggleForListener("Checkbox click", "CheckboxClick",
                new ListenerToggle() {

                    private Registration registration;

                    @Override
                    public void add() {
                        registration = chart.addCheckBoxClickListener(cbListener);
                    }

                    @Override
                    public void remove() {
                        registration.remove();
                    }
                });

        final ComponentEventListener<SeriesLegendItemClickEvent> legendItemListener = event -> logEvent(event);
        addToggleForListener("Legend item click", "LegendItemClick",
                new ListenerToggle() {

                    private Registration registration;

                    @Override
                    public void add() {
                        registration = chart.addLegendItemClickListener(legendItemListener);
                        visibilityToggling.setValue(true);
                    }

                    @Override
                    public void remove() {
                        registration.remove();
                    }
                });

        final ComponentEventListener<SeriesHideEvent> hideListener = event -> logEvent(event);
        addToggleForListener("Series hide", "SeriesHide", new ListenerToggle() {

            private Registration registration;

            @Override
            public void add() {
                registration = chart.addSeriesHideListener(hideListener);
            }

            @Override
            public void remove() {
                registration.remove();
            }
        });

        final ComponentEventListener<SeriesShowEvent> show = event -> logEvent(event);
        addToggleForListener("Series show", "SeriesShow", new ListenerToggle() {

            private Registration registration;

            @Override
            public void add() {
                registration = chart.addSeriesShowListener(show);
            }

            @Override
            public void remove() {
                registration.remove();
            }
        });

        final ComponentEventListener<PointSelectEvent> selectListener = event -> logEvent(event);
        addToggleForListener("Point select", "PointSelect",
                new ListenerToggle() {

            private Registration registration;

                    @Override
                    public void add() {
                        registration = chart.addPointSelectListener(selectListener);
                    }

                    @Override
                    public void remove() {
                        registration.remove();
                    }
                });

        final ComponentEventListener<PointUnselectEvent> unselectListener = event -> logEvent(event);
        addToggleForListener("Point unselect", "PointUnselect",
                new ListenerToggle() {

            private Registration registration;

                    @Override
                    public void add() {
                        registration = chart.addPointUnselectListener(unselectListener);
                    }

                    @Override
                    public void remove() {
                        registration.remove();
                    }
                });

        return eventListeners;
    }

    private void addToggleForListener(String caption, String id,
                                      final ListenerToggle listenerToggle) {
        final Checkbox checkBox = new Checkbox(caption);
        checkBox.setId(id);
        checkBox.addValueChangeListener(e -> {
            if (checkBox.getValue()) {
                listenerToggle.add();
            } else {
                listenerToggle.remove();
            }
        });
        checkBox.setValue(true);
        eventListeners.add(checkBox);
    }

    private interface ListenerToggle {
        void add();

        void remove();
    }

    private FlexLayout createControls() {
        visibilityToggling = new Checkbox("Disable series visibility toggling");
        visibilityToggling.addValueChangeListener(e ->
                chart.setSeriesVisibilityTogglingDisabled(visibilityToggling
                        .getValue()));

        final Button firstSeriesVisible = new Button("Hide first series");
        firstSeriesVisible.setId("hideFirstSeries");
        firstSeriesVisible.addClickListener(new ComponentEventListener<HasClickListeners.ClickEvent<Button>>() {
            private boolean hideSeries = true;

            @Override
            public void onComponentEvent(HasClickListeners.ClickEvent<Button> buttonClickEvent) {
                Series firstSeries = chart.getConfiguration().getSeries()
                        .get(0);
                ((AbstractSeries) firstSeries).setVisible(!hideSeries);
                hideSeries = !hideSeries;
                String caption = hideSeries ? "Hide first series"
                        : "Show first series";
//                firstSeriesVisible.setCaption(caption);
            }
        });

        Button setExtremes = new Button("Toggle extremes");
        setExtremes.setId("setExtremes");
        setExtremes.addClickListener(new ComponentEventListener<HasClickListeners.ClickEvent<Button>>() {
            private boolean extremesSet;

            @Override
            public void onComponentEvent(HasClickListeners.ClickEvent<Button> buttonClickEvent) {
                if (extremesSet) {
                    chart.getConfiguration().getxAxis().setExtremes(10, 90);
                } else {
                    chart.getConfiguration().getxAxis().setExtremes(20, 80);
                }
                extremesSet = !extremesSet;
            }
        });

        final RadioButtonGroup<Dimension> zoomLevels = new RadioButtonGroup<>();
        zoomLevels.setItems(Dimension.XY, Dimension.X, Dimension.Y);
        zoomLevels.setValue(Dimension.XY);
        zoomLevels.addValueChangeListener(event -> {
            chart.getConfiguration().getChart().setZoomType(zoomLevels.getValue());
            chart.drawChart();
        });

        Button resetHistory = new Button("Reset history");
        resetHistory.addClickListener(event -> {
            lastEvent.setText(null);
            eventDetails.setText(null);
            historyLayout.removeAll();
        });

        HorizontalLayout controls = new HorizontalLayout();
        controls.setId("controls");
//        controls.setSpacing(true);
        controls.add(visibilityToggling);
        controls.add(firstSeriesVisible);
        controls.add(setExtremes);
        controls.add(zoomLevels);
        controls.add(resetHistory);
        return controls;
    }

    private DataSeries createDataSeries(Number yvalue) {
        final DataSeries series = new DataSeries();
        series.add(new DataSeriesItem(20, yvalue));
        series.add(new DataSeriesItem(40, yvalue.intValue() + 10));
        series.add(new DataSeriesItem(60, yvalue.intValue() - 15));
        series.add(new DataSeriesItem(80, yvalue));
        series.setId("" + id);
        series.setName("Test Series " + id);
        ++id;
        return series;
    }

    private void logEvent(Object event) {
        String name = event.getClass().getSimpleName();
        String details = createEventString(event);
        lastEvent.setText(name);
        eventDetails.setText(details);
        Label history = new Label(name + ": " + details + "\n");
        history.setId("event" + eventNumber);
        historyLayout.add(history);
        ++eventNumber;
    }

    private String createEventString(Object event) {
        ObjectMapper mapper = new ObjectMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
                .enable(SerializationFeature.INDENT_OUTPUT)
                .setVisibility(PropertyAccessor.ALL,
                        JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD,
                        JsonAutoDetect.Visibility.ANY);

        try {
            return mapper.writeValueAsString(event);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
