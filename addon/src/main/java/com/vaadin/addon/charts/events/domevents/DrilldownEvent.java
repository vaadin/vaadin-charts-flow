package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2014 Vaadin Ltd
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

/**
 * The DrilldownEvent class stores information on click events in drilldown
 * points
 */
@DomEvent("chart-drilldown")
public class DrilldownEvent extends ComponentEvent<Chart> implements HasItem {

    private final String drilldown;
    private final String category;
    private final double value;
    private final int pointIndex;
    private int seriesIndex;

    /**
     * Construct a ChartDrilldownEvent
     *
     * @param source
     */
    public DrilldownEvent(Chart source, boolean fromClient,
                          @EventData("event.detail.originalEvent.point.drilldown") String drilldown,
                          @EventData("event.detail.originalEvent.point.category") String category,
                          @EventData("event.detail.originalEvent.point.y") double value,
                          @EventData("event.detail.originalEvent.point.index") int pointIndex,
                          @EventData("event.detail.originalEvent.point.series.index") int seriesIndex) {
        super(source, fromClient);

        this.drilldown = drilldown;
        this.category = category;
        this.value = value;
        this.pointIndex = pointIndex;
        this.seriesIndex = seriesIndex;
    }

    /**
     * Gets the name of the drilldown
     *
     * @return
     */
    public String getDrilldown() {
        return drilldown;
    }

    /**
     * Gets the category of the drilldown
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    @Override
    public int getSeriesItemIndex() {
        return seriesIndex;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public int getItemIndex() {
        return pointIndex;
    }
}
