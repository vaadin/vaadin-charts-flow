package com.vaadin.addon.charts.examples.basic;

import com.vaadin.addon.charts.AbstractVaadinChartExample;
import com.vaadin.addon.charts.VaadinChart;

public class EmptyChart extends AbstractVaadinChartExample {

    @Override
    protected VaadinChart getChart() {
        final VaadinChart chart = new VaadinChart();
        return chart;
    }
}
