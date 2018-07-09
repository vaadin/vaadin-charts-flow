package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class TreemapDataLabels extends DataLabels {

	private Boolean defer;
	private Boolean enabled;
	private String _fn_formatter;
	private Boolean inside;
	private VerticalAlign verticalAlign;

	public TreemapDataLabels() {
	}

	public TreemapDataLabels(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getDefer() {
		return defer;
	}

	public void setDefer(Boolean defer) {
		this.defer = defer;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getFormatter() {
		return _fn_formatter;
	}

	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	public Boolean getInside() {
		return inside;
	}

	public void setInside(Boolean inside) {
		this.inside = inside;
	}

	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}
}
