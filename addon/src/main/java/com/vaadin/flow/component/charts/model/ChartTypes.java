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
import java.util.Map;

/**
 * Chart type description strings. This is added to the chart information
 * region. If there is only a single series type used in the chart, we use the
 * format string for the series type, or default if missing. There is one format
 * string for cases where there is only a single series in the chart, and one
 * for multiple series of the same type.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ChartTypes extends AbstractConfigurationObject {

	private String barMultiple;
	private String barSingle;
	private String boxplotMultiple;
	private String boxplotSingle;
	private String bubbleMultiple;
	private String bubbleSingle;
	private String columnMultiple;
	private String columnSingle;
	private String combinationChart;
	private String defaultMultiple;
	private String defaultSingle;
	private String emptyChart;
	private String lineMultiple;
	private String lineSingle;
	private String mapTypeDescription;
	private String pieMultiple;
	private String pieSingle;
	private String scatterMultiple;
	private String scatterSingle;
	private String splineMultiple;
	private String splineSingle;
	private String unknownMap;

	public ChartTypes() {
	}

	public String getBarMultiple() {
		return barMultiple;
	}

	public void setBarMultiple(String barMultiple) {
		this.barMultiple = barMultiple;
	}

	public String getBarSingle() {
		return barSingle;
	}

	public void setBarSingle(String barSingle) {
		this.barSingle = barSingle;
	}

	public String getBoxplotMultiple() {
		return boxplotMultiple;
	}

	public void setBoxplotMultiple(String boxplotMultiple) {
		this.boxplotMultiple = boxplotMultiple;
	}

	public String getBoxplotSingle() {
		return boxplotSingle;
	}

	public void setBoxplotSingle(String boxplotSingle) {
		this.boxplotSingle = boxplotSingle;
	}

	public String getBubbleMultiple() {
		return bubbleMultiple;
	}

	public void setBubbleMultiple(String bubbleMultiple) {
		this.bubbleMultiple = bubbleMultiple;
	}

	public String getBubbleSingle() {
		return bubbleSingle;
	}

	public void setBubbleSingle(String bubbleSingle) {
		this.bubbleSingle = bubbleSingle;
	}

	public String getColumnMultiple() {
		return columnMultiple;
	}

	public void setColumnMultiple(String columnMultiple) {
		this.columnMultiple = columnMultiple;
	}

	public String getColumnSingle() {
		return columnSingle;
	}

	public void setColumnSingle(String columnSingle) {
		this.columnSingle = columnSingle;
	}

	public String getCombinationChart() {
		return combinationChart;
	}

	public void setCombinationChart(String combinationChart) {
		this.combinationChart = combinationChart;
	}

	public String getDefaultMultiple() {
		return defaultMultiple;
	}

	public void setDefaultMultiple(String defaultMultiple) {
		this.defaultMultiple = defaultMultiple;
	}

	public String getDefaultSingle() {
		return defaultSingle;
	}

	public void setDefaultSingle(String defaultSingle) {
		this.defaultSingle = defaultSingle;
	}

	public String getEmptyChart() {
		return emptyChart;
	}

	public void setEmptyChart(String emptyChart) {
		this.emptyChart = emptyChart;
	}

	public String getLineMultiple() {
		return lineMultiple;
	}

	public void setLineMultiple(String lineMultiple) {
		this.lineMultiple = lineMultiple;
	}

	public String getLineSingle() {
		return lineSingle;
	}

	public void setLineSingle(String lineSingle) {
		this.lineSingle = lineSingle;
	}

	public String getMapTypeDescription() {
		return mapTypeDescription;
	}

	public void setMapTypeDescription(String mapTypeDescription) {
		this.mapTypeDescription = mapTypeDescription;
	}

	public String getPieMultiple() {
		return pieMultiple;
	}

	public void setPieMultiple(String pieMultiple) {
		this.pieMultiple = pieMultiple;
	}

	public String getPieSingle() {
		return pieSingle;
	}

	public void setPieSingle(String pieSingle) {
		this.pieSingle = pieSingle;
	}

	public String getScatterMultiple() {
		return scatterMultiple;
	}

	public void setScatterMultiple(String scatterMultiple) {
		this.scatterMultiple = scatterMultiple;
	}

	public String getScatterSingle() {
		return scatterSingle;
	}

	public void setScatterSingle(String scatterSingle) {
		this.scatterSingle = scatterSingle;
	}

	public String getSplineMultiple() {
		return splineMultiple;
	}

	public void setSplineMultiple(String splineMultiple) {
		this.splineMultiple = splineMultiple;
	}

	public String getSplineSingle() {
		return splineSingle;
	}

	public void setSplineSingle(String splineSingle) {
		this.splineSingle = splineSingle;
	}

	public String getUnknownMap() {
		return unknownMap;
	}

	public void setUnknownMap(String unknownMap) {
		this.unknownMap = unknownMap;
	}
}
