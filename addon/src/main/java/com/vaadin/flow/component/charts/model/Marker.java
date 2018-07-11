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
 * Options for the point markers of line-like series. Properties like
 * `fillColor`, `lineColor` and `lineWidth` define the visual appearance of the
 * markers. Other series types, like column series, don't have markers, but have
 * visual options on the series level instead. In styled mode, the markers can
 * be styled with the `.highcharts-point`, `.highcharts-point-hover` and
 * `.highcharts-point-select` class names.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Marker extends AbstractConfigurationObject {

	private Boolean enabled;
	private Number enabledThreshold;
	private Number height;
	private Number radius;
	private States states;
	private MarkerSymbol symbol;
	private Number width;

	public Marker() {
	}

	public Marker(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the point marker. If `null`, the markers are hidden
	 * when the data is dense, and shown for more widespread data points.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabledThreshold(Number)
	 */
	public Number getEnabledThreshold() {
		return enabledThreshold;
	}

	/**
	 * The threshold for how dense the point markers should be before they are
	 * hidden, given that `enabled` is not defined. The number indicates the
	 * horizontal distance between the two closest points in the series, as
	 * multiples of the `marker.radius`. In other words, the default value of 2
	 * means points are hidden if overlapping horizontally.
	 */
	public void setEnabledThreshold(Number enabledThreshold) {
		this.enabledThreshold = enabledThreshold;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * Image markers only. Set the image width explicitly. When using this
	 * option, a `width` must also be set.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setRadius(Number)
	 */
	public Number getRadius() {
		return radius;
	}

	/**
	 * The radius of the point marker.
	 */
	public void setRadius(Number radius) {
		this.radius = radius;
	}

	/**
	 * @see #setStates(States)
	 */
	public States getStates() {
		if (states == null) {
			states = new States();
		}
		return states;
	}

	/**
	 * States for a single point marker.
	 */
	public void setStates(States states) {
		this.states = states;
	}

	/**
	 * @see #setSymbol(MarkerSymbol)
	 */
	public MarkerSymbol getSymbol() {
		return symbol;
	}

	/**
	 * A predefined shape or symbol for the marker. When null, the symbol is
	 * pulled from options.symbols. Other possible values are "circle",
	 * "square", "diamond", "triangle" and "triangle-down". Additionally, the
	 * URL to a graphic can be given on this form: "url(graphic.png)". Note that
	 * for the image to be applied to exported charts, its URL needs to be
	 * accessible by the export server. Custom callbacks for symbol path
	 * generation can also be added to
	 * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
	 * its method name, as shown in the demo.
	 */
	public void setSymbol(MarkerSymbol symbol) {
		this.symbol = symbol;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * Image markers only. Set the image width explicitly. When using this
	 * option, a `height` must also be set.
	 */
	public void setWidth(Number width) {
		this.width = width;
	}
}
