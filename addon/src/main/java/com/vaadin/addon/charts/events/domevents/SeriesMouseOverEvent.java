package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

@DomEvent("series-mouse-over")
public class SeriesMouseOverEvent extends ComponentEvent<Chart> {

    public SeriesMouseOverEvent(Chart source, boolean fromClient) {
        super(source, fromClient);
    }
}
