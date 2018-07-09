package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Positioning for the input boxes. Allowed properties are `align`, `x` and `y`.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class InputPosition extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Number x;
	private Number y;

	public InputPosition() {
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * The alignment of the input box. Allowed properties are `left`, `center`,
	 * `right`.
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	public Number getX() {
		return x;
	}

	public void setX(Number x) {
		this.x = x;
	}

	public Number getY() {
		return y;
	}

	public void setY(Number y) {
		this.y = y;
	}
}
