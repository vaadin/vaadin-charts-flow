package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Halo extends AbstractConfigurationObject {

	private Boolean enabled;
	private Number size;

	public Halo() {
	}

	public Halo(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Number getSize() {
		return size;
	}

	public void setSize(Number size) {
		this.size = size;
	}
}
