package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;
/**
 * The bottom of the frame around a 3D chart.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Bottom extends AbstractConfigurationObject {

	private Color color;
	private Number size;

	public Bottom() {
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The color of the panel.
	 * <p>
	 * Defaults to: transparent
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
	 * <p>
	 * Defaults to: 1
	 */
	public void setSize(Number size) {
		this.size = size;
	}
}