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
import java.util.Arrays;
import java.util.ArrayList;

/**
 * The pane serves as a container for axes and backgrounds for circular gauges
 * and polar charts.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Pane extends AbstractConfigurationObject {

	private ArrayList<Background> background;
	private ArrayList<String> center;
	private Number endAngle;
	private String size;
	private Number startAngle;
	private Integer paneIndex;

	public Pane() {
	}

	public Pane(Number startAngle, Number endAngle) {
		this.startAngle = startAngle;
		this.endAngle = endAngle;
	}

	/**
	 * @see #setBackground(ArrayList)
	 */
	public ArrayList<Background> getBackground() {
		if (background == null) {
			background = new ArrayList<Background>();
		}
		return background;
	}

	/**
	 * An array of background items for the pane.
	 */
	public void setBackground(ArrayList<Background> background) {
		this.background = background;
	}

	/**
	 * @see #setCenter(ArrayList)
	 */
	public ArrayList<String> getCenter() {
		if (center == null) {
			center = new ArrayList<String>();
		}
		return center;
	}

	/**
	 * The center of a polar chart or angular gauge, given as an array of [x, y]
	 * positions. Positions can be given as integers that transform to pixels,
	 * or as percentages of the plot area size.
	 */
	public void setCenter(ArrayList<String> center) {
		this.center = center;
	}

	/**
	 * @see #setEndAngle(Number)
	 */
	public Number getEndAngle() {
		return endAngle;
	}

	/**
	 * The end angle of the polar X axis or gauge value axis, given in degrees
	 * where 0 is north. Defaults to [startAngle](#pane.startAngle) + 360.
	 */
	public void setEndAngle(Number endAngle) {
		this.endAngle = endAngle;
	}

	/**
	 * @see #setSize(String)
	 */
	public String getSize() {
		return size;
	}

	/**
	 * The size of the pane, either as a number defining pixels, or a percentage
	 * defining a percentage of the plot are.
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @see #setStartAngle(Number)
	 */
	public Number getStartAngle() {
		return startAngle;
	}

	/**
	 * The start angle of the polar X axis or gauge axis, given in degrees where
	 * 0 is north. Defaults to 0.
	 */
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
	}

	public Integer getPaneIndex() {
		return paneIndex;
	}

	public void setPaneIndex(Integer paneIndex) {
		this.paneIndex = paneIndex;
	}

	public void setCenter(String x, String y) {
		this.center = new ArrayList<>(Arrays.asList(x, y));
	}
}
