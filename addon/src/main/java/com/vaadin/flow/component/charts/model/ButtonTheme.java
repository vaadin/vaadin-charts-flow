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
 * A collection of attributes for the buttons. The object takes SVG attributes
 * like `fill`, `stroke`, `stroke-width`, as well as `style`, a collection of
 * CSS properties for the text. The object can also be extended with states, so
 * you can set presentational options for `hover`, `select` or `disabled` button
 * states. CSS styles for the text label. In styled mode, the buttons are styled
 * by the `.highcharts-range-selector-buttons .highcharts-button` rule with its
 * different states.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ButtonTheme extends AbstractConfigurationObject {

	private Number height;
	private Number padding;
	private Number width;
	private Number zIndex;

	public ButtonTheme() {
	}

	public Number getHeight() {
		return height;
	}

	public void setHeight(Number height) {
		this.height = height;
	}

	public Number getPadding() {
		return padding;
	}

	public void setPadding(Number padding) {
		this.padding = padding;
	}

	public Number getWidth() {
		return width;
	}

	public void setWidth(Number width) {
		this.width = width;
	}

	public Number getZIndex() {
		return zIndex;
	}

	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
