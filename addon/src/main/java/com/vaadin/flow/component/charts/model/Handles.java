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
import java.util.ArrayList;

/**
 * Options for the handles for dragging the zoomed area.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Handles extends AbstractConfigurationObject {

	private Boolean enabled;
	private Number height;
	private Number lineWidth;
	private ArrayList<String> symbols;
	private Number width;

	public Handles() {
	}

	public Handles(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Allows to enable/disable handles.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * Height for handles.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setLineWidth(Number)
	 */
	public Number getLineWidth() {
		return lineWidth;
	}

	/**
	 * The width for the handle border and the stripes inside.
	 */
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @see #setSymbols(ArrayList)
	 */
	public ArrayList<String> getSymbols() {
		if (symbols == null) {
			symbols = new ArrayList<String>();
		}
		return symbols;
	}

	/**
	 * Array to define shapes of handles. 0-index for left, 1-index for right.
	 * Additionally, the URL to a graphic can be given on this form:
	 * `url(graphic.png)`. Note that for the image to be applied to exported
	 * charts, its URL needs to be accessible by the export server. Custom
	 * callbacks for symbol path generation can also be added to
	 * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
	 * its method name, as shown in the demo.
	 */
	public void setSymbols(ArrayList<String> symbols) {
		this.symbols = symbols;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * Width for handles.
	 */
	public void setWidth(Number width) {
		this.width = width;
	}
}
