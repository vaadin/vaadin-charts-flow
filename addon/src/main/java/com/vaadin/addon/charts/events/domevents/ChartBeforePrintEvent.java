package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("chart-before-print")
public class ChartBeforePrintEvent extends ComponentEvent<Chart> {

    public ChartBeforePrintEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}

