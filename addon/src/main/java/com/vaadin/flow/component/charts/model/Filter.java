package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A declarative filter for which data labels to display. The declarative filter
 * is designed for use when callback functions are not available, like when the
 * chart options require a pure JSON structure or for use with graphical
 * editors. For programmatic control, use the `formatter` instead, and return
 * `false` to disable a single data label.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Filter extends AbstractConfigurationObject {

	private String operator;
	private String property;
	private Number value;

	public Filter() {
	}

	/**
	 * @see #setOperator(String)
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * The operator to compare by. Can be one of `>`, `<`, `>=`, `<=`, `==`, and
	 * `===`.
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @see #setProperty(String)
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * The point property to filter by. Point options are passed directly to
	 * properties, additionally there are `y` value, `percentage` and others
	 * listed under
	 * [Point](https://api.highcharts.com/class-reference/Highcharts.Point)
	 * members.
	 */
	public void setProperty(String property) {
		this.property = property;
	}

	/**
	 * @see #setValue(Number)
	 */
	public Number getValue() {
		return value;
	}

	/**
	 * The value to compare against.
	 */
	public void setValue(Number value) {
		this.value = value;
	}
}
