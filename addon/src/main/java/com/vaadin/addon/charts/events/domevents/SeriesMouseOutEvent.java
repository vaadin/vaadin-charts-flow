package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("series-mouse-out")
public class SeriesMouseOutEvent extends ComponentEvent<Chart> {

    public SeriesMouseOutEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
