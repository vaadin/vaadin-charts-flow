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
 * Moving Average Convergence Divergence (MACD). This series requires `linkedTo`
 * option to be set.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `macd`
 * series are defined in [plotOptions.macd](plotOptions.macd). 3. Options for
 * one single series are given in [the series instance array](series.macd).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         macd: {
 *             // shared options for all macd series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'macd'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsMovingAverageConvergenceDivergence
		extends
			PlotOptionsSimpleMovingAverage {

	private DataGrouping dataGrouping;
	private Number groupPadding;
	private MovingAverageConvergenceDivergenceLine macdLine;
	private Number minPointLength;
	private Params params;
	private Number pointPadding;
	private SignalLine signalLine;
	private States states;
	private Number threshold;
	private SeriesTooltip tooltip;

	public PlotOptionsMovingAverageConvergenceDivergence() {
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

	public Number getGroupPadding() {
		return groupPadding;
	}

	public void setGroupPadding(Number groupPadding) {
		this.groupPadding = groupPadding;
	}

	/**
	 * @see #setMacdLine(MovingAverageConvergenceDivergenceLine)
	 */
	public MovingAverageConvergenceDivergenceLine getMacdLine() {
		if (macdLine == null) {
			macdLine = new MovingAverageConvergenceDivergenceLine();
		}
		return macdLine;
	}

	/**
	 * The styles for macd line
	 */
	public void setMacdLine(MovingAverageConvergenceDivergenceLine macdLine) {
		this.macdLine = macdLine;
	}

	public Number getMinPointLength() {
		return minPointLength;
	}

	public void setMinPointLength(Number minPointLength) {
		this.minPointLength = minPointLength;
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

	public Number getPointPadding() {
		return pointPadding;
	}

	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
	}

	/**
	 * @see #setSignalLine(SignalLine)
	 */
	public SignalLine getSignalLine() {
		if (signalLine == null) {
			signalLine = new SignalLine();
		}
		return signalLine;
	}

	/**
	 * The styles for signal line
	 */
	public void setSignalLine(SignalLine signalLine) {
		this.signalLine = signalLine;
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

	public Number getThreshold() {
		return threshold;
	}

	public void setThreshold(Number threshold) {
		this.threshold = threshold;
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
