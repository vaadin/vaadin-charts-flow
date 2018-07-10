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
import java.util.ArrayList;

/**
 * The background color or gradient for the pane.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class GradientColor extends AbstractConfigurationObject implements Color {

	private LinearGradient linearGradient;
	private ArrayList<String[]> stops;

	public GradientColor() {
	}

	/**
	 * @see #setLinearGradient(LinearGradient)
	 */
	public LinearGradient getLinearGradient() {
		if (linearGradient == null) {
			linearGradient = new LinearGradient();
		}
		return linearGradient;
	}

	/**
	 * Definition of the gradient, similar to SVG: object literal holds start
	 * position (x1, y1) and the end position (x2, y2) relative to the shape,
	 * where 0 means top/left and 1 is bottom/right. All positions are floats
	 * between 0 and 1.
	 */
	public void setLinearGradient(LinearGradient linearGradient) {
		this.linearGradient = linearGradient;
	}

	/**
	 * @see #setStops(ArrayList)
	 */
	public ArrayList<String[]> getStops() {
		if (stops == null) {
			stops = new ArrayList<String[]>();
		}
		return stops;
	}

	/**
	 * The stops is an array of tuples, where the first item is a float between
	 * 0 and 1 assigning the relative position in the gradient, and the second
	 * item is the color.
	 */
	public void setStops(ArrayList<String[]> stops) {
		this.stops = stops;
	}
}
