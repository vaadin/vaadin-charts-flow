package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Configure the accessibility strings in the chart. Requires the [accessibility
 * module](//code.highcharts.com/modules/accessibility. js) to be loaded. For a
 * description of the module and information on its features, see [Highcharts
 * Accessibility](http://www.highcharts. com/docs/chart-concepts/accessibility).
 * For more dynamic control over the accessibility functionality, see
 * [accessibility.pointDescriptionFormatter](
 * accessibility.pointDescriptionFormatter),
 * [accessibility.seriesDescriptionFormatter](
 * accessibility.seriesDescriptionFormatter), and
 * [accessibility.screenReaderSectionFormatter](
 * accessibility.screenReaderSectionFormatter).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class LangAccessibility extends AbstractConfigurationObject {

	private AxisAccessibility axis;
	private String chartContainerLabel;
	private String chartHeading;
	private ChartTypes chartTypes;
	private String defaultChartTitle;
	private ExportingAccessibility exporting;
	private String legendItem;
	private String longDescriptionHeading;
	private String mapZoomIn;
	private String mapZoomOut;
	private String navigationHint;
	private String noDescription;
	private String rangeSelectorButton;
	private String rangeSelectorMaxInput;
	private String rangeSelectorMinInput;
	private String screenReaderRegionLabel;
	private SeriesAccessibility series;
	private SeriesTypeDescriptions seriesTypeDescriptions;
	private String structureHeading;
	private String svgContainerTitle;
	private String tableSummary;
	private String viewAsDataTable;

	public LangAccessibility() {
	}

	/**
	 * @see #setAxis(AxisAccessibility)
	 */
	public AxisAccessibility getAxis() {
		if (axis == null) {
			axis = new AxisAccessibility();
		}
		return axis;
	}

	/**
	 * Axis description format strings.
	 */
	public void setAxis(AxisAccessibility axis) {
		this.axis = axis;
	}

	public String getChartContainerLabel() {
		return chartContainerLabel;
	}

	public void setChartContainerLabel(String chartContainerLabel) {
		this.chartContainerLabel = chartContainerLabel;
	}

	public String getChartHeading() {
		return chartHeading;
	}

	public void setChartHeading(String chartHeading) {
		this.chartHeading = chartHeading;
	}

	/**
	 * @see #setChartTypes(ChartTypes)
	 */
	public ChartTypes getChartTypes() {
		if (chartTypes == null) {
			chartTypes = new ChartTypes();
		}
		return chartTypes;
	}

	/**
	 * Chart type description strings. This is added to the chart information
	 * region. If there is only a single series type used in the chart, we use
	 * the format string for the series type, or default if missing. There is
	 * one format string for cases where there is only a single series in the
	 * chart, and one for multiple series of the same type.
	 */
	public void setChartTypes(ChartTypes chartTypes) {
		this.chartTypes = chartTypes;
	}

	public String getDefaultChartTitle() {
		return defaultChartTitle;
	}

	public void setDefaultChartTitle(String defaultChartTitle) {
		this.defaultChartTitle = defaultChartTitle;
	}

	/**
	 * @see #setExporting(ExportingAccessibility)
	 */
	public ExportingAccessibility getExporting() {
		if (exporting == null) {
			exporting = new ExportingAccessibility();
		}
		return exporting;
	}

	/**
	 * Exporting menu format strings for accessibility module.
	 */
	public void setExporting(ExportingAccessibility exporting) {
		this.exporting = exporting;
	}

	public String getLegendItem() {
		return legendItem;
	}

	public void setLegendItem(String legendItem) {
		this.legendItem = legendItem;
	}

	public String getLongDescriptionHeading() {
		return longDescriptionHeading;
	}

	public void setLongDescriptionHeading(String longDescriptionHeading) {
		this.longDescriptionHeading = longDescriptionHeading;
	}

	public String getMapZoomIn() {
		return mapZoomIn;
	}

	public void setMapZoomIn(String mapZoomIn) {
		this.mapZoomIn = mapZoomIn;
	}

	public String getMapZoomOut() {
		return mapZoomOut;
	}

	public void setMapZoomOut(String mapZoomOut) {
		this.mapZoomOut = mapZoomOut;
	}

	public String getNavigationHint() {
		return navigationHint;
	}

	public void setNavigationHint(String navigationHint) {
		this.navigationHint = navigationHint;
	}

	public String getNoDescription() {
		return noDescription;
	}

	public void setNoDescription(String noDescription) {
		this.noDescription = noDescription;
	}

	public String getRangeSelectorButton() {
		return rangeSelectorButton;
	}

	public void setRangeSelectorButton(String rangeSelectorButton) {
		this.rangeSelectorButton = rangeSelectorButton;
	}

	public String getRangeSelectorMaxInput() {
		return rangeSelectorMaxInput;
	}

	public void setRangeSelectorMaxInput(String rangeSelectorMaxInput) {
		this.rangeSelectorMaxInput = rangeSelectorMaxInput;
	}

	public String getRangeSelectorMinInput() {
		return rangeSelectorMinInput;
	}

	public void setRangeSelectorMinInput(String rangeSelectorMinInput) {
		this.rangeSelectorMinInput = rangeSelectorMinInput;
	}

	public String getScreenReaderRegionLabel() {
		return screenReaderRegionLabel;
	}

	public void setScreenReaderRegionLabel(String screenReaderRegionLabel) {
		this.screenReaderRegionLabel = screenReaderRegionLabel;
	}

	/**
	 * @see #setSeries(SeriesAccessibility)
	 */
	public SeriesAccessibility getSeries() {
		if (series == null) {
			series = new SeriesAccessibility();
		}
		return series;
	}

	/**
	 * Lang configuration for different series types. For more dynamic control
	 * over the series element descriptions, see
	 * [accessibility.seriesDescriptionFormatter](
	 * accessibility.seriesDescriptionFormatter).
	 */
	public void setSeries(SeriesAccessibility series) {
		this.series = series;
	}

	/**
	 * @see #setSeriesTypeDescriptions(SeriesTypeDescriptions)
	 */
	public SeriesTypeDescriptions getSeriesTypeDescriptions() {
		if (seriesTypeDescriptions == null) {
			seriesTypeDescriptions = new SeriesTypeDescriptions();
		}
		return seriesTypeDescriptions;
	}

	/**
	 * Descriptions of lesser known series types. The relevant description is
	 * added to the screen reader information region when these series types are
	 * used.
	 */
	public void setSeriesTypeDescriptions(
			SeriesTypeDescriptions seriesTypeDescriptions) {
		this.seriesTypeDescriptions = seriesTypeDescriptions;
	}

	public String getStructureHeading() {
		return structureHeading;
	}

	public void setStructureHeading(String structureHeading) {
		this.structureHeading = structureHeading;
	}

	/**
	 * @see #setSvgContainerTitle(String)
	 */
	public String getSvgContainerTitle() {
		return svgContainerTitle;
	}

	/**
	 * Title element text for the chart SVG element. Leave this empty to disable
	 * adding the title element. Browsers will display this content when
	 * hovering over elements in the chart. Assistive technology may use this
	 * element to label the chart.
	 */
	public void setSvgContainerTitle(String svgContainerTitle) {
		this.svgContainerTitle = svgContainerTitle;
	}

	public String getTableSummary() {
		return tableSummary;
	}

	public void setTableSummary(String tableSummary) {
		this.tableSummary = tableSummary;
	}

	public String getViewAsDataTable() {
		return viewAsDataTable;
	}

	public void setViewAsDataTable(String viewAsDataTable) {
		this.viewAsDataTable = viewAsDataTable;
	}
}
