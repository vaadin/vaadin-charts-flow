package com.vaadin.addon.charts;

import com.vaadin.addon.charts.events.domevents.ChartAddSeriesEvent;
import com.vaadin.addon.charts.events.domevents.ChartAfterPrintEvent;
import com.vaadin.addon.charts.events.domevents.ChartBeforePrintEvent;
import com.vaadin.addon.charts.events.domevents.ChartClickEvent;
import com.vaadin.addon.charts.events.domevents.ChartDrillupAllEvent;
import com.vaadin.addon.charts.events.domevents.ChartDrillupEvent;
import com.vaadin.addon.charts.events.domevents.ChartLoadEvent;
import com.vaadin.addon.charts.events.domevents.ChartRedrawEvent;
import com.vaadin.addon.charts.events.domevents.ChartSelectionEvent;
import com.vaadin.addon.charts.events.domevents.CheckboxClickEvent;
import com.vaadin.addon.charts.events.domevents.DrilldownEvent;
import com.vaadin.addon.charts.events.domevents.LegendItemClickEvent;
import com.vaadin.addon.charts.events.domevents.PointClickEvent;
import com.vaadin.addon.charts.events.domevents.PointMouseOutEvent;
import com.vaadin.addon.charts.events.domevents.PointMouseOverEvent;
import com.vaadin.addon.charts.events.domevents.PointRemoveEvent;
import com.vaadin.addon.charts.events.domevents.PointSelectEvent;
import com.vaadin.addon.charts.events.domevents.PointUnselectEvent;
import com.vaadin.addon.charts.events.domevents.PointUpdateEvent;
import com.vaadin.addon.charts.events.domevents.SeriesHideEvent;
import com.vaadin.addon.charts.events.domevents.SeriesShowEvent;
import com.vaadin.addon.charts.model.DataSeries;
import com.vaadin.addon.charts.model.DataSeriesItem;
import com.vaadin.shared.Registration;
import com.vaadin.ui.event.ComponentEventListener;

public class EventRegistry {
    
    private Chart delegate;
    
    public EventRegistry(Chart delegate) {
        this.delegate = delegate;
    }

    public Registration addChartAddSeriesListener(
            ComponentEventListener<ChartAddSeriesEvent> listener) {
        return delegate.addListener(ChartAddSeriesEvent.class, listener);
    }

    public Registration addChartAfterPrintListener(
            ComponentEventListener<ChartAfterPrintEvent> listener) {
        return delegate.addListener(ChartAfterPrintEvent.class, listener);
    }

    public Registration addChartBeforePrintListener(
            ComponentEventListener<ChartBeforePrintEvent> listener) {
        return delegate.addListener(ChartBeforePrintEvent.class, listener);
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
     * Adds chart drillupall listener, which will be notified after all the series
     * have been drilled up in a chart with multiple drilldown series.
     *
     * @param listener
     */
    public Registration addChartDrillupAllListener(
            ComponentEventListener<ChartDrillupAllEvent> listener) {
        return delegate.addListener(ChartDrillupAllEvent.class, listener);
    }

    public Registration addChartLoadListener(
            ComponentEventListener<ChartLoadEvent> listener) {
        return delegate.addListener(ChartLoadEvent.class, listener);
    }

    public Registration addChartRedrawListener(
            ComponentEventListener<ChartRedrawEvent> listener) {
        return delegate.addListener(ChartRedrawEvent.class, listener);
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

    /**
     * Sets the Chart drilldown handler that's responsible for returning the
     * drilldown series for each drilldown callback when doing async drilldown
     *
     * @see DataSeries#addItemWithDrilldown(DataSeriesItem)
     *      addItemWithDrilldown to find out how to enable async drilldown
     *
     * @param listener
     */
    public Registration addDrilldownListener(
            ComponentEventListener<DrilldownEvent> listener) {
        return delegate.addListener(DrilldownEvent.class, listener);
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
        //setSeriesVisibilityTogglingDisabled(true);
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
     * Adds a point click listener, which will be notified of clicks on the
     * points, bars or columns in the chart
     *
     * @param listener
     */
    public Registration addPointClickListener(
            ComponentEventListener<PointClickEvent> listener) {
        return delegate.addListener(PointClickEvent.class, listener);
    }

    public Registration addPointMouseOutListener(
            ComponentEventListener<PointMouseOutEvent> listener) {
        return delegate.addListener(PointMouseOutEvent.class, listener);
    }

    public Registration addPointMouseOverListener(
            ComponentEventListener<PointMouseOverEvent> listener) {
        return delegate.addListener(PointMouseOverEvent.class, listener);
    }

    public Registration addPointRemoveListener(
            ComponentEventListener<PointRemoveEvent> listener) {
        return delegate.addListener(PointRemoveEvent.class, listener);
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

    public Registration addPointUpdateListener(
            ComponentEventListener<PointUpdateEvent> listener) {
        return delegate.addListener(PointUpdateEvent.class, listener);
    }
}
