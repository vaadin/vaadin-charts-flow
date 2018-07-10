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
 * Volume By Price indicator. This series requires `linkedTo` option to be set.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `vbp`
 * series are defined in [plotOptions.vbp](plotOptions.vbp). 3. Options for one
 * single series are given in [the series instance array](series.vbp).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         vbp: {
 *             // shared options for all vbp series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'vbp'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsVolumeByPrice extends PlotOptionsSimpleMovingAverage {

	private Number animationLimit;
	private Boolean crisp;
	private DataGrouping dataGrouping;
	private DataLabels dataLabels;
	private Boolean enableMouseTracking;
	private Params params;
	private Number pointPadding;
	private VolumeDivision volumeDivision;
	private Number zIndex;
	private ZoneLines zoneLines;

	public PlotOptionsVolumeByPrice() {
	}

	public Number getAnimationLimit() {
		return animationLimit;
	}

	public void setAnimationLimit(Number animationLimit) {
		this.animationLimit = animationLimit;
	}

	public Boolean getCrisp() {
		return crisp;
	}

	public void setCrisp(Boolean crisp) {
		this.crisp = crisp;
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

	public DataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new DataLabels();
		}
		return dataLabels;
	}

	public void setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
	}

	public Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	public void setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
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
	 * @see #setVolumeDivision(VolumeDivision)
	 */
	public VolumeDivision getVolumeDivision() {
		if (volumeDivision == null) {
			volumeDivision = new VolumeDivision();
		}
		return volumeDivision;
	}

	/**
	 * The styles for bars when volume is divided into positive/negative.
	 */
	public void setVolumeDivision(VolumeDivision volumeDivision) {
		this.volumeDivision = volumeDivision;
	}

	public Number getZIndex() {
		return zIndex;
	}

	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}

	/**
	 * @see #setZoneLines(ZoneLines)
	 */
	public ZoneLines getZoneLines() {
		if (zoneLines == null) {
			zoneLines = new ZoneLines();
		}
		return zoneLines;
	}

	/**
	 * The styles for lines which determine price zones.
	 */
	public void setZoneLines(ZoneLines zoneLines) {
		this.zoneLines = zoneLines;
	}
}
