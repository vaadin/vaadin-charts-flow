package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Money Flow Index. This series requires `linkedTo` option to be set and should
 * be loaded after the `stock/indicators/indicators.js` file.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `mfi`
 * series are defined in [plotOptions.mfi](plotOptions.mfi). 3. Options for one
 * single series are given in [the series instance array](series.mfi).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         mfi: {
 *             // shared options for all mfi series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'mfi'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsMoneyFlowIndex extends PlotOptionsSimpleMovingAverage {

	private Params params;

	public PlotOptionsMoneyFlowIndex() {
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
