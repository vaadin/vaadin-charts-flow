package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A collection of attributes for the button. The object takes SVG attributes
 * like `fill`, `stroke`, `stroke-width` or `r`, the border radius. The theme
 * also supports `style`, a collection of CSS properties for the text.
 * Equivalent attributes for the hover state are given in `theme.states.hover`.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Theme extends AbstractConfigurationObject {

	private String fill;
	private Number padding;
	private String stroke;
	private Number zIndex;

	public Theme() {
	}

	/**
	 * @see #setFill(String)
	 */
	public String getFill() {
		return fill;
	}

	/**
	 * The default fill exists only to capture hover events.
	 */
	public void setFill(String fill) {
		this.fill = fill;
	}

	public Number getPadding() {
		return padding;
	}

	public void setPadding(Number padding) {
		this.padding = padding;
	}

	public String getStroke() {
		return stroke;
	}

	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The Z index for the reset zoom button. The default value places it below
	 * the tooltip that has Z index 7.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
