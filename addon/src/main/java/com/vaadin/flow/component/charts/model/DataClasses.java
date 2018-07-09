package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;
import java.time.Instant;
import com.vaadin.flow.component.charts.util.Util;

/**
 * An array of data classes or ranges for the choropleth map. If none given, the
 * color axis is scalar and values are distributed as a gradient between the
 * minimum and maximum colors.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class DataClasses extends AbstractConfigurationObject {

	private Color color;
	private Number from;
	private String name;
	private Number to;

	public DataClasses() {
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The color of each data class. If not set, the color is pulled from the
	 * global or chart-specific [colors](#colors) array. In styled mode, this
	 * option is ignored. Instead, use colors defined in CSS.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setFrom(Number)
	 */
	public Number getFrom() {
		return from;
	}

	/**
	 * The start of the value range that the data class represents, relating to
	 * the point value. The range of each `dataClass` is closed in both ends,
	 * but can be overridden by the next `dataClass`.
	 */
	public void setFrom(Number from) {
		this.from = from;
	}

	/**
	 * @see #setName(String)
	 */
	public String getName() {
		return name;
	}

	/**
	 * The name of the data class as it appears in the legend. If no name is
	 * given, it is automatically created based on the `from` and `to` values.
	 * For full programmatic control,
	 * [legend.labelFormatter](#legend.labelFormatter) can be used. In the
	 * formatter, `this.from` and `this.to` can be accessed.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see #setTo(Number)
	 */
	public Number getTo() {
		return to;
	}

	/**
	 * The end of the value range that the data class represents, relating to
	 * the point value. The range of each `dataClass` is closed in both ends,
	 * but can be overridden by the next `dataClass`.
	 */
	public void setTo(Number to) {
		this.to = to;
	}

	/**
	 * @see #setFrom(Number)
	 */
	public void setFrom(Instant instant) {
		this.from = Util.toHighchartsTS(instant);
	}

	/**
	 * @see #setTo(Number)
	 */
	public void setTo(Instant instant) {
		this.to = Util.toHighchartsTS(instant);
	}
}
