package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("chart-drillupall")
public class ChartDrillupAllEvent extends ComponentEvent<Chart> {

    public ChartDrillupAllEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
