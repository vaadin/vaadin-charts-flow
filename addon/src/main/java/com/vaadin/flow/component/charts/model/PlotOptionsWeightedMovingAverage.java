package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Weighted moving average indicator (WMA). This series requires `linkedTo`
 * option to be set.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `wma`
 * series are defined in [plotOptions.wma](plotOptions.wma). 3. Options for one
 * single series are given in [the series instance array](series.wma).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         wma: {
 *             // shared options for all wma series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'wma'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsWeightedMovingAverage
		extends
			PlotOptionsSimpleMovingAverage {

	private Params params;

	public PlotOptionsWeightedMovingAverage() {
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
