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
 * Style options for the focus border drawn around elements while navigating
 * through them. Note that some browsers in addition draw their own borders for
 * focused elements. These automatic borders can not be styled by Highcharts. In
 * styled mode, the border is given the `.highcharts-focus-border` class.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class FocusBorderStyle extends AbstractConfigurationObject {

	private Number borderRadius;
	private Color color;
	private Number lineWidth;

	public FocusBorderStyle() {
	}

	/**
	 * @see #setBorderRadius(Number)
	 */
	public Number getBorderRadius() {
		return borderRadius;
	}

	/**
	 * Border radius of the focus border.
	 */
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Color of the focus border.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setLineWidth(Number)
	 */
	public Number getLineWidth() {
		return lineWidth;
	}

	/**
	 * Line width of the focus border.
	 */
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}
}
