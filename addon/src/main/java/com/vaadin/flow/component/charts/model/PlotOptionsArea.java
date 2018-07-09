package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * The area series type.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `area`
 * series are defined in [plotOptions.area](plotOptions.area). 3. Options for
 * one single series are given in [the series instance array](series.area).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         area: {
 *             // shared options for all area series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'area'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsArea extends PlotOptionsLine {

	private Boolean softThreshold;
	private Number threshold;
	private Boolean trackByArea;

	public PlotOptionsArea() {
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

	/**
	 * @see #setThreshold(Number)
	 */
	public Number getThreshold() {
		return threshold;
	}

	/**
	 * The Y axis value to serve as the base for the area, for distinguishing
	 * between values above and below a threshold. The area between the graph
	 * and the threshold is filled. If a number is given, the Y axis will scale
	 * to the threshold. If `null`, the scaling behaves like a line series with
	 * fill between the graph and the Y axis minimum. If `Infinity` or
	 * `-Infinity`, the area between the graph and the corresponing Y axis
	 * extreme is filled (since v6.1.0).
	 */
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
	}

	/**
	 * @see #setTrackByArea(Boolean)
	 */
	public Boolean getTrackByArea() {
		return trackByArea;
	}

	/**
	 * Whether the whole area or just the line should respond to mouseover
	 * tooltips and other mouse or touch events.
	 */
	public void setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
	}
}
