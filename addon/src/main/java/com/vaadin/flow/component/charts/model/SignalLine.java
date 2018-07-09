package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * The styles for signal line
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class SignalLine extends AbstractConfigurationObject {

	private Styles styles;
	private ArrayList<Zone> zones;

	public SignalLine() {
	}

	public Styles getStyles() {
		if (styles == null) {
			styles = new Styles();
		}
		return styles;
	}

	public void setStyles(Styles styles) {
		this.styles = styles;
	}

	public ArrayList<Zone> getZones() {
		if (zones == null) {
			zones = new ArrayList<Zone>();
		}
		return zones;
	}

	public void setZones(ArrayList<Zone> zones) {
		this.zones = zones;
	}

	public void setZones(Zone... zones) {
		this.zones = new ArrayList<Zone>(Arrays.asList(zones));
	}

	public void addZone(Zone zone) {
		if (this.zones == null) {
			this.zones = new ArrayList<Zone>();
		}
		this.zones.add(zone);
	}

	public void removeZone(Zone zone) {
		this.zones.remove(zone);
	}
}
