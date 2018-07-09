package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.LinkedHashMap;

/**
 * Options for displaying a message like "No data to display". This feature
 * requires the file no-data-to-display.js to be loaded in the page. The actual
 * text to display is set in the lang.noData option.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class NoData extends AbstractConfigurationObject {

	private LinkedHashMap<String, String> attr;
	private Position position;
	private Boolean useHTML;

	public NoData() {
	}

	/**
	 * @see #setAttr(LinkedHashMap)
	 */
	public LinkedHashMap<String, String> getAttr() {
		if (attr == null) {
			attr = new LinkedHashMap<String, String>();
		}
		return attr;
	}

	/**
	 * An object of additional SVG attributes for the no-data label.
	 */
	public void setAttr(LinkedHashMap<String, String> attr) {
		this.attr = attr;
	}

	/**
	 * @see #setPosition(Position)
	 */
	public Position getPosition() {
		if (position == null) {
			position = new Position();
		}
		return position;
	}

	/**
	 * The position of the no-data label, relative to the plot area.
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @see #setUseHTML(Boolean)
	 */
	public Boolean getUseHTML() {
		return useHTML;
	}

	/**
	 * Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG.
	 */
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}
}
