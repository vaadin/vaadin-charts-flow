package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("series-after-animate")
public class SeriesAfterAnimateEvent extends ComponentEvent<Chart> {

    public SeriesAfterAnimateEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
