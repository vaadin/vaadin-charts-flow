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
 * The navigator is a small series below the main series, displaying a view of
 * the entire data set. It provides tools to zoom in and out on parts of the
 * data as well as panning across the dataset.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Navigator extends AbstractConfigurationObject {

	private Boolean adaptToUpdatedData;
	private String baseSeries;
	private Boolean enabled;
	private Number height;
	private Number margin;
	private Boolean maskInside;
	private Boolean opposite;
	private NavigatorOptions series;
	private NavigatorXAxis xAxis;
	private NavigatorYAxis yAxis;

	public Navigator() {
	}

	public Navigator(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setAdaptToUpdatedData(Boolean)
	 */
	public Boolean getAdaptToUpdatedData() {
		return adaptToUpdatedData;
	}

	/**
	 * Whether the navigator and scrollbar should adapt to updated data in the
	 * base X axis. When loading data async, as in the demo below, this should
	 * be `false`. Otherwise new data will trigger navigator redraw, which will
	 * cause unwanted looping. In the demo below, the data in the navigator is
	 * set only once. On navigating, only the main chart content is updated.
	 */
	public void setAdaptToUpdatedData(Boolean adaptToUpdatedData) {
		this.adaptToUpdatedData = adaptToUpdatedData;
	}

	/**
	 * @see #setBaseSeries(String)
	 */
	public String getBaseSeries() {
		return baseSeries;
	}

	/**
	 * An integer identifying the index to use for the base series, or a string
	 * representing the id of the series. Note**: As of Highcharts 5.0, this is
	 * now a deprecated option. Prefer
	 * [series.showInNavigator](#plotOptions.series.showInNavigator).
	 */
	public void setBaseSeries(String baseSeries) {
		this.baseSeries = baseSeries;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the navigator.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * The height of the navigator.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setMargin(Number)
	 */
	public Number getMargin() {
		return margin;
	}

	/**
	 * The distance from the nearest element, the X axis or X axis labels.
	 */
	public void setMargin(Number margin) {
		this.margin = margin;
	}

	/**
	 * @see #setMaskInside(Boolean)
	 */
	public Boolean getMaskInside() {
		return maskInside;
	}

	/**
	 * Whether the mask should be inside the range marking the zoomed range, or
	 * outside. In Highstock 1.x it was always `false`.
	 */
	public void setMaskInside(Boolean maskInside) {
		this.maskInside = maskInside;
	}

	/**
	 * @see #setOpposite(Boolean)
	 */
	public Boolean getOpposite() {
		return opposite;
	}

	/**
	 * When the chart is inverted, whether to draw the navigator on the opposite
	 * side.
	 */
	public void setOpposite(Boolean opposite) {
		this.opposite = opposite;
	}

	/**
	 * @see #setSeries(NavigatorOptions)
	 */
	public NavigatorOptions getSeries() {
		if (series == null) {
			series = new NavigatorOptions();
		}
		return series;
	}

	/**
	 * Options for the navigator series. Available options are the same as any
	 * series, documented at [plotOptions](#plotOptions.series) and
	 * [series](#series). Unless data is explicitly defined on navigator.series,
	 * the data is borrowed from the first series in the chart. Default series
	 * options for the navigator series are:
	 * 
	 * <pre>
	 * series: {
	 * 	    type: 'areaspline',
	 * 	    fillOpacity: 0.05,
	 * 	    dataGrouping: {
	 * 	        smoothed: true
	 * 	    },
	 * 	    lineWidth: 1,
	 * 	    marker: {
	 * 	        enabled: false
	 * 	    }
	 * 	}
	 * </pre>
	 */
	public void setSeries(NavigatorOptions series) {
		this.series = series;
	}

	/**
	 * @see #setXAxis(NavigatorXAxis)
	 */
	public NavigatorXAxis getXAxis() {
		if (xAxis == null) {
			xAxis = new NavigatorXAxis();
		}
		return xAxis;
	}

	/**
	 * Options for the navigator X axis. Default series options for the
	 * navigator xAxis are:
	 * 
	 * <pre>
	 * xAxis: {
	 * 	    tickWidth: 0,
	 * 	    lineWidth: 0,
	 * 	    gridLineWidth: 1,
	 * 	    tickPixelInterval: 200,
	 * 	    labels: {
	 * 	           align: 'left',
	 * 	        style: {
	 * 	            color: '#888'
	 * 	        },
	 * 	        x: 3,
	 * 	        y: -4
	 * 	    }
	 * 	}
	 * </pre>
	 */
	public void setXAxis(NavigatorXAxis xAxis) {
		this.xAxis = xAxis;
	}

	/**
	 * @see #setYAxis(NavigatorYAxis)
	 */
	public NavigatorYAxis getYAxis() {
		if (yAxis == null) {
			yAxis = new NavigatorYAxis();
		}
		return yAxis;
	}

	/**
	 * Options for the navigator Y axis. Default series options for the
	 * navigator yAxis are:
	 * 
	 * <pre>
	 * yAxis: {
	 * 	    gridLineWidth: 0,
	 * 	    startOnTick: false,
	 * 	    endOnTick: false,
	 * 	    minPadding: 0.1,
	 * 	    maxPadding: 0.1,
	 * 	    labels: {
	 * 	        enabled: false
	 * 	    },
	 * 	    title: {
	 * 	        text: null
	 * 	    },
	 * 	    tickWidth: 0
	 * 	}
	 * </pre>
	 */
	public void setYAxis(NavigatorYAxis yAxis) {
		this.yAxis = yAxis;
	}
}
