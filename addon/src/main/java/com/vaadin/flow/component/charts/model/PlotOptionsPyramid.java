package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A pyramid series is a special type of funnel, without neck and reversed by
 * default.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `pyramid`
 * series are defined in [plotOptions.pyramid](plotOptions.pyramid). 3. Options
 * for one single series are given in [the series instance
 * array](series.pyramid).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         pyramid: {
 *             // shared options for all pyramid series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'pyramid'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsPyramid extends PlotOptionsFunnel {

	private String neckHeight;
	private String neckWidth;
	private Boolean reversed;

	public PlotOptionsPyramid() {
	}

	/**
	 * @see #setNeckHeight(String)
	 */
	public String getNeckHeight() {
		return neckHeight;
	}

	/**
	 * The pyramid neck width is zero by default, as opposed to the funnel,
	 * which shares the same layout logic.
	 */
	public void setNeckHeight(String neckHeight) {
		this.neckHeight = neckHeight;
	}

	/**
	 * @see #setNeckWidth(String)
	 */
	public String getNeckWidth() {
		return neckWidth;
	}

	/**
	 * The pyramid neck width is zero by default, as opposed to the funnel,
	 * which shares the same layout logic.
	 */
	public void setNeckWidth(String neckWidth) {
		this.neckWidth = neckWidth;
	}

	/**
	 * @see #setReversed(Boolean)
	 */
	public Boolean getReversed() {
		return reversed;
	}

	/**
	 * The pyramid is reversed by default, as opposed to the funnel, which
	 * shares the layout engine, and is not reversed.
	 */
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}
}
