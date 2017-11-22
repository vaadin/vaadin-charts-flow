package com.vaadin.addon.charts.examples.basic;

import com.vaadin.addon.charts.AbstractChartExample;
import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.SkipFromDemo;

@SkipFromDemo
public class EmptyChart extends AbstractChartExample {

    @Override
    public void initDemo() {
        add(new Chart());
    }
}
