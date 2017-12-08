package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("chart-after-print")
public class ChartAfterPrintEvent extends ComponentEvent<Chart> {

    public ChartAfterPrintEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
