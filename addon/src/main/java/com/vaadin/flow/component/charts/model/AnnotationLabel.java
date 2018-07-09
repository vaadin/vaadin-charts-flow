package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * An array of labels for the annotation. For options that apply to multiple
 * labels, they can be added to the
 * [labelOptions](annotations.labelOptions.html).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class AnnotationLabel extends LabelOptions {

	private LabelPoint point;

	public AnnotationLabel() {
	}

	/**
	 * @see #setPoint(LabelPoint)
	 */
	public LabelPoint getPoint() {
		if (point == null) {
			point = new LabelPoint();
		}
		return point;
	}

	/**
	 * This option defines the point to which the label will be connected. It
	 * can be either the point which exists in the series - it is referenced by
	 * the point's id - or a new point with defined x, y properies and
	 * optionally axes.
	 */
	public void setPoint(LabelPoint point) {
		this.point = point;
	}
}
