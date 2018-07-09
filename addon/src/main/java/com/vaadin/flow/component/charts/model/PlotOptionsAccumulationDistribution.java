package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Accumulation Distribution (AD). This series requires `linkedTo` option to be
 * set.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `ad`
 * series are defined in [plotOptions.ad](plotOptions.ad). 3. Options for one
 * single series are given in [the series instance array](series.ad).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         ad: {
 *             // shared options for all ad series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'ad'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsAccumulationDistribution
		extends
			PlotOptionsSimpleMovingAverage {

	private Params params;

	public PlotOptionsAccumulationDistribution() {
	}

	public Params getParams() {
		if (params == null) {
			params = new Params();
		}
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
	}
}
