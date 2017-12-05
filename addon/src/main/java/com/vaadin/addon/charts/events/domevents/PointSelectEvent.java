package com.vaadin.addon.charts.events.domevents;

/*
 * #%L
 * Vaadin Charts Addon
 * %%
 * Copyright (C) 2012 - 2015 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.Series;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;

/**
 * The PointClickEvent class stores data for select events on the points of the
 * chart.
 */
@DomEvent("point-select")
public class PointSelectEvent extends ComponentEvent<Chart> {

    public PointSelectEvent(Chart source, boolean fromClient,
                            Series series,
                            String category,
                            int pointIndex) {
        super(source, fromClient);
    }
}
