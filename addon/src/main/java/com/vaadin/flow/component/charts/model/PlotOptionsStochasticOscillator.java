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
 * Stochastic oscillator. This series requires the `linkedTo` option to be set
 * and should be loaded after the `stock/indicators/indicators.js` file.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all
 * `stochastic` series are defined in
 * [plotOptions.stochastic](plotOptions.stochastic). 3. Options for one single
 * series are given in [the series instance array](series.stochastic).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         stochastic: {
 *             // shared options for all stochastic series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'stochastic'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsStochasticOscillator
		extends
			PlotOptionsSimpleMovingAverage {

	private DataGrouping dataGrouping;
	private Marker marker;
	private String name;
	private Params params;
	private SmoothedLine smoothedLine;
	private SeriesTooltip tooltip;

	public PlotOptionsStochasticOscillator() {
	}

	public DataGrouping getDataGrouping() {
		if (dataGrouping == null) {
			dataGrouping = new DataGrouping();
		}
		return dataGrouping;
	}

	public void setDataGrouping(DataGrouping dataGrouping) {
		this.dataGrouping = dataGrouping;
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

	/**
	 * @see #setSmoothedLine(SmoothedLine)
	 */
	public SmoothedLine getSmoothedLine() {
		if (smoothedLine == null) {
			smoothedLine = new SmoothedLine();
		}
		return smoothedLine;
	}

	/**
	 * Smoothed line options.
	 */
	public void setSmoothedLine(SmoothedLine smoothedLine) {
		this.smoothedLine = smoothedLine;
	}

	public SeriesTooltip getTooltip() {
		if (tooltip == null) {
			tooltip = new SeriesTooltip();
		}
		return tooltip;
	}

	public void setTooltip(SeriesTooltip tooltip) {
		this.tooltip = tooltip;
	}
}
