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

	public AnnotationLabel(String text) {
		setText(text);
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
