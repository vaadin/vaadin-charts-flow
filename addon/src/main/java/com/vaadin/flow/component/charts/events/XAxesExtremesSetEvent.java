package com.vaadin.flow.component.charts.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.component.charts.Chart;

/**
 * The XAxesExtremesSetEvent class stores data for set extremes events
 * on the x axes of the chart.
 */
@DomEvent("xaxes-extremes-set")
public class XAxesExtremesSetEvent extends ComponentEvent<Chart> {

    private double minimum;
    private double maximum;

    public XAxesExtremesSetEvent(Chart source, boolean fromClient,
            @EventData("event.detail.originalEvent.min") double min,
            @EventData("event.detail.originalEvent.max") double max) {
        super(source, fromClient);
        this.minimum = min;
        this.maximum = max;
    }

	public double getMinimum() {
		return minimum;
	}

	public double getMaximum() {
        return maximum;
    }
}
