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
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

/**
 * ShowSeriesEvent when the series is shown
 */
@DomEvent("series-show")
public class SeriesShowEvent extends ComponentEvent<Chart> {

    private final int seriesItemIndex;

    public SeriesShowEvent(Chart source, boolean fromClient,
                           @EventData("event.detail.originalEvent.target.index") int seriesItemIndex) {
        super(source, fromClient);
        this.seriesItemIndex = seriesItemIndex;
    }

    public int getSeriesItemIndex() {
        return seriesItemIndex;
    }
}
