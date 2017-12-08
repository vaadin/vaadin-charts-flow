package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.DataSeriesItem;
import com.vaadin.addon.charts.model.Series;
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
public class DrilldownEvent extends ComponentEvent<Chart> {

    private final String drilldown;
    private final String category;
    private final double value;
    private final int pointIndex;

    private Series series;
    private DataSeriesItem item;
    private int itemIndex;

    /**
     * Construct a ChartDrilldownEvent
     * 
     * @param source
     * @param series
     */
    public DrilldownEvent(Chart source, boolean fromClient,
                          @EventData("event.detail.originalEvent.point.drilldown") String drilldown,
                          @EventData("event.detail.originalEvent.point.category") String category,
                          @EventData("event.detail.originalEvent.point.y") double value,
                          @EventData("event.detail.originalEvent.point.index") int pointIndex,
                          @EventData("event.detail.originalEvent.point.series.index") int seriesItemIndex) {
        super(source, fromClient);

        this.drilldown = drilldown;
        this.category = category;
        this.value = value;
        this.pointIndex = pointIndex;
        itemIndex = seriesItemIndex;
    }

    /**
     * Returns the {@link #getItem()} series.
     * 
     * @return
     */
    public Series getSeries() {
        return series;
    }

    /**
     * Returns the item that was clicked
     * 
     * @return
     */
    public DataSeriesItem getItem() {
        return item;
    }

    /**
     * Returns the index of {@link #getItem()} in {@link #getSeries()}.
     * 
     * @return
     */
    public int getItemIndex() {
        return itemIndex;
    }

    public String getDrilldown() {
        return drilldown;
    }

    public String getCategory() {
        return category;
    }

    public double getValue() {
        return value;
    }

    public int getPointIndex() {
        return pointIndex;
    }
}
