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
 * For a datetime axis, the scale will automatically adjust to the appropriate
 * unit. This member gives the default string representations used for each
 * unit. For intermediate values, different units may be used, for example the
 * `day` unit can be used on midnight and `hour` unit be used for intermediate
 * values on the same axis. For an overview of the replacement codes, see
 * [dateFormat](#Highcharts.dateFormat). Defaults to:
 * 
 * <pre>
 * {
 *     millisecond: '%H:%M:%S.%L',
 *     second: '%H:%M:%S',
 *     minute: '%H:%M',
 *     hour: '%H:%M',
 *     day: '%e. %b',
 *     week: '%e. %b',
 *     month: '%b \'%y',
 *     year: '%Y'
 * }
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class DateTimeLabelFormats extends AbstractConfigurationObject {

	private String day;
	private String hour;
	private String millisecond;
	private String minute;
	private String month;
	private String second;
	private String week;
	private String year;

	public DateTimeLabelFormats() {
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMillisecond() {
		return millisecond;
	}

	public void setMillisecond(String millisecond) {
		this.millisecond = millisecond;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
