package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class DataLabelsPivotPoints extends AbstractConfigurationObject {

	private Boolean enabled;
	private String format;

	public DataLabelsPivotPoints() {
	}

	public DataLabelsPivotPoints(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}
