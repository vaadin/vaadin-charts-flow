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
 * Provides the option to draw a frame around the charts by defining a bottom,
 * front and back panel.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Frame extends AbstractConfigurationObject {

	private FrameFace back;
	private FrameFace bottom;
	private FrameFace front;
	private FrameFace left;
	private FrameFace right;
	private FrameFace side;
	private Number size;
	private FrameFace top;
	private Boolean visible;

	public Frame() {
	}

	/**
	 * @see #setBack(FrameFace)
	 */
	public FrameFace getBack() {
		if (back == null) {
			back = new FrameFace();
		}
		return back;
	}

	/**
	 * The back side of the frame around a 3D chart.
	 */
	public void setBack(FrameFace back) {
		this.back = back;
	}

	/**
	 * @see #setBottom(FrameFace)
	 */
	public FrameFace getBottom() {
		if (bottom == null) {
			bottom = new FrameFace();
		}
		return bottom;
	}

	/**
	 * The bottom of the frame around a 3D chart.
	 */
	public void setBottom(FrameFace bottom) {
		this.bottom = bottom;
	}

	/**
	 * @see #setFront(FrameFace)
	 */
	public FrameFace getFront() {
		if (front == null) {
			front = new FrameFace();
		}
		return front;
	}

	/**
	 * The front of the frame around a 3D chart.
	 */
	public void setFront(FrameFace front) {
		this.front = front;
	}

	/**
	 * @see #setLeft(FrameFace)
	 */
	public FrameFace getLeft() {
		if (left == null) {
			left = new FrameFace();
		}
		return left;
	}

	/**
	 * The left side of the frame around a 3D chart.
	 */
	public void setLeft(FrameFace left) {
		this.left = left;
	}

	/**
	 * @see #setRight(FrameFace)
	 */
	public FrameFace getRight() {
		if (right == null) {
			right = new FrameFace();
		}
		return right;
	}

	/**
	 * The right of the frame around a 3D chart.
	 */
	public void setRight(FrameFace right) {
		this.right = right;
	}

	/**
	 * @see #setSide(FrameFace)
	 */
	public FrameFace getSide() {
		if (side == null) {
			side = new FrameFace();
		}
		return side;
	}

	/**
	 * Note: As of v5.0.12, `frame.left` or `frame.right` should be used
	 * instead. The side for the frame around a 3D chart.
	 */
	public void setSide(FrameFace side) {
		this.side = side;
	}

	/**
	 * @see #setSize(Number)
	 */
	public Number getSize() {
		return size;
	}

	/**
	 * General pixel thickness for the frame faces.
	 */
	public void setSize(Number size) {
		this.size = size;
	}

	/**
	 * @see #setTop(FrameFace)
	 */
	public FrameFace getTop() {
		if (top == null) {
			top = new FrameFace();
		}
		return top;
	}

	/**
	 * The top of the frame around a 3D chart.
	 */
	public void setTop(FrameFace top) {
		this.top = top;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Whether the frames are visible.
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
}
