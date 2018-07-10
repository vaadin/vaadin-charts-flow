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

/**
 * An array of configuration objects for the buttons. Defaults to
 * 
 * <pre>
 * buttons: [{
 *     type: 'month',
 *     count: 1,
 *     text: '1m'
 * }, {
 *     type: 'month',
 *     count: 3,
 *     text: '3m'
 * }, {
 *     type: 'month',
 *     count: 6,
 *     text: '6m'
 * }, {
 *     type: 'ytd',
 *     text: 'YTD'
 * }, {
 *     type: 'year',
 *     count: 1,
 *     text: '1y'
 * }, {
 *     type: 'all',
 *     text: 'All'
 * }]
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class RangeSelectorButton extends AbstractConfigurationObject {

	private Number count;
	private DataGrouping dataGrouping;
	private Events events;
	private Number offsetMax;
	private Number offsetMin;
	private String text;
	private RangeSelectorTimespan type;

	public RangeSelectorButton() {
	}

	public RangeSelectorButton(String text) {
		this.text = text;
	}

	/**
	 * @see #setCount(Number)
	 */
	public Number getCount() {
		return count;
	}

	/**
	 * How many units of the defined type the button should span. If `type` is
	 * "month" and `count` is 3, the button spans three months.
	 */
	public void setCount(Number count) {
		this.count = count;
	}

	/**
	 * @see #setDataGrouping(DataGrouping)
	 */
	public DataGrouping getDataGrouping() {
		if (dataGrouping == null) {
			dataGrouping = new DataGrouping();
		}
		return dataGrouping;
	}

	/**
	 * A custom data grouping object for each button.
	 */
	public void setDataGrouping(DataGrouping dataGrouping) {
		this.dataGrouping = dataGrouping;
	}

	public Events getEvents() {
		if (events == null) {
			events = new Events();
		}
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	/**
	 * @see #setOffsetMax(Number)
	 */
	public Number getOffsetMax() {
		return offsetMax;
	}

	/**
	 * Additional range (in milliseconds) added to the end of the calculated
	 * time span.
	 */
	public void setOffsetMax(Number offsetMax) {
		this.offsetMax = offsetMax;
	}

	/**
	 * @see #setOffsetMin(Number)
	 */
	public Number getOffsetMin() {
		return offsetMin;
	}

	/**
	 * Additional range (in milliseconds) added to the start of the calculated
	 * time span.
	 */
	public void setOffsetMin(Number offsetMin) {
		this.offsetMin = offsetMin;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * The text for the button itself.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @see #setType(RangeSelectorTimespan)
	 */
	public RangeSelectorTimespan getType() {
		return type;
	}

	/**
	 * Defined the time span for the button. Can be one of `millisecond`,
	 * `second`, `minute`, `hour`, `day`, `week`, `month`, `ytd`, `all`.
	 */
	public void setType(RangeSelectorTimespan type) {
		this.type = type;
	}
}
