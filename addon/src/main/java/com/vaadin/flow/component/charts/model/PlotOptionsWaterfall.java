package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A waterfall chart displays sequentially introduced positive or negative
 * values in cumulative columns.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all
 * `waterfall` series are defined in
 * [plotOptions.waterfall](plotOptions.waterfall). 3. Options for one single
 * series are given in [the series instance array](series.waterfall).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         waterfall: {
 *             // shared options for all waterfall series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'waterfall'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsWaterfall extends PlotOptionsColumn {

	private DataLabels dataLabels;
	private States states;

	public PlotOptionsWaterfall() {
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
