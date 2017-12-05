package com.vaadin.addon.charts;

import com.vaadin.addon.charts.events.domevents.ChartClickEvent;
import com.vaadin.addon.charts.events.domevents.ChartDrillupEvent;
import com.vaadin.addon.charts.events.domevents.ChartSelectionEvent;
import com.vaadin.addon.charts.events.domevents.CheckboxClickEvent;
import com.vaadin.addon.charts.events.domevents.DrilldownEvent;
import com.vaadin.addon.charts.events.domevents.LegendItemClickEvent;
import com.vaadin.addon.charts.events.domevents.PointClickEvent;
import com.vaadin.addon.charts.events.domevents.PointSelectEvent;
import com.vaadin.addon.charts.events.domevents.PointUnselectEvent;
import com.vaadin.addon.charts.events.domevents.SeriesHideEvent;
import com.vaadin.addon.charts.events.domevents.SeriesShowEvent;
import com.vaadin.addon.charts.events.domevents.XAxesExtremesChangeEvent;
import com.vaadin.addon.charts.events.domevents.YAxesExtremesChangeEvent;
import com.vaadin.shared.Registration;
import com.vaadin.ui.event.ComponentEventListener;

public class EventRegistry {
    
    private Chart delegate;
    
    public EventRegistry(Chart delegate) {
        this.delegate = delegate;
    }
    
    /**
     * Adds chart click listener, which will be notified of clicks on the chart
     * area
     *
     * @param listener
     */
    public Registration addChartClickListener(
            ComponentEventListener<ChartClickEvent> listener) {
        return delegate.addListener(ChartClickEvent.class, listener);
    }

    /**
     * Adds chart drillup listener, which will be notified of clicks on the
     * 'Back to previous series' button.
     *
     * @param listener
     */
    public Registration addChartDrillupListener(
            ComponentEventListener<ChartDrillupEvent> listener) {
        return delegate.addListener(ChartDrillupEvent.class, listener);
    }

    /**
     * Adds checkbox click listener, which will be notified when user has
     * clicked a checkbox in the legend
     *
     * @param listener
     */
    public Registration addCheckBoxClickListener(
            ComponentEventListener<CheckboxClickEvent> listener) {
        return delegate.addListener(CheckboxClickEvent.class, listener);
    }

//    /**
//     * Sets the Chart drilldown handler that's responsible for returning the
//     * drilldown series for each drilldown callback when doing async drilldown
//     *
//     * @see DataSeries#addItemWithDrilldown(com.vaadin.addon.charts.model.series.DataSeriesItem)
//     *      addItemWithDrilldown to find out how to enable async drilldown
//     *
//     * @param listener
//     */
//    public Registration addDrilldownListener(
//            ComponentEventListener<DrilldownEvent> listener) {
//        return delegate.addListener(DrilldownEvent.class, listener);
//    }

    /**
     * Adds a point click listener, which will be notified of clicks on the
     * points, bars or columns in the chart
     *
     * @param listener
     */
    public Registration addPointClickListener(
            ComponentEventListener<PointClickEvent> listener) {
        return delegate.addListener(PointClickEvent.class, listener);
    }

    /**
     * Adds a chart selection listener<br />
     * <br />
     * <p>
     * Note that if a chart selection listener is set, default action for
     * selection is prevented. Most commonly this means that client side zoom
     * doesn't work and you are responsible for setting the zoom, etc in the
     * listener implementation.
     *
     * @param listener
     */
    public Registration addChartSelectionListener(
            ComponentEventListener<ChartSelectionEvent> listener) {
        return delegate.addListener(ChartSelectionEvent.class, listener);
    }

    /**
     * Adds a legend item click listener, which will be notified of clicks on
     * the legend's items
     * <p>
     * Note that adding a legend item click listener also disabled the default
     * behaviour to toggle series visibility. If that is not desired, you can
     * enable it again by calling setSeriesVisibilityTogglingDisabled(
     * <code>true</code>)
     *
     * @param listener
     */
    public Registration addLegendItemClickListener(
            ComponentEventListener<LegendItemClickEvent> listener) {
//        setSeriesVisibilityTogglingDisabled(true);
        return delegate.addListener(LegendItemClickEvent.class, listener);
    }

    /**
     * Adds a series hide listener, which will be notified when a series is
     * hidden
     *
     * @param listener
     */
    public Registration addSeriesHideListener(
            ComponentEventListener<SeriesHideEvent> listener) {
        return delegate.addListener(SeriesHideEvent.class, listener);
    }

    /**
     * Adds a series show listener, which will be notified when a series is
     * shown
     *
     * @param listener
     */
    public Registration addSeriesShowListener(
            ComponentEventListener<SeriesShowEvent> listener) {
        return delegate.addListener(SeriesShowEvent.class, listener);
    }

    /**
     * Adds a x axes extremes change listener, which will be notified when an x
     * axis extremes are changed.
     *
     * @param listener
     */
    public Registration addXAxesExtremesChangeListener(
            ComponentEventListener<XAxesExtremesChangeEvent> listener) {
        return delegate.addListener(XAxesExtremesChangeEvent.class, listener);
    }

    /**
     * Adds a y axes extremes change listener, which will be notified when an y
     * axis extremes are changed.
     *
     * @param listener
     */
    public Registration addYAxesExtremesChangeListener(
            ComponentEventListener<YAxesExtremesChangeEvent> listener) {
        return delegate.addListener(YAxesExtremesChangeEvent.class, listener);
    }

    /**
     * Adds a point select listener, which will be notified when an data point
     * is selected.
     *
     * @param listener
     */
    public Registration addPointSelectListener(
            ComponentEventListener<PointSelectEvent> listener) {
        return delegate.addListener(PointSelectEvent.class, listener);
    }

    /**
     * Adds a point unselect listener, which will be notified when an data point
     * is unselected.
     *
     * @param listener
     */
    public Registration addPointUnselectListener(
            ComponentEventListener<PointUnselectEvent> listener) {
        return delegate.addListener(PointUnselectEvent.class, listener);
    }
}
