package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Data labels for the gauge. For gauges, the data labels are enabled by default
 * and shown in a bordered box below the point.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class DataLabelsGauge extends DataLabels {

	private Boolean crop;
	private Boolean defer;
	private Boolean enabled;
	private VerticalAlign verticalAlign;
	private Number y;
	private Number zIndex;

	public DataLabelsGauge() {
	}

	public DataLabelsGauge(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getCrop() {
		return crop;
	}

	public void setCrop(Boolean crop) {
		this.crop = crop;
	}

	public Boolean getDefer() {
		return defer;
	}

	public void setDefer(Boolean defer) {
		this.defer = defer;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the data labels.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * The vertical alignment of the data label.
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * The y position offset of the label relative to the center of the gauge.
	 */
	public void setY(Number y) {
		this.y = y;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The Z index of the data labels. A value of 2 display them behind the
	 * dial.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
