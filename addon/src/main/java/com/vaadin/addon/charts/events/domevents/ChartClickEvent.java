package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

@DomEvent("chart-click")
public class ChartClickEvent extends ComponentEvent<Chart> {

    private final int x;
    private final int y;

    public ChartClickEvent(Chart source, boolean fromClient,
                           @EventData("event.detail.originalEvent.chartX") int x,
                           @EventData("event.detail.originalEvent.chartY") int y) {
        super(source, fromClient);

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
