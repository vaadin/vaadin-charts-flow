package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A tilemap series is a type of heatmap where the tile shapes are configurable.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `tilemap`
 * series are defined in [plotOptions.tilemap](plotOptions.tilemap). 3. Options
 * for one single series are given in [the series instance
 * array](series.tilemap).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         tilemap: {
 *             // shared options for all tilemap series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'tilemap'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsTilemap extends PlotOptionsHeatmap {

	private Number colsize;
	private Data data;
	private Number pointPadding;
	private Number rowsize;
	private States states;
	private String tileShape;

	public PlotOptionsTilemap() {
	}

	/**
	 * @see #setColsize(Number)
	 */
	public Number getColsize() {
		return colsize;
	}

	/**
	 * The column size - how many X axis units each column in the tilemap should
	 * span. Works as in [Heatmaps](#plotOptions.heatmap.colsize).
	 */
	public void setColsize(Number colsize) {
		this.colsize = colsize;
	}

	public Data getData() {
		if (data == null) {
			data = new Data();
		}
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * @see #setPointPadding(Number)
	 */
	public Number getPointPadding() {
		return pointPadding;
	}

	/**
	 * The padding between points in the tilemap.
	 */
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
	}

	/**
	 * @see #setRowsize(Number)
	 */
	public Number getRowsize() {
		return rowsize;
	}

	/**
	 * The row size - how many Y axis units each tilemap row should span.
	 * Analogous to [colsize](#plotOptions.tilemap.colsize).
	 */
	public void setRowsize(Number rowsize) {
		this.rowsize = rowsize;
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

	/**
	 * @see #setTileShape(String)
	 */
	public String getTileShape() {
		return tileShape;
	}

	/**
	 * The shape of the tiles in the tilemap. Possible values are `hexagon`,
	 * `circle`, `diamond`, and `square`.
	 */
	public void setTileShape(String tileShape) {
		this.tileShape = tileShape;
	}
}
