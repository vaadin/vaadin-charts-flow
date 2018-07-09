package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * The position of the button.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Position extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;

	public Position() {
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * Horizontal alignment of the button.
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * Vertical alignment of the button.
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * Horizontal offset of the button.
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
	 * Vertical offset of the button.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
