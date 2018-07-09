package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * A bubble series is a three dimensional series type where each point renders
 * an X, Y and Z value. Each points is drawn as a bubble where the position
 * along the X and Y axes mark the X and Y values, and the size of the bubble
 * relates to the Z value. Requires `highcharts-more.js`.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `bubble`
 * series are defined in [plotOptions.bubble](plotOptions.bubble). 3. Options
 * for one single series are given in [the series instance
 * array](series.bubble).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         bubble: {
 *             // shared options for all bubble series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'bubble'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsBubble extends PlotOptionsScatter {

	private Number animationLimit;
	private DataLabels dataLabels;
	private Boolean displayNegative;
	private Marker marker;
	private String maxSize;
	private String minSize;
	private boolean negativeColor;
	private String sizeBy;
	private Boolean sizeByAbsoluteValue;
	private Boolean softThreshold;
	private States states;
	private SeriesTooltip tooltip;
	private Number turboThreshold;
	private Number zMax;
	private Number zMin;
	private Number zThreshold;
	private ZoneAxis zoneAxis;

	public PlotOptionsBubble() {
	}

	/**
	 * @see #setAnimationLimit(Number)
	 */
	public Number getAnimationLimit() {
		return animationLimit;
	}

	/**
	 * If there are more points in the series than the `animationLimit`, the
	 * animation won't run. Animation affects overall performance and doesn't
	 * work well with heavy data series.
	 */
	public void setAnimationLimit(Number animationLimit) {
		this.animationLimit = animationLimit;
	}

	public DataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new DataLabels();
		}
		return dataLabels;
	}

	public void setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
	}

	/**
	 * @see #setDisplayNegative(Boolean)
	 */
	public Boolean getDisplayNegative() {
		return displayNegative;
	}

	/**
	 * Whether to display negative sized bubbles. The threshold is given by the
	 * [zThreshold](#plotOptions.bubble.zThreshold) option, and negative bubbles
	 * can be visualized by setting
	 * [negativeColor](#plotOptions.bubble.negativeColor).
	 */
	public void setDisplayNegative(Boolean displayNegative) {
		this.displayNegative = displayNegative;
	}

	public Marker getMarker() {
		if (marker == null) {
			marker = new Marker();
		}
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	/**
	 * @see #setMaxSize(String)
	 */
	public String getMaxSize() {
		return maxSize;
	}

	/**
	 * Maximum bubble size. Bubbles will automatically size between the
	 * `minSize` and `maxSize` to reflect the `z` value of each bubble. Can be
	 * either pixels (when no unit is given), or a percentage of the smallest
	 * one of the plot width and height.
	 */
	public void setMaxSize(String maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * @see #setMinSize(String)
	 */
	public String getMinSize() {
		return minSize;
	}

	/**
	 * Minimum bubble size. Bubbles will automatically size between the
	 * `minSize` and `maxSize` to reflect the `z` value of each bubble. Can be
	 * either pixels (when no unit is given), or a percentage of the smallest
	 * one of the plot width and height.
	 */
	public void setMinSize(String minSize) {
		this.minSize = minSize;
	}

	/**
	 * @see #setNegativeColor(boolean)
	 */
	public boolean isNegativeColor() {
		return negativeColor;
	}

	/**
	 * Enable or disable the color for parts of the graph that are bellow
	 * {@link #getThreshold()}. A negative color is applied by setting this
	 * option to <code>true</code> combined with the
	 * <code>.highcharts-negative</code> class name.
	 */
	public void setNegativeColor(boolean negativeColor) {
		this.negativeColor = negativeColor;
	}

	/**
	 * @see #setSizeBy(String)
	 */
	public String getSizeBy() {
		return sizeBy;
	}

	/**
	 * Whether the bubble's value should be represented by the area or the width
	 * of the bubble. The default, `area`, corresponds best to the human
	 * perception of the size of each bubble.
	 */
	public void setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
	}

	/**
	 * @see #setSizeByAbsoluteValue(Boolean)
	 */
	public Boolean getSizeByAbsoluteValue() {
		return sizeByAbsoluteValue;
	}

	/**
	 * When this is true, the absolute value of z determines the size of the
	 * bubble. This means that with the default `zThreshold` of 0, a bubble of
	 * value -1 will have the same size as a bubble of value 1, while a bubble
	 * of value 0 will have a smaller size according to `minSize`.
	 */
	public void setSizeByAbsoluteValue(Boolean sizeByAbsoluteValue) {
		this.sizeByAbsoluteValue = sizeByAbsoluteValue;
	}

	/**
	 * @see #setSoftThreshold(Boolean)
	 */
	public Boolean getSoftThreshold() {
		return softThreshold;
	}

	/**
	 * When this is true, the series will not cause the Y axis to cross the zero
	 * plane (or [threshold](#plotOptions.series.threshold) option) unless the
	 * data actually crosses the plane. For example, if `softThreshold` is
	 * `false`, a series of 0, 1, 2, 3 will make the Y axis show negative values
	 * according to the `minPadding` option. If `softThreshold` is `true`, the Y
	 * axis starts at 0.
	 */
	public void setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
	}

	public States getStates() {
		if (states == null) {
			states = new States();
		}
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}

	public SeriesTooltip getTooltip() {
		if (tooltip == null) {
			tooltip = new SeriesTooltip();
		}
		return tooltip;
	}

	public void setTooltip(SeriesTooltip tooltip) {
		this.tooltip = tooltip;
	}

	public Number getTurboThreshold() {
		return turboThreshold;
	}

	public void setTurboThreshold(Number turboThreshold) {
		this.turboThreshold = turboThreshold;
	}

	/**
	 * @see #setZMax(Number)
	 */
	public Number getZMax() {
		return zMax;
	}

	/**
	 * The minimum for the Z value range. Defaults to the highest Z value in the
	 * data.
	 */
	public void setZMax(Number zMax) {
		this.zMax = zMax;
	}

	/**
	 * @see #setZMin(Number)
	 */
	public Number getZMin() {
		return zMin;
	}

	/**
	 * The minimum for the Z value range. Defaults to the lowest Z value in the
	 * data.
	 */
	public void setZMin(Number zMin) {
		this.zMin = zMin;
	}

	/**
	 * @see #setZThreshold(Number)
	 */
	public Number getZThreshold() {
		return zThreshold;
	}

	/**
	 * When [displayNegative](#plotOptions.bubble.displayNegative) is `false`,
	 * bubbles with lower Z values are skipped. When `displayNegative` is `true`
	 * and a [negativeColor](#plotOptions.bubble.negativeColor) is given, points
	 * with lower Z is colored.
	 */
	public void setZThreshold(Number zThreshold) {
		this.zThreshold = zThreshold;
	}

	public ZoneAxis getZoneAxis() {
		return zoneAxis;
	}

	public void setZoneAxis(ZoneAxis zoneAxis) {
		this.zoneAxis = zoneAxis;
	}
}
