package com.vaadin.flow.component.charts.model;

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
