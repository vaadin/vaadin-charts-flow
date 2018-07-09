package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * An array of objects representing plot lines on the X axis
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotLine extends AbstractConfigurationObject {

	private String className;
	private String id;
	private Label label;
	private Number value;
	private Number zIndex;

	public PlotLine() {
	}

	public PlotLine(Number value) {
		this.value = value;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A custom class name, in addition to the default `highcharts-plot-line`,
	 * to apply to each individual line.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setId(String)
	 */
	public String getId() {
		return id;
	}

	/**
	 * An id used for identifying the plot line in Axis.removePlotLine.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @see #setLabel(Label)
	 */
	public Label getLabel() {
		if (label == null) {
			label = new Label();
		}
		return label;
	}

	/**
	 * Text labels for the plot bands
	 */
	public void setLabel(Label label) {
		this.label = label;
	}

	/**
	 * @see #setValue(Number)
	 */
	public Number getValue() {
		return value;
	}

	/**
	 * The position of the line in axis units.
	 */
	public void setValue(Number value) {
		this.value = value;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The z index of the plot line within the chart.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
