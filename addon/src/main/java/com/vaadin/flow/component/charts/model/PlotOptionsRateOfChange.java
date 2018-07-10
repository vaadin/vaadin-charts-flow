package com.vaadin.flow.component.charts.model;

/*-
 * #%L
 * Vaadin Charts for Flow
 * %%
 * Copyright (C) 2014 - 2018 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import javax.annotation.Generated;

/**
 * Rate of change indicator (ROC). The indicator value for each point is defined
 * as: `(C - Cn) / Cn * 100` where: `C` is the close value of the point of the
 * same x in the linked series and `Cn` is the close value of the point `n`
 * periods ago. `n` is set through [period](#plotOptions.roc.params.period).
 * This series requires `linkedTo` option to be set.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `roc`
 * series are defined in [plotOptions.roc](plotOptions.roc). 3. Options for one
 * single series are given in [the series instance array](series.roc).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         roc: {
 *             // shared options for all roc series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'roc'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsRateOfChange extends PlotOptionsSimpleMovingAverage {

	private String name;
	private Params params;

	public PlotOptionsRateOfChange() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
