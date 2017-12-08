/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2014 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */
package com.vaadin.addon.charts;
import com.vaadin.addon.charts.events.ConfigurationChangeListener;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.DataSeries;
import com.vaadin.addon.charts.model.DataSeriesItem;
import com.vaadin.addon.charts.util.ChartSerialization;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.event.AttachEvent;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.stream.Collectors.toList;

@Tag("vaadin-chart")
@HtmlImport("frontend://bower_components/vaadin-charts/vaadin-chart.html")
public class Chart extends Component {

    private Configuration configuration;
    private EventRegistry eventRegistry;
    private final JreJsonFactory jsonFactory = new JreJsonFactory();
    private final ConfigurationChangeListener changeListener = new ProxyChangeForwarder(
            this, jsonFactory);

    /**
     * Creates a new chart with default configuration
     */
    public Chart() {
        configuration = new Configuration();
        eventRegistry = new EventRegistry(this);

//        eventRegistry.addPointClickListener(e -> {
//            // Tested on BasicLineWithCallouts example with mouse tracking and point select enabled.
//            System.out.printf("Point clicked! X=%d, Y=%d, Category=%s, Value=%.2f, Series=%s, PointIndex=%d\n",
//                    e.getAbsoluteX(), e.getAbsoluteY(), e.getCategory(),
//                    e.getValue(), configuration.getSeries().get(e.getSeriesItemIndex()).getName(), e.getPointIndex());
//            DataSeries series = (DataSeries) configuration.getSeries().get(e.getSeriesItemIndex());
////            series.remove(series.get(e.getPointIndex()));
//            DataSeriesItem dataSeriesItem = series.get(e.getPointIndex());
//            dataSeriesItem.setY(30 * Math.random());
//            series.update(dataSeriesItem);
//        });
//        eventRegistry.addPointMouseOutListener(e -> {
//            System.out.printf("Point out! Category=%s, Value=%.2f, Series=%s, PointIndex=%d\n",
//                    e.getCategory(), e.getValue(), configuration.getSeries().get(e.getSeriesItemIndex()).getName(), e.getPointIndex());
//        });
//        eventRegistry.addPointMouseOverListener(e -> {
//            System.out.printf("Point over! Category=%s, Value=%.2f, Series=%s, PointIndex=%d\n",
//                    e.getCategory(), e.getValue(), configuration.getSeries().get(e.getSeriesItemIndex()).getName(), e.getPointIndex());
//        });
//        eventRegistry.addPointRemoveListener(e -> {
//            System.out.printf("Point remove! Category=%s, Value=%.2f, Series=%s, PointIndex=%d\n",
//                    e.getCategory(),
//                    e.getValue(), configuration.getSeries().get(e.getSeriesItemIndex()).getName(), e.getPointIndex());
//        });
//        eventRegistry.addPointUpdateListener(e -> {
//            System.out.printf("Point update! Category=%s, OldValue=%.2f, NewValue=%.2f, Series=%s, PointIndex=%d\n",
//                    e.getCategory(), e.getOldValue(), e.getNewValue(),
//                    configuration.getSeries().get(e.getSeriesItemIndex()).getName(), e.getPointIndex());
//        });
//        eventRegistry.addPointSelectListener(e -> {
////                 Mouse tracking must not be disabled for selection to work
////                 plotOptions.setEnableMouseTracking(true); // True by default
//            System.out.printf("Point selected! Series=%s, Category=%s, Value=%.2f, PointIndex=%d\n",
//                    configuration.getSeries().get(e.getSeriesItemIndex()).getName(),
//                    e.getCategory(), e.getValue(), e.getPointIndex());
//        });
//        eventRegistry.addPointUnselectListener(e -> {
////                 Mouse tracking must not be disabled for selection to work
////                 plotOptions.setEnableMouseTracking(true); // True by default
//            System.out.printf("Point unselected! Series=%s, Category=%s, Value=%.2f, PointIndex=%d\n",
//                    configuration.getSeries().get(e.getSeriesItemIndex()).getName(),
//                    e.getCategory(), e.getValue(), e.getPointIndex());
//        });

//        eventRegistry.addChartBeforePrintListener(e -> System.out.println("Before print!"));
//        eventRegistry.addChartAfterPrintListener(e -> System.out.println("After print!"));
//        eventRegistry.addChartLoadListener(e -> System.out.println("Load!"));
//        eventRegistry.addChartRedrawListener(e -> System.out.println("Redraw!"));
//        eventRegistry.addChartDrillupListener(e -> System.out.println("Chart drilled up!"));
//        eventRegistry.addChartDrillupAllListener(e -> System.out.println("Chart drilled up ALL!"));
//        eventRegistry.addDrilldownListener(e -> {
//            DataSeries series = (DataSeries) configuration.getSeries().get(e.getItemIndex());
//            System.out.printf("Drilldown! Category=%s, Drilldown=%s, Value=%.2f, Series=%s, SeriesItem=%s\n",
//                    e.getCategory(), e.getDrilldown(), e.getOldValue(),
//                    series.getName(), series.getData().get(e.getPointIndex()).getName());
//        });
        eventRegistry.addChartAddSeriesListener(e -> System.out.printf("Series added! Name=%s, Data=%s\n", e.getName(),
                Arrays.asList(e.getData()).toString()));
        eventRegistry.addChartClickListener(e -> {
            System.out.printf("Chart clicked!\n");

//            Test addPoint
//            double y1 = 30 * Math.random(), y2 = 30 * Math.random();
//            int x1 = (int) (1000 * Math.random()), x2 = (int) (1000 * Math.random());
//            ((DataSeries) configuration.getSeries().get(0)).add(new DataSeriesItem("Month" + x1, y1), true, true);
//            ((DataSeries) configuration.getSeries().get(1)).add(new DataSeriesItem("Month" + x2, y2), true, true);

//            Test addSeries
            DataSeries series = new DataSeries("City " + (int) (1000 * Math.random()));
            series.setData(DoubleStream.generate(() -> 30 * Math.random()).limit(12).boxed().map(n -> (Number) n).toArray(Number[]::new));
            configuration.addSeries(series);
        });
//        configuration.getChart().setZoomType(Dimension.XY);
//        eventRegistry.addChartSelectionListener(e -> {
//            System.out.printf("Chart selected! X=%.2f, Y=%.2f, X2=%.2f, Y2=%.2f\n",
//                    e.getSelectionStart(), e.getValueStart(), e.getSelectionEnd(), e.getValueEnd());
//        });
    }

    /**
     * Creates a new chart with the given type
     *
     * @see #Chart()
     * @param type
     */
    public Chart(ChartType type) {
        this();
        getConfiguration().getChart().setType(type);
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);

        attachEvent.getUI().beforeClientResponse(this, () -> {
            drawChart();
            if (configuration != null) {
                // Start listening to data series events once the chart has been
                // drawn.
                configuration.addChangeListener(changeListener);
            }
        });
    }

    public EventRegistry getEventRegistry() {
        return eventRegistry;
    }

    /**
     * Draws a chart with the given configuration as a starting point.
     *
     * @see #drawChart(boolean)
     */
    public void drawChart() {
        drawChart(false);
    }

    /**
     * Draws a chart with the given configuration as a starting point.
     * <p>
     * Note that you don't need to call this method if {@link Configuration} is
     * ready before element is attached.
     * </p>
     *
     * @see #getConfiguration()
     * @param resetConfiguration
     *            defines whether the chart should be redrawn or not
     */
    public void drawChart(boolean resetConfiguration) {
        final JsonObject configurationNode = jsonFactory
                .parse(ChartSerialization.toJSON(configuration));

        getElement().callFunction("update", configurationNode,
                resetConfiguration);
    }

    /**
     * Determines if the chart is a timeline chart or a normal chart.
     *
     * @param timeline
     *            true for timeline chart
     */
    public void setTimeline(Boolean timeline) {
        getElement().setProperty("timeline", timeline);
    }

    /**
     * @return the chart configuration that is used for this chart
     */
    public Configuration getConfiguration() {
        return configuration;
    }

}
