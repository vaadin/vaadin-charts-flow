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
 * Options for the data labels appearing on top of the nodes and links. For
 * sankey charts, data labels are visible for the nodes by default, but hidden
 * for links. This is controlled by modifying the `nodeFormat`, and the `format`
 * that applies to links and is an empty string by default.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class SankeyDataLabels extends AbstractConfigurationObject {

	private String backgroundColor;
	private Boolean crop;
	private Boolean enabled;
	private String format;
	private String _fn_formatter;
	private Boolean inside;
	private String nodeFormat;
	private String _fn_nodeFormatter;

	public SankeyDataLabels() {
	}

	public SankeyDataLabels(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Boolean getCrop() {
		return crop;
	}

	public void setCrop(Boolean crop) {
		this.crop = crop;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFormat(String)
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * The [format string](http://www.highcharts.com/docs/chart-
	 * concepts/labels-and-string-formatting) specifying what to show for
	 * _links_ in the sankey diagram. Defaults to an empty string returned from
	 * the `formatter`, in effect disabling the labels.
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @see #set_fn_formatter(String)
	 */
	public String getFormatter() {
		return _fn_formatter;
	}

	/**
	 * Callback to format data labels for _links_ in the sankey diagram. The
	 * `format` option takes precedence over the `formatter`.
	 */
	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	public Boolean getInside() {
		return inside;
	}

	public void setInside(Boolean inside) {
		this.inside = inside;
	}

	/**
	 * @see #setNodeFormat(String)
	 */
	public String getNodeFormat() {
		return nodeFormat;
	}

	/**
	 * The [format string](http://www.highcharts.com/docs/chart-
	 * concepts/labels-and-string-formatting) specifying what to show for
	 * _nodes_ in the sankey diagram. By default the `nodeFormatter` returns
	 * `{point.name}`.
	 */
	public void setNodeFormat(String nodeFormat) {
		this.nodeFormat = nodeFormat;
	}

	/**
	 * @see #set_fn_nodeFormatter(String)
	 */
	public String getNodeFormatter() {
		return _fn_nodeFormatter;
	}

	/**
	 * Callback to format data labels for _nodes_ in the sankey diagram. The
	 * `nodeFormat` option takes precedence over the `nodeFormatter`.
	 */
	public void setNodeFormatter(String _fn_nodeFormatter) {
		this._fn_nodeFormatter = _fn_nodeFormatter;
	}
}
