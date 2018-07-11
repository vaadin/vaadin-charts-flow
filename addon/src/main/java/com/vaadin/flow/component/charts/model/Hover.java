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

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Hover extends AbstractConfigurationObject {

	private Boolean animation;
	private Boolean enabled;
	private Halo halo;
	private Marker marker;
	private Number radius;
	private Number radiusPlus;
	private Boolean shadow;

	public Hover() {
	}

	public Hover(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #setAnimation(Boolean)
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * Animation when hovering over the marker.
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the point marker.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Halo getHalo() {
		if (halo == null) {
			halo = new Halo();
		}
		return halo;
	}

	public void setHalo(Halo halo) {
		this.halo = halo;
	}

	/**
	 * @see #setMarker(Marker)
	 */
	public Marker getMarker() {
		if (marker == null) {
			marker = new Marker();
		}
		return marker;
	}

	/**
	 * In Highcharts 1.0, the appearance of all markers belonging to the hovered
	 * series. For settings on the hover state of the individual point, see
	 * [marker.states.hover](#plotOptions.series.marker.states.hover).
	 */
	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	/**
	 * @see #setRadius(Number)
	 */
	public Number getRadius() {
		return radius;
	}

	/**
	 * The radius of the point marker. In hover state, it defaults to the normal
	 * state's radius + 2 as per the [radiusPlus](
	 * #plotOptions.series.marker.states.hover.radiusPlus) option.
	 */
	public void setRadius(Number radius) {
		this.radius = radius;
	}

	/**
	 * @see #setRadiusPlus(Number)
	 */
	public Number getRadiusPlus() {
		return radiusPlus;
	}

	/**
	 * The number of pixels to increase the radius of the hovered point.
	 */
	public void setRadiusPlus(Number radiusPlus) {
		this.radiusPlus = radiusPlus;
	}

	/**
	 * @see #setShadow(Boolean)
	 */
	public Boolean getShadow() {
		return shadow;
	}

	/**
	 * The shadow option for hovered state.
	 */
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}
}
