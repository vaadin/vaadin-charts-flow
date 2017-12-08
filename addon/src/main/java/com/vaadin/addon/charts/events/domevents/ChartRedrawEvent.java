package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("chart-redraw")
public class ChartRedrawEvent extends ComponentEvent<Chart> {

    public ChartRedrawEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
