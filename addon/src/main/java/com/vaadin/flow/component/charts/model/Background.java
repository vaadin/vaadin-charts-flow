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
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * An array of background items for the pane.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Background extends AbstractConfigurationObject {

	private Color backgroundColor;
	private String className;
	private String innerRadius;
	private String outerRadius;
	private Shape shape;

	public Background() {
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * The background color or gradient for the pane.
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * The class name for this background.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setInnerRadius(String)
	 */
	public String getInnerRadius() {
		return innerRadius;
	}

	/**
	 * The inner radius of the pane background. Can be either numeric (pixels)
	 * or a percentage string.
	 */
	public void setInnerRadius(String innerRadius) {
		this.innerRadius = innerRadius;
	}

	/**
	 * @see #setOuterRadius(String)
	 */
	public String getOuterRadius() {
		return outerRadius;
	}

	/**
	 * The outer radius of the circular pane background. Can be either numeric
	 * (pixels) or a percentage string.
	 */
	public void setOuterRadius(String outerRadius) {
		this.outerRadius = outerRadius;
	}

	/**
	 * @see #setShape(Shape)
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * Tha shape of the pane background. When `solid`, the background is
	 * circular. When `arc`, the background extends only from the min to the max
	 * of the value axis.
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}
}
