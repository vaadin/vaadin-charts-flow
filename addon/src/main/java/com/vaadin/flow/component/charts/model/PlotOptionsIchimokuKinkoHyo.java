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
 * Ichimoku Kinko Hyo (IKH). This series requires `linkedTo` option to be set.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `ikh`
 * series are defined in [plotOptions.ikh](plotOptions.ikh). 3. Options for one
 * single series are given in [the series instance array](series.ikh).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         ikh: {
 *             // shared options for all ikh series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'ikh'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsIchimokuKinkoHyo extends PlotOptionsSimpleMovingAverage {

	private ChikouLine chikouLine;
	private DataGrouping dataGrouping;
	private KijunLine kijunLine;
	private Marker marker;
	private Params params;
	private SenkouSpan senkouSpan;
	private SenkouSpanA senkouSpanA;
	private SenkouSpanB senkouSpanB;
	private TenkanLine tenkanLine;
	private SeriesTooltip tooltip;

	public PlotOptionsIchimokuKinkoHyo() {
	}

	/**
	 * @see #setChikouLine(ChikouLine)
	 */
	public ChikouLine getChikouLine() {
		if (chikouLine == null) {
			chikouLine = new ChikouLine();
		}
		return chikouLine;
	}

	/**
	 * The styles for Chikou line
	 */
	public void setChikouLine(ChikouLine chikouLine) {
		this.chikouLine = chikouLine;
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

	/**
	 * @see #setKijunLine(KijunLine)
	 */
	public KijunLine getKijunLine() {
		if (kijunLine == null) {
			kijunLine = new KijunLine();
		}
		return kijunLine;
	}

	/**
	 * The styles for Kijun line
	 */
	public void setKijunLine(KijunLine kijunLine) {
		this.kijunLine = kijunLine;
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

	/**
	 * @see #setSenkouSpan(SenkouSpan)
	 */
	public SenkouSpan getSenkouSpan() {
		if (senkouSpan == null) {
			senkouSpan = new SenkouSpan();
		}
		return senkouSpan;
	}

	/**
	 * The styles for fill between Senkou Span A and B
	 */
	public void setSenkouSpan(SenkouSpan senkouSpan) {
		this.senkouSpan = senkouSpan;
	}

	/**
	 * @see #setSenkouSpanA(SenkouSpanA)
	 */
	public SenkouSpanA getSenkouSpanA() {
		if (senkouSpanA == null) {
			senkouSpanA = new SenkouSpanA();
		}
		return senkouSpanA;
	}

	/**
	 * The styles for Senkou Span A line
	 */
	public void setSenkouSpanA(SenkouSpanA senkouSpanA) {
		this.senkouSpanA = senkouSpanA;
	}

	/**
	 * @see #setSenkouSpanB(SenkouSpanB)
	 */
	public SenkouSpanB getSenkouSpanB() {
		if (senkouSpanB == null) {
			senkouSpanB = new SenkouSpanB();
		}
		return senkouSpanB;
	}

	/**
	 * The styles for Senkou Span B line
	 */
	public void setSenkouSpanB(SenkouSpanB senkouSpanB) {
		this.senkouSpanB = senkouSpanB;
	}

	/**
	 * @see #setTenkanLine(TenkanLine)
	 */
	public TenkanLine getTenkanLine() {
		if (tenkanLine == null) {
			tenkanLine = new TenkanLine();
		}
		return tenkanLine;
	}

	/**
	 * The styles for Tenkan line
	 */
	public void setTenkanLine(TenkanLine tenkanLine) {
		this.tenkanLine = tenkanLine;
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
