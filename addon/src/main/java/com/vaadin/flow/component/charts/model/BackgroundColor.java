package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * The background color or gradient for the pane.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class BackgroundColor extends AbstractConfigurationObject {

	private LinearGradient linearGradient;
	private ArrayList<String[]> stops;

	public BackgroundColor() {
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

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("{");

		if (linearGradient != null) {
			result.append("\"linearGradient : {")
					.append("x1: " + linearGradient.getX1()).append(",")
					.append("x2: " + linearGradient.getX2()).append(",")
					.append("y1: " + linearGradient.getY1()).append(",")
					.append("y2: " + linearGradient.getY2())
					.append("}");
		}

		if (stops != null) {
			if (linearGradient != null) result.append(",");

			String stopsJson = stops.stream()
					.map(e -> Arrays.stream(e)
							.collect(Collectors.joining(", ", "[", "]")))
					.collect(Collectors.joining(", ", "[", "]"));

			result.append("stops: ").append(stopsJson);
		}

		result.append("}");

		return result.toString();
	}
}
