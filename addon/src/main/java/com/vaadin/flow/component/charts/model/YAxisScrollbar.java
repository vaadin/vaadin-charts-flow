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

/**
 * An optional scrollbar to display on the Y axis in response to limiting the
 * minimum an maximum of the axis values. In styled mode, all the presentational
 * options for the scrollbar are replaced by the classes
 * `.highcharts-scrollbar-thumb`, `.highcharts-scrollbar-arrow`,
 * `.highcharts-scrollbar-button`, `.highcharts-scrollbar-rifles` and
 * `.highcharts-scrollbar-track`.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class YAxisScrollbar extends AbstractConfigurationObject {

	private Number barBorderRadius;
	private Number barBorderWidth;
	private Number buttonBorderRadius;
	private Number buttonBorderWidth;
	private Boolean enabled;
	private Boolean liveRedraw;
	private Number margin;
	private Number minWidth;
	private Boolean showFull;
	private Number size;
	private Number step;
	private Number trackBorderRadius;
	private Number trackBorderWidth;
	private Number zIndex;

	public YAxisScrollbar() {
	}

	public YAxisScrollbar(Boolean enabled) {
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
	 * Enable the scrollbar on the Y axis.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
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
	 * Pixel margin between the scrollbar and the axis elements.
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
	 * Whether to show the scrollbar when it is fully zoomed out at max range.
	 * Setting it to `false` on the Y axis makes the scrollbar stay hidden until
	 * the user zooms in, like common in browsers.
	 */
	public void setShowFull(Boolean showFull) {
		this.showFull = showFull;
	}

	/**
	 * @see #setSize(Number)
	 */
	public Number getSize() {
		return size;
	}

	/**
	 * The width of a vertical scrollbar or height of a horizontal scrollbar.
	 * Defaults to 20 on touch devices.
	 */
	public void setSize(Number size) {
		this.size = size;
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
	 * Z index of the scrollbar elements.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
