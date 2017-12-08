package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("series-click")
public class SeriesClickEvent extends ComponentEvent<Chart> {

    public SeriesClickEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
