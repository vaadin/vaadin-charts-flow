package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A variable pie series is a two dimensional series type, where each point
 * renders an Y and Z value. Each point is drawn as a pie slice where the size
 * (arc) of the slice relates to the Y value and the radius of pie slice relates
 * to the Z value. Requires `highcharts-more.js`.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all
 * `variablepie` series are defined in
 * [plotOptions.variablepie](plotOptions.variablepie). 3. Options for one single
 * series are given in [the series instance array](series.variablepie).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         variablepie: {
 *             // shared options for all variablepie series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'variablepie'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsVariablePie extends PlotOptionsPie {

	private String maxPointSize;
	private String minPointSize;
	private String sizeBy;
	private SeriesTooltip tooltip;
	private Number zMax;
	private Number zMin;

	public PlotOptionsVariablePie() {
	}

	/**
	 * @see #setMaxPointSize(String)
	 */
	public String getMaxPointSize() {
		return maxPointSize;
	}

	/**
	 * The maximum size of the points' radius related to chart's `plotArea`. If
	 * a number is set, it applies in pixels.
	 */
	public void setMaxPointSize(String maxPointSize) {
		this.maxPointSize = maxPointSize;
	}

	/**
	 * @see #setMinPointSize(String)
	 */
	public String getMinPointSize() {
		return minPointSize;
	}

	/**
	 * The minimum size of the points' radius related to chart's `plotArea`. If
	 * a number is set, it applies in pixels.
	 */
	public void setMinPointSize(String minPointSize) {
		this.minPointSize = minPointSize;
	}

	/**
	 * @see #setSizeBy(String)
	 */
	public String getSizeBy() {
		return sizeBy;
	}

	/**
	 * Whether the pie slice's value should be represented by the area or the
	 * radius of the slice. Can be either `area` or `radius`. The default,
	 * `area`, corresponds best to the human perception of the size of each pie
	 * slice.
	 */
	public void setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
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

	/**
	 * @see #setZMax(Number)
	 */
	public Number getZMax() {
		return zMax;
	}

	/**
	 * The maximum possible z value for the point's radius calculation. If the
	 * point's Z value is bigger than zMax, the slice will be drawn according to
	 * the zMax value
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
	 * The minimum possible z value for the point's radius calculation. If the
	 * point's Z value is smaller than zMin, the slice will be drawn according
	 * to the zMin value.
	 */
	public void setZMin(Number zMin) {
		this.zMin = zMin;
	}
}
