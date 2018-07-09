package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Determines the width of the ring per level.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class LevelSize extends AbstractConfigurationObject {

	private String unit;
	private Number value;

	public LevelSize() {
	}

	/**
	 * @see #setUnit(String)
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * How to interpret `levelSize.value`. `percentage` gives a width relative
	 * to result of outer radius minus inner radius. `pixels` gives the ring a
	 * fixed width in pixels. `weight` takes the remaining width after
	 * percentage and pixels, and distributes it accross all "weighted" levels.
	 * The value relative to the sum of all weights determines the width.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @see #setValue(Number)
	 */
	public Number getValue() {
		return value;
	}

	/**
	 * The value used for calculating the width of the ring. Its' affect is
	 * determined by `levelSize.unit`.
	 */
	public void setValue(Number value) {
		this.value = value;
	}
}
