package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Options for a scrollable plot area. This feature provides a minimum width for
 * the plot area of the chart. If the width gets smaller than this, typically on
 * mobile devices, a native browser scrollbar is presented below the chart. This
 * scrollbar provides smooth scrolling for the contents of the plot area,
 * whereas the title, legend and axes are fixed.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ScrollablePlotArea extends AbstractConfigurationObject {

	private Number minWidth;
	private Number scrollPositionX;

	public ScrollablePlotArea() {
	}

	/**
	 * @see #setMinWidth(Number)
	 */
	public Number getMinWidth() {
		return minWidth;
	}

	/**
	 * The minimum width for the plot area. If it gets smaller than this, the
	 * plot area will become scrollable.
	 */
	public void setMinWidth(Number minWidth) {
		this.minWidth = minWidth;
	}

	/**
	 * @see #setScrollPositionX(Number)
	 */
	public Number getScrollPositionX() {
		return scrollPositionX;
	}

	/**
	 * The initial scrolling position of the scrollable plot area. Ranges from 0
	 * to 1, where 0 aligns the plot area to the left and 1 aligns it to the
	 * right. Typically we would use 1 if the chart has right aligned Y axes.
	 */
	public void setScrollPositionX(Number scrollPositionX) {
		this.scrollPositionX = scrollPositionX;
	}
}
