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
 * Definition of the gradient, similar to SVG: object literal holds start
 * position (x1, y1) and the end position (x2, y2) relative to the shape, where
 * 0 means top/left and 1 is bottom/right. All positions are floats between 0
 * and 1.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class LinearGradient extends AbstractConfigurationObject {

	private Number x1;
	private Number x2;
	private Number y1;
	private Number y2;

	public LinearGradient() {
	}

	public Number getX1() {
		return x1;
	}

	public void setX1(Number x1) {
		this.x1 = x1;
	}

	public Number getX2() {
		return x2;
	}

	public void setX2(Number x2) {
		this.x2 = x2;
	}

	public Number getY1() {
		return y1;
	}

	public void setY1(Number y1) {
		this.y1 = y1;
	}

	public Number getY2() {
		return y2;
	}

	public void setY2(Number y2) {
		this.y2 = y2;
	}
}
