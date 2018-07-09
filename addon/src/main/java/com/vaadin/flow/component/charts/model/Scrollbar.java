package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * An optional scrollbar to display on the X axis in response to limiting the
 * minimum and maximum of the axis values. In styled mode, all the
 * presentational options for the scrollbar are replaced by the classes
 * `.highcharts-scrollbar-thumb`, `.highcharts-scrollbar-arrow`,
 * `.highcharts-scrollbar-button`, `.highcharts-scrollbar-rifles` and
 * `.highcharts-scrollbar-track`.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Scrollbar extends AbstractConfigurationObject {

	private Number barBorderRadius;
	private Number barBorderWidth;
	private Number buttonBorderRadius;
	private Number buttonBorderWidth;
	private Boolean enabled;
	private Number height;
	private Boolean liveRedraw;
	private Number margin;
	private Number minWidth;
	private Boolean showFull;
	private Number step;
	private Number trackBorderRadius;
	private Number trackBorderWidth;
	private Number zIndex;

	public Scrollbar() {
	}

	public Scrollbar(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setBarBorderRadius(Number)
	 */
	public Number getBarBorderRadius() {
		return barBorderRadius;
	}

	/**
	 * The border rounding radius of the bar.
	 */
	public void setBarBorderRadius(Number barBorderRadius) {
		this.barBorderRadius = barBorderRadius;
	}

	/**
	 * @see #setBarBorderWidth(Number)
	 */
	public Number getBarBorderWidth() {
		return barBorderWidth;
	}

	/**
	 * The width of the bar's border.
	 */
	public void setBarBorderWidth(Number barBorderWidth) {
		this.barBorderWidth = barBorderWidth;
	}

	/**
	 * @see #setButtonBorderRadius(Number)
	 */
	public Number getButtonBorderRadius() {
		return buttonBorderRadius;
	}

	/**
	 * The corner radius of the scrollbar buttons.
	 */
	public void setButtonBorderRadius(Number buttonBorderRadius) {
		this.buttonBorderRadius = buttonBorderRadius;
	}

	/**
	 * @see #setButtonBorderWidth(Number)
	 */
	public Number getButtonBorderWidth() {
		return buttonBorderWidth;
	}

	/**
	 * The border width of the scrollbar buttons.
	 */
	public void setButtonBorderWidth(Number buttonBorderWidth) {
		this.buttonBorderWidth = buttonBorderWidth;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the scrollbar.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * The height of the scrollbar. The height also applies to the width of the
	 * scroll arrows so that they are always squares. Defaults to 20 for touch
	 * devices and 14 for mouse devices.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setLiveRedraw(Boolean)
	 */
	public Boolean getLiveRedraw() {
		return liveRedraw;
	}

	/**
	 * Whether to redraw the main chart as the scrollbar or the navigator zoomed
	 * window is moved. Defaults to `true` for modern browsers and `false` for
	 * legacy IE browsers as well as mobile devices.
	 */
	public void setLiveRedraw(Boolean liveRedraw) {
		this.liveRedraw = liveRedraw;
	}

	/**
	 * @see #setMargin(Number)
	 */
	public Number getMargin() {
		return margin;
	}

	/**
	 * The margin between the scrollbar and its axis when the scrollbar is
	 * applied directly to an axis.
	 */
	public void setMargin(Number margin) {
		this.margin = margin;
	}

	/**
	 * @see #setMinWidth(Number)
	 */
	public Number getMinWidth() {
		return minWidth;
	}

	/**
	 * The minimum width of the scrollbar.
	 */
	public void setMinWidth(Number minWidth) {
		this.minWidth = minWidth;
	}

	/**
	 * @see #setShowFull(Boolean)
	 */
	public Boolean getShowFull() {
		return showFull;
	}

	/**
	 * Whether to show or hide the scrollbar when the scrolled content is zoomed
	 * out to it full extent.
	 */
	public void setShowFull(Boolean showFull) {
		this.showFull = showFull;
	}

	public Number getStep() {
		return step;
	}

	public void setStep(Number step) {
		this.step = step;
	}

	/**
	 * @see #setTrackBorderRadius(Number)
	 */
	public Number getTrackBorderRadius() {
		return trackBorderRadius;
	}

	/**
	 * The corner radius of the border of the scrollbar track.
	 */
	public void setTrackBorderRadius(Number trackBorderRadius) {
		this.trackBorderRadius = trackBorderRadius;
	}

	/**
	 * @see #setTrackBorderWidth(Number)
	 */
	public Number getTrackBorderWidth() {
		return trackBorderWidth;
	}

	/**
	 * The width of the border of the scrollbar track.
	 */
	public void setTrackBorderWidth(Number trackBorderWidth) {
		this.trackBorderWidth = trackBorderWidth;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The z index of the scrollbar group.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
