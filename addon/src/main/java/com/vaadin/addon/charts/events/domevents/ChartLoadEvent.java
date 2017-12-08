package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("chart-load")
public class ChartLoadEvent extends ComponentEvent<Chart> {

    public ChartLoadEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
