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
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * A face of the frame around a 3D chart. Could represent the back, front,
 * bottom, top, left, right face.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class FrameFace extends AbstractConfigurationObject {

	private Color color;
	private Number size;
	private Boolean visible;

	public FrameFace() {
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The color of the panel.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setSize(Number)
	 */
	public Number getSize() {
		return size;
	}

	/**
	 * The thickness of the panel.
	 */
	public void setSize(Number size) {
		this.size = size;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Whether to display the frame. Possible values are `true`, `false`,
	 * `"auto"` to display only the frames behind the data, and `"default"` to
	 * display faces behind the data based on the axis layout, ignoring the
	 * point of view.
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
}
