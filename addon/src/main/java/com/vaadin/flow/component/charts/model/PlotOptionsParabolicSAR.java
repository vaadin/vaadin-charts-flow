package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Parabolic SAR. This series requires `linkedTo` option to be set and should be
 * loaded after `stock/indicators/indicators.js` file.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `psar`
 * series are defined in [plotOptions.psar](plotOptions.psar). 3. Options for
 * one single series are given in [the series instance array](series.psar).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         psar: {
 *             // shared options for all psar series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'psar'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsParabolicSAR extends PlotOptionsSimpleMovingAverage {

	private Marker marker;
	private Params params;
	private States states;

	public PlotOptionsParabolicSAR() {
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

	public Params getParams() {
		if (params == null) {
			params = new Params();
		}
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
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
}
