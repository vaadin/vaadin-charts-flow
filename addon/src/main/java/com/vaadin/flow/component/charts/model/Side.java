package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * Note: As of v5.0.12, `frame.left` or `frame.right` should be used instead.
 * The side for the frame around a 3D chart.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Side extends AbstractConfigurationObject {

	private Color color;
	private Number size;

	public Side() {
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The color of the panel.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setSize(Number)
	 */
	public Number getSize() {
		return size;
	}

	/**
	 * The thickness of the panel.
	 */
	public void setSize(Number size) {
		this.size = size;
	}
}
