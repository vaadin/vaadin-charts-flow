package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Configure a crosshair that follows either the mouse pointer or the hovered
 * point. In styled mode, the crosshairs are styled in the
 * `.highcharts-crosshair`, `.highcharts-crosshair-thin` or
 * `.highcharts-xaxis-category` classes.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Crosshair extends AbstractConfigurationObject {

	private String className;
	private CrosshairLabel label;
	private Boolean snap;
	private Number zIndex;

	public Crosshair() {
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A class name for the crosshair, especially as a hook for styling.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setLabel(CrosshairLabel)
	 */
	public CrosshairLabel getLabel() {
		if (label == null) {
			label = new CrosshairLabel();
		}
		return label;
	}

	/**
	 * A label on the axis next to the crosshair. In styled mode, the label is
	 * styled with the `.highcharts-crosshair-label` class.
	 */
	public void setLabel(CrosshairLabel label) {
		this.label = label;
	}

	/**
	 * @see #setSnap(Boolean)
	 */
	public Boolean getSnap() {
		return snap;
	}

	/**
	 * Whether the crosshair should snap to the point or follow the pointer
	 * independent of points.
	 */
	public void setSnap(Boolean snap) {
		this.snap = snap;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The Z index of the crosshair. Higher Z indices allow drawing the
	 * crosshair on top of the series or behind the grid lines.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
