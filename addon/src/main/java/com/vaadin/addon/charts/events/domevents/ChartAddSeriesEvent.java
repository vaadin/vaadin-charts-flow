package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;
import elemental.json.JsonArray;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@DomEvent("chart-add-series")
public class ChartAddSeriesEvent extends ComponentEvent<Chart> {

    private final String name;
    private final Number[] data;

    public ChartAddSeriesEvent(Chart source, boolean fromClient,
                               @EventData("event.detail.originalEvent.options.name") String name,
                               @EventData("event.detail.originalEvent.options.data") JsonArray data) {
        super(source, fromClient);
        this.name = name;
        this.data = new Number[data.length()];
        for (int a = 0; a < data.length(); a++) {
            this.data[a] = data.getObject(a).getNumber("y");
        }
    }

    public String getName() {
        return name;
    }

    public Number[] getData() {
        return data;
    }
}
