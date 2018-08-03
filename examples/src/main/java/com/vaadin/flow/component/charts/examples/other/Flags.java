package com.vaadin.flow.component.charts.examples.other;

import com.vaadin.flow.component.charts.AbstractChartExample;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.*;

public class Flags extends AbstractChartExample {

    @Override
    public void initDemo() {
        Chart chart = new Chart(ChartType.AREASPLINE);

        Configuration configuration = chart.getConfiguration();
        configuration.setTitle("Average fruit consumption during one week");

        XAxis xAxis = new XAxis();
        xAxis.setCategories("Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday");
        configuration.addxAxis(xAxis);

        YAxis yAxis = new YAxis();
        yAxis.setTitle("Fruit units");
        configuration.addyAxis(yAxis);

        Tooltip tooltip = new Tooltip();
        tooltip.setShared(true);
        tooltip.setValueSuffix(" units");
        configuration.setTooltip(tooltip);

        configuration.addSeries(new ListSeries("John", 3, 4, 3, 5, 4, 10, 12));

        ListSeries janeSeries = new ListSeries("Jane", 1, 3, 4, 3, 3, 5, 4);
        janeSeries.setId("jane");
        configuration.addSeries(janeSeries);

        DataSeries onSeriesFlags = new DataSeries("On series");
        PlotOptionsFlags onSeriesFlagsOptions = new PlotOptionsFlags();
        onSeriesFlagsOptions.setOnSeries("jane");
        onSeriesFlagsOptions.setShape(FlagShape.SQUAREPIN);
        onSeriesFlags.setPlotOptions(onSeriesFlagsOptions);
        onSeriesFlags.add(new FlagItem(2, "On series"));
        onSeriesFlags.add(new FlagItem(5, "On series"));
        configuration.addSeries(onSeriesFlags);

        DataSeries onAxisFlags = new DataSeries("On axis");
        onAxisFlags.setPlotOptions(new PlotOptionsFlags());
        onAxisFlags.add(new FlagItem(3, "On axis"));
        configuration.addSeries(onAxisFlags);

        add(chart);
    }
}
