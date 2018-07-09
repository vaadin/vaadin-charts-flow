package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Positioning for the button row.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ButtonPosition extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Number x;
	private Number y;

	public ButtonPosition() {
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

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * X offset of the button row.
	 */
	public void setX(Number x) {
		this.x = x;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * Y offset of the button row.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
