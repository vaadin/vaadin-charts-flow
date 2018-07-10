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
