package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("chart-drillup")
public class ChartDrillupEvent extends ComponentEvent<Chart> {

    public ChartDrillupEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
