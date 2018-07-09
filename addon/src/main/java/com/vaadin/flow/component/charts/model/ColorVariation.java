package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.time.Instant;
import com.vaadin.flow.component.charts.util.Util;

/**
 * Can set a `colorVariation` on all points which lies on the same level.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ColorVariation extends AbstractConfigurationObject {

	private String key;
	private Number to;

	public ColorVariation() {
	}

	/**
	 * @see #setKey(String)
	 */
	public String getKey() {
		return key;
	}

	/**
	 * The key of a color variation. Currently supports `brightness` only.
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @see #setTo(Number)
	 */
	public Number getTo() {
		return to;
	}

	/**
	 * The ending value of a color variation. The last sibling will receive this
	 * value.
	 */
	public void setTo(Number to) {
		this.to = to;
	}

	/**
	 * @see #setTo(Number)
	 */
	public void setTo(Instant instant) {
		this.to = Util.toHighchartsTS(instant);
	}
}
