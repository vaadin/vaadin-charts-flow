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
 * Descriptions of lesser known series types. The relevant description is added
 * to the screen reader information region when these series types are used.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class SeriesTypeDescriptions extends AbstractConfigurationObject {

	private String arearange;
	private String areasplinerange;
	private String boxplot;
	private String bubble;
	private String columnrange;
	private String errorbar;
	private String funnel;
	private String pyramid;
	private String waterfall;

	public SeriesTypeDescriptions() {
	}

	public String getArearange() {
		return arearange;
	}

	public void setArearange(String arearange) {
		this.arearange = arearange;
	}

	public String getAreasplinerange() {
		return areasplinerange;
	}

	public void setAreasplinerange(String areasplinerange) {
		this.areasplinerange = areasplinerange;
	}

	public String getBoxplot() {
		return boxplot;
	}

	public void setBoxplot(String boxplot) {
		this.boxplot = boxplot;
	}

	public String getBubble() {
		return bubble;
	}

	public void setBubble(String bubble) {
		this.bubble = bubble;
	}

	public String getColumnrange() {
		return columnrange;
	}

	public void setColumnrange(String columnrange) {
		this.columnrange = columnrange;
	}

	public String getErrorbar() {
		return errorbar;
	}

	public void setErrorbar(String errorbar) {
		this.errorbar = errorbar;
	}

	public String getFunnel() {
		return funnel;
	}

	public void setFunnel(String funnel) {
		this.funnel = funnel;
	}

	public String getPyramid() {
		return pyramid;
	}

	public void setPyramid(String pyramid) {
		this.pyramid = pyramid;
	}

	public String getWaterfall() {
		return waterfall;
	}

	public void setWaterfall(String waterfall) {
		this.waterfall = waterfall;
	}
}
