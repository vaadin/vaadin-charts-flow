package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Relative strength index (RSI) technical indicator. This series requires the
 * `linkedTo` option to be set and should be loaded after the
 * `stock/indicators/indicators.js` file.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `rsi`
 * series are defined in [plotOptions.rsi](plotOptions.rsi). 3. Options for one
 * single series are given in [the series instance array](series.rsi).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         rsi: {
 *             // shared options for all rsi series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'rsi'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsRelativeStrengthIndex
		extends
			PlotOptionsSimpleMovingAverage {

	private Params params;

	public PlotOptionsRelativeStrengthIndex() {
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
