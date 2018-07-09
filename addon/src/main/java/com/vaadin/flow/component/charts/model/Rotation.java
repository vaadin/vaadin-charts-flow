package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.time.Instant;
import com.vaadin.flow.component.charts.util.Util;

/**
 * Rotation options for the words in the wordcloud.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Rotation extends AbstractConfigurationObject {

	private Number from;
	private Number orientations;
	private Number to;

	public Rotation() {
	}

	/**
	 * @see #setFrom(Number)
	 */
	public Number getFrom() {
		return from;
	}

	/**
	 * The smallest degree of rotation for a word.
	 */
	public void setFrom(Number from) {
		this.from = from;
	}

	/**
	 * @see #setOrientations(Number)
	 */
	public Number getOrientations() {
		return orientations;
	}

	/**
	 * The number of possible orientations for a word, within the range of
	 * `rotation.from` and `rotation.to`.
	 */
	public void setOrientations(Number orientations) {
		this.orientations = orientations;
	}

	/**
	 * @see #setTo(Number)
	 */
	public Number getTo() {
		return to;
	}

	/**
	 * The largest degree of rotation for a word.
	 */
	public void setTo(Number to) {
		this.to = to;
	}

	/**
	 * @see #setFrom(Number)
	 */
	public void setFrom(Instant instant) {
		this.from = Util.toHighchartsTS(instant);
	}

	/**
	 * @see #setTo(Number)
	 */
	public void setTo(Instant instant) {
		this.to = Util.toHighchartsTS(instant);
	}
}
