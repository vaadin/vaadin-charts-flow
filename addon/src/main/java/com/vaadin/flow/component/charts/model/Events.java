package com.vaadin.flow.component.charts.model;

/*-
 * #%L
 * Vaadin Charts for Flow
 * %%
 * Copyright (C) 2014 - 2018 Vaadin Ltd
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

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Events extends AbstractConfigurationObject {

	private String _fn_addSeries;
	private String _fn_afterAnimate;
	private String _fn_afterBreaks;
	private String _fn_afterPrint;
	private String _fn_afterSetExtremes;
	private String _fn_beforePrint;
	private String _fn_checkboxClick;
	private String _fn_click;
	private String _fn_drilldown;
	private String _fn_drillup;
	private String _fn_drillupall;
	private String _fn_hide;
	private String _fn_legendItemClick;
	private String _fn_load;
	private String _fn_mouseOut;
	private String _fn_mouseOver;
	private String _fn_pointBreak;
	private String _fn_pointInBreak;
	private String _fn_redraw;
	private String _fn_remove;
	private String _fn_render;
	private String _fn_select;
	private String _fn_selection;
	private String _fn_setExtremes;
	private String _fn_show;
	private String _fn_unselect;
	private String _fn_update;

	public Events() {
	}

	/**
	 * @see #set_fn_addSeries(String)
	 */
	public String getAddSeries() {
		return _fn_addSeries;
	}

	/**
	 * Fires when a series is added to the chart after load time, using the
	 * `addSeries` method. One parameter, `event`, is passed to the function,
	 * containing common event information. Through `event.options` you can
	 * access the series options that was passed to the `addSeries` method.
	 * Returning false prevents the series from being added.
	 */
	public void setAddSeries(String _fn_addSeries) {
		this._fn_addSeries = _fn_addSeries;
	}

	/**
	 * @see #set_fn_afterAnimate(String)
	 */
	public String getAfterAnimate() {
		return _fn_afterAnimate;
	}

	/**
	 * Fires after the series has finished its initial animation, or in case
	 * animation is disabled, immediately as the series is displayed.
	 */
	public void setAfterAnimate(String _fn_afterAnimate) {
		this._fn_afterAnimate = _fn_afterAnimate;
	}

	/**
	 * @see #set_fn_afterBreaks(String)
	 */
	public String getAfterBreaks() {
		return _fn_afterBreaks;
	}

	/**
	 * An event fired after the breaks have rendered.
	 */
	public void setAfterBreaks(String _fn_afterBreaks) {
		this._fn_afterBreaks = _fn_afterBreaks;
	}

	/**
	 * @see #set_fn_afterPrint(String)
	 */
	public String getAfterPrint() {
		return _fn_afterPrint;
	}

	/**
	 * Fires after a chart is printed through the context menu item or the
	 * `Chart.print` method. Requires the exporting module.
	 */
	public void setAfterPrint(String _fn_afterPrint) {
		this._fn_afterPrint = _fn_afterPrint;
	}

	/**
	 * @see #set_fn_afterSetExtremes(String)
	 */
	public String getAfterSetExtremes() {
		return _fn_afterSetExtremes;
	}

	/**
	 * As opposed to the `setExtremes` event, this event fires after the final
	 * min and max values are computed and corrected for `minRange`.
	 * 
	 * Fires when the minimum and maximum is set for the axis, either by calling
	 * the `.setExtremes()` method or by selecting an area in the chart. One
	 * parameter, `event`, is passed to the function, containing common event
	 * information. The new user set minimum and maximum values can be found by
	 * `event.min` and `event.max`. These reflect the axis minimum and maximum
	 * in axis values. The actual data extremes are found in `event.dataMin` and
	 * `event.dataMax`.
	 */
	public void setAfterSetExtremes(String _fn_afterSetExtremes) {
		this._fn_afterSetExtremes = _fn_afterSetExtremes;
	}

	/**
	 * @see #set_fn_beforePrint(String)
	 */
	public String getBeforePrint() {
		return _fn_beforePrint;
	}

	/**
	 * Fires before a chart is printed through the context menu item or the
	 * `Chart.print` method. Requires the exporting module.
	 */
	public void setBeforePrint(String _fn_beforePrint) {
		this._fn_beforePrint = _fn_beforePrint;
	}

	/**
	 * @see #set_fn_checkboxClick(String)
	 */
	public String getCheckboxClick() {
		return _fn_checkboxClick;
	}

	/**
	 * Fires when the checkbox next to the series' name in the legend is
	 * clicked. One parameter, `event`, is passed to the function. The state of
	 * the checkbox is found by `event.checked`. The checked item is found by
	 * `event.item`. Return `false` to prevent the default action which is to
	 * toggle the select state of the series.
	 */
	public void setCheckboxClick(String _fn_checkboxClick) {
		this._fn_checkboxClick = _fn_checkboxClick;
	}

	/**
	 * @see #set_fn_click(String)
	 */
	public String getClick() {
		return _fn_click;
	}

	/**
	 * Fires when the series is clicked. One parameter, `event`, is passed to
	 * the function, containing common event information. Additionally,
	 * `event.point` holds a pointer to the nearest point on the graph.
	 */
	public void setClick(String _fn_click) {
		this._fn_click = _fn_click;
	}

	/**
	 * @see #set_fn_drilldown(String)
	 */
	public String getDrilldown() {
		return _fn_drilldown;
	}

	/**
	 * Fires when a drilldown point is clicked, before the new series is added.
	 * This event is also utilized for async drilldown, where the seriesOptions
	 * are not added by option, but rather loaded async. Note that when clicking
	 * a category label to trigger multiple series drilldown, one `drilldown`
	 * event is triggered per point in the category. Event arguments:
	 * <dl>
	 * <dt>`category`</dt>
	 * <dd>If a category label was clicked, which index.</dd>
	 * <dt>`point`</dt>
	 * <dd>The originating point.</dd>
	 * <dt>`originalEvent`</dt>
	 * <dd>The original browser event (usually click) that triggered the
	 * drilldown.</dd>
	 * <dt>`points`</dt>
	 * <dd>If a category label was clicked, this array holds all points
	 * corresponing to the category.</dd>
	 * <dt>`seriesOptions`</dt>
	 * <dd>Options for the new series</dd>
	 * </dl>
	 */
	public void setDrilldown(String _fn_drilldown) {
		this._fn_drilldown = _fn_drilldown;
	}

	/**
	 * @see #set_fn_drillup(String)
	 */
	public String getDrillup() {
		return _fn_drillup;
	}

	/**
	 * Fires when drilling up from a drilldown series.
	 */
	public void setDrillup(String _fn_drillup) {
		this._fn_drillup = _fn_drillup;
	}

	/**
	 * @see #set_fn_drillupall(String)
	 */
	public String getDrillupall() {
		return _fn_drillupall;
	}

	/**
	 * In a chart with multiple drilldown series, this event fires after all the
	 * series have been drilled up.
	 */
	public void setDrillupall(String _fn_drillupall) {
		this._fn_drillupall = _fn_drillupall;
	}

	/**
	 * @see #set_fn_hide(String)
	 */
	public String getHide() {
		return _fn_hide;
	}

	/**
	 * Fires when the series is hidden after chart generation time, either by
	 * clicking the legend item or by calling `.hide()`.
	 */
	public void setHide(String _fn_hide) {
		this._fn_hide = _fn_hide;
	}

	/**
	 * @see #set_fn_legendItemClick(String)
	 */
	public String getLegendItemClick() {
		return _fn_legendItemClick;
	}

	/**
	 * Fires when the legend item belonging to the series is clicked. One
	 * parameter, `event`, is passed to the function. The default action is to
	 * toggle the visibility of the series. This can be prevented by returning
	 * `false` or calling `event.preventDefault()`.
	 */
	public void setLegendItemClick(String _fn_legendItemClick) {
		this._fn_legendItemClick = _fn_legendItemClick;
	}

	/**
	 * @see #set_fn_load(String)
	 */
	public String getLoad() {
		return _fn_load;
	}

	/**
	 * Fires when the chart is finished loading. Since v4.2.2, it also waits for
	 * images to be loaded, for example from point markers. One parameter,
	 * `event`, is passed to the function, containing common event information.
	 * There is also a second parameter to the chart constructor where a
	 * callback function can be passed to be executed on chart.load.
	 */
	public void setLoad(String _fn_load) {
		this._fn_load = _fn_load;
	}

	/**
	 * @see #set_fn_mouseOut(String)
	 */
	public String getMouseOut() {
		return _fn_mouseOut;
	}

	/**
	 * Fires when the mouse leaves the graph. One parameter, `event`, is passed
	 * to the function, containing common event information. If the
	 * [stickyTracking](#plotOptions.series) option is true, `mouseOut` doesn't
	 * happen before the mouse enters another graph or leaves the plot area.
	 */
	public void setMouseOut(String _fn_mouseOut) {
		this._fn_mouseOut = _fn_mouseOut;
	}

	/**
	 * @see #set_fn_mouseOver(String)
	 */
	public String getMouseOver() {
		return _fn_mouseOver;
	}

	/**
	 * Fires when the mouse enters the graph. One parameter, `event`, is passed
	 * to the function, containing common event information.
	 */
	public void setMouseOver(String _fn_mouseOver) {
		this._fn_mouseOver = _fn_mouseOver;
	}

	/**
	 * @see #set_fn_pointBreak(String)
	 */
	public String getPointBreak() {
		return _fn_pointBreak;
	}

	/**
	 * An event fired when a break from this axis occurs on a point.
	 */
	public void setPointBreak(String _fn_pointBreak) {
		this._fn_pointBreak = _fn_pointBreak;
	}

	/**
	 * @see #set_fn_pointInBreak(String)
	 */
	public String getPointInBreak() {
		return _fn_pointInBreak;
	}

	/**
	 * An event fired when a point falls inside a break from this axis.
	 */
	public void setPointInBreak(String _fn_pointInBreak) {
		this._fn_pointInBreak = _fn_pointInBreak;
	}

	/**
	 * @see #set_fn_redraw(String)
	 */
	public String getRedraw() {
		return _fn_redraw;
	}

	/**
	 * Fires when the chart is redrawn, either after a call to chart.redraw() or
	 * after an axis, series or point is modified with the `redraw` option set
	 * to true. One parameter, `event`, is passed to the function, containing
	 * common event information.
	 */
	public void setRedraw(String _fn_redraw) {
		this._fn_redraw = _fn_redraw;
	}

	/**
	 * @see #set_fn_remove(String)
	 */
	public String getRemove() {
		return _fn_remove;
	}

	/**
	 * Fires when the point is removed using the `.remove()` method. One
	 * parameter, `event`, is passed to the function. Returning `false` cancels
	 * the operation.
	 */
	public void setRemove(String _fn_remove) {
		this._fn_remove = _fn_remove;
	}

	/**
	 * @see #set_fn_render(String)
	 */
	public String getRender() {
		return _fn_render;
	}

	/**
	 * Fires after initial load of the chart (directly after the `load` event),
	 * and after each redraw (directly after the `redraw` event).
	 */
	public void setRender(String _fn_render) {
		this._fn_render = _fn_render;
	}

	/**
	 * @see #set_fn_select(String)
	 */
	public String getSelect() {
		return _fn_select;
	}

	/**
	 * Fires when the point is selected either programmatically or following a
	 * click on the point. One parameter, `event`, is passed to the function.
	 * Returning `false` cancels the operation.
	 */
	public void setSelect(String _fn_select) {
		this._fn_select = _fn_select;
	}

	/**
	 * @see #set_fn_selection(String)
	 */
	public String getSelection() {
		return _fn_selection;
	}

	/**
	 * Fires when an area of the chart has been selected. Selection is enabled
	 * by setting the chart's zoomType. One parameter, `event`, is passed to the
	 * function, containing common event information. The default action for the
	 * selection event is to zoom the chart to the selected area. It can be
	 * prevented by calling `event.preventDefault()`. Information on the
	 * selected area can be found through `event.xAxis` and `event.yAxis`, which
	 * are arrays containing the axes of each dimension and each axis' min and
	 * max values. The primary axes are `event.xAxis[0]` and `event.yAxis[0]`.
	 * Remember the unit of a datetime axis is milliseconds since 1970-01-01
	 * 00:00:00.
	 * 
	 * <pre>
	 * selection: function(event) {
	 * 	    // log the min and max of the primary, datetime x-axis
	 * 	    console.log(
	 * 	        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),
	 * 	        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max)
	 * 	    );
	 * 	    // log the min and max of the y axis
	 * 	    console.log(event.yAxis[0].min, event.yAxis[0].max);
	 * 	}
	 * </pre>
	 */
	public void setSelection(String _fn_selection) {
		this._fn_selection = _fn_selection;
	}

	/**
	 * @see #set_fn_setExtremes(String)
	 */
	public String getSetExtremes() {
		return _fn_setExtremes;
	}

	/**
	 * Fires when the minimum and maximum is set for the axis, either by calling
	 * the `.setExtremes()` method or by selecting an area in the chart. One
	 * parameter, `event`, is passed to the function, containing common event
	 * information. The new user set minimum and maximum values can be found by
	 * `event.min` and `event.max`. These reflect the axis minimum and maximum
	 * in data values. When an axis is zoomed all the way out from the
	 * "Reset zoom" button, `event.min` and `event.max` are null, and the new
	 * extremes are set based on `this.dataMin` and `this.dataMax`.
	 */
	public void setSetExtremes(String _fn_setExtremes) {
		this._fn_setExtremes = _fn_setExtremes;
	}

	/**
	 * @see #set_fn_show(String)
	 */
	public String getShow() {
		return _fn_show;
	}

	/**
	 * Fires when the series is shown after chart generation time, either by
	 * clicking the legend item or by calling `.show()`.
	 */
	public void setShow(String _fn_show) {
		this._fn_show = _fn_show;
	}

	/**
	 * @see #set_fn_unselect(String)
	 */
	public String getUnselect() {
		return _fn_unselect;
	}

	/**
	 * Fires when the point is unselected either programmatically or following a
	 * click on the point. One parameter, `event`, is passed to the function.
	 * Returning `false` cancels the operation.
	 */
	public void setUnselect(String _fn_unselect) {
		this._fn_unselect = _fn_unselect;
	}

	/**
	 * @see #set_fn_update(String)
	 */
	public String getUpdate() {
		return _fn_update;
	}

	/**
	 * Fires when the point is updated programmatically through the `.update()`
	 * method. One parameter, `event`, is passed to the function. The new point
	 * options can be accessed through `event.options`. Returning `false`
	 * cancels the operation.
	 */
	public void setUpdate(String _fn_update) {
		this._fn_update = _fn_update;
	}
}
