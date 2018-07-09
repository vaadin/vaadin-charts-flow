package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Debugging options for boost. Useful for benchmarking, and general timing.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Debug extends AbstractConfigurationObject {

	private Boolean showSkipSummary;
	private Boolean timeBufferCopy;
	private Boolean timeKDTree;
	private Boolean timeRendering;
	private Boolean timeSeriesProcessing;
	private Boolean timeSetup;

	public Debug() {
	}

	/**
	 * @see #setShowSkipSummary(Boolean)
	 */
	public Boolean getShowSkipSummary() {
		return showSkipSummary;
	}

	/**
	 * Show the number of points skipped through culling. When set to true, the
	 * number of points skipped in series processing is outputted. Points are
	 * skipped if they are closer than 1 pixel from each other.
	 */
	public void setShowSkipSummary(Boolean showSkipSummary) {
		this.showSkipSummary = showSkipSummary;
	}

	/**
	 * @see #setTimeBufferCopy(Boolean)
	 */
	public Boolean getTimeBufferCopy() {
		return timeBufferCopy;
	}

	/**
	 * Time the WebGL to SVG buffer copy After rendering, the result is copied
	 * to an image which is injected into the SVG. If this property is set to
	 * true, the time it takes for the buffer copy to complete is outputted.
	 */
	public void setTimeBufferCopy(Boolean timeBufferCopy) {
		this.timeBufferCopy = timeBufferCopy;
	}

	/**
	 * @see #setTimeKDTree(Boolean)
	 */
	public Boolean getTimeKDTree() {
		return timeKDTree;
	}

	/**
	 * Time the building of the k-d tree. This outputs the time spent building
	 * the k-d tree used for markers etc. Note that the k-d tree is built async,
	 * and runs post-rendering. Following, it does not affect the performance of
	 * the rendering itself.
	 */
	public void setTimeKDTree(Boolean timeKDTree) {
		this.timeKDTree = timeKDTree;
	}

	/**
	 * @see #setTimeRendering(Boolean)
	 */
	public Boolean getTimeRendering() {
		return timeRendering;
	}

	/**
	 * Time the series rendering. This outputs the time spent on actual
	 * rendering in the console when set to true.
	 */
	public void setTimeRendering(Boolean timeRendering) {
		this.timeRendering = timeRendering;
	}

	/**
	 * @see #setTimeSeriesProcessing(Boolean)
	 */
	public Boolean getTimeSeriesProcessing() {
		return timeSeriesProcessing;
	}

	/**
	 * Time the series processing. This outputs the time spent on transforming
	 * the series data to vertex buffers when set to true.
	 */
	public void setTimeSeriesProcessing(Boolean timeSeriesProcessing) {
		this.timeSeriesProcessing = timeSeriesProcessing;
	}

	/**
	 * @see #setTimeSetup(Boolean)
	 */
	public Boolean getTimeSetup() {
		return timeSetup;
	}

	/**
	 * Time the the WebGL setup. This outputs the time spent on setting up the
	 * WebGL context, creating shaders, and textures.
	 */
	public void setTimeSetup(Boolean timeSetup) {
		this.timeSetup = timeSetup;
	}
}
