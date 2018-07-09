package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A bar series is a special type of column series where the columns are
 * horizontal.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `bar`
 * series are defined in [plotOptions.bar](plotOptions.bar). 3. Options for one
 * single series are given in [the series instance array](series.bar).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         bar: {
 *             // shared options for all bar series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'bar'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsBar extends PlotOptionsColumn {

	private DataLabels dataLabels;

	public PlotOptionsBar() {
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
}
