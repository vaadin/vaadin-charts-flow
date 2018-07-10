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
 * Price envelopes indicator based on [SMA](#plotOptions.sma) calculations. This
 * series requires the `linkedTo` option to be set and should be loaded after
 * the `stock/indicators/indicators.js` file.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all
 * `priceenvelopes` series are defined in
 * [plotOptions.priceenvelopes](plotOptions.priceenvelopes). 3. Options for one
 * single series are given in [the series instance
 * array](series.priceenvelopes).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         priceenvelopes: {
 *             // shared options for all priceenvelopes series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'priceenvelopes'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsPriceEnvelopes extends PlotOptionsSimpleMovingAverage {

	private BottomLine bottomLine;
	private DataGrouping dataGrouping;
	private Marker marker;
	private Params params;
	private SeriesTooltip tooltip;
	private TopLine topLine;

	public PlotOptionsPriceEnvelopes() {
	}

	/**
	 * @see #setBottomLine(BottomLine)
	 */
	public BottomLine getBottomLine() {
		if (bottomLine == null) {
			bottomLine = new BottomLine();
		}
		return bottomLine;
	}

	/**
	 * Bottom line options.
	 */
	public void setBottomLine(BottomLine bottomLine) {
		this.bottomLine = bottomLine;
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

	public Params getParams() {
		if (params == null) {
			params = new Params();
		}
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
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

	/**
	 * @see #setTopLine(TopLine)
	 */
	public TopLine getTopLine() {
		if (topLine == null) {
			topLine = new TopLine();
		}
		return topLine;
	}

	/**
	 * Top line options.
	 */
	public void setTopLine(TopLine topLine) {
		this.topLine = topLine;
	}
}
