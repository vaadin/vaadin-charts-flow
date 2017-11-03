package com.vaadin.addon.charts.examples;

import com.vaadin.addon.charts.AbstractVaadinChartExample;
import com.vaadin.addon.charts.VaadinChart;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.ListSeries;
import com.vaadin.addon.charts.model.XAxis;
import com.vaadin.addon.charts.model.YAxis;

public class ColumnChart extends AbstractVaadinChartExample {

    @Override
    protected VaadinChart getChart() {
        final VaadinChart chart = new VaadinChart();

        Configuration configuration = chart.getConfiguration();
        configuration.setTitle("Example Column Chart");
        chart.getConfiguration().getChart().setType(ChartType.COLUMN);

        configuration.addSeries(new ListSeries("Tokyo", 20, 12, 34, 23, 65, 8, 4, 7, 76, 19, 20, 8));
        configuration.addSeries(new ListSeries("Miami", 34, 29, 23, 65, 8, 4, 7, 7, 59, 8, 9, 19));

        XAxis x = new XAxis();
        x.setCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec");
        configuration.addxAxis(x);

        YAxis y = new YAxis();
        y.setMin(0);
        y.setTitle("Rainfall (mm)");
        configuration.addyAxis(y);

        return chart;
    }
}
