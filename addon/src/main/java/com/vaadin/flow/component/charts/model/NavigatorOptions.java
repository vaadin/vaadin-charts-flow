package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * Options for the navigator series. Available options are the same as any
 * series, documented at [plotOptions](#plotOptions.series) and
 * [series](#series). Unless data is explicitly defined on navigator.series, the
 * data is borrowed from the first series in the chart. Default series options
 * for the navigator series are:
 * 
 * <pre>
 * series: {
 *     type: 'areaspline',
 *     fillOpacity: 0.05,
 *     dataGrouping: {
 *         smoothed: true
 *     },
 *     lineWidth: 1,
 *     marker: {
 *         enabled: false
 *     }
 * }
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class NavigatorOptions extends AbstractConfigurationObject {

	private String className;
	private DataGrouping dataGrouping;
	private DataLabels dataLabels;
	private String id;
	private Color lineColor;
	private Number lineWidth;
	private Marker marker;
	private Number pointRange;
	private Number threshold;
	private String type;

	public NavigatorOptions() {
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setDataGrouping(DataGrouping)
	 */
	public DataGrouping getDataGrouping() {
		if (dataGrouping == null) {
			dataGrouping = new DataGrouping();
		}
		return dataGrouping;
	}

	/**
	 * Data grouping options for the navigator series.
	 */
	public void setDataGrouping(DataGrouping dataGrouping) {
		this.dataGrouping = dataGrouping;
	}

	/**
	 * @see #setDataLabels(DataLabels)
	 */
	public DataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new DataLabels();
		}
		return dataLabels;
	}

	/**
	 * Data label options for the navigator series. Data labels are disabled by
	 * default on the navigator series.
	 */
	public void setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @see #setLineColor(Color)
	 */
	public Color getLineColor() {
		return lineColor;
	}

	/**
	 * Line color for the navigator series. Allows setting the color while
	 * disallowing the default candlestick setting.
	 */
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	/**
	 * @see #setLineWidth(Number)
	 */
	public Number getLineWidth() {
		return lineWidth;
	}

	/**
	 * The pixel line width of the navigator series.
	 */
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
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

	public Number getPointRange() {
		return pointRange;
	}

	public void setPointRange(Number pointRange) {
		this.pointRange = pointRange;
	}

	/**
	 * @see #setThreshold(Number)
	 */
	public Number getThreshold() {
		return threshold;
	}

	/**
	 * The threshold option. Setting it to 0 will make the default navigator
	 * area series draw its area from the 0 value and up.
	 */
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
	}

	/**
	 * @see #setType(String)
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of the navigator series. Defaults to `areaspline` if defined,
	 * otherwise `line`.
	 */
	public void setType(String type) {
		this.type = type;
	}
}
