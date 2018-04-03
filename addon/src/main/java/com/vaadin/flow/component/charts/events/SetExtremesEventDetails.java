package com.vaadin.flow.component.charts.events;

import java.io.Serializable;

/**
 * Helper class to store and transfer set extremes event details.
 */
public class SetExtremesEventDetails implements Serializable {
	private double minimun;
	private double maximum;

	public double getMinimun() {
		return minimun;
	}

	public void setMinimun(double minimun) {
		this.minimun = minimun;
	}

	public double getMaximum() {
		return maximum;
	}

	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}
}
