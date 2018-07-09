package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Exporting menu format strings for accessibility module.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ExportingAccessibility extends AbstractConfigurationObject {

	private String chartMenuLabel;
	private String exportRegionLabel;
	private String menuButtonLabel;

	public ExportingAccessibility() {
	}

	public String getChartMenuLabel() {
		return chartMenuLabel;
	}

	public void setChartMenuLabel(String chartMenuLabel) {
		this.chartMenuLabel = chartMenuLabel;
	}

	public String getExportRegionLabel() {
		return exportRegionLabel;
	}

	public void setExportRegionLabel(String exportRegionLabel) {
		this.exportRegionLabel = exportRegionLabel;
	}

	public String getMenuButtonLabel() {
		return menuButtonLabel;
	}

	public void setMenuButtonLabel(String menuButtonLabel) {
		this.menuButtonLabel = menuButtonLabel;
	}
}
