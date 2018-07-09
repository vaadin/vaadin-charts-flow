package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A line series displays information as a series of data points connected by
 * straight line segments.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `line`
 * series are defined in [plotOptions.line](plotOptions.line). 3. Options for
 * one single series are given in [the series instance array](series.line).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         line: {
 *             // shared options for all line series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'line'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsLine extends PlotOptionsSeries {

	private String linecap;

	public PlotOptionsLine() {
	}

	/**
	 * @see #setLinecap(String)
	 */
	public String getLinecap() {
		return linecap;
	}

	/**
	 * The SVG value used for the `stroke-linecap` and `stroke-linejoin` of a
	 * line graph. Round means that lines are rounded in the ends and bends.
	 */
	public void setLinecap(String linecap) {
		this.linecap = linecap;
	}
}
