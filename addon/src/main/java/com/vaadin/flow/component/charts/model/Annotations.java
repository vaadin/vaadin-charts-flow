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
import java.util.ArrayList;

/**
 * Options for configuring annotations, for example labels, arrows or shapes.
 * Annotations can be tied to points, axis coordinates or chart pixel
 * coordinates.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Annotations extends AbstractConfigurationObject {

	private LabelOptions labelOptions;
	private ArrayList<AnnotationLabel> labels;
	private ShapeOptions shapeOptions;
	private ArrayList<AnnotationShape> shapes;
	private Boolean visible;
	private Number zIndex;

	public Annotations() {
	}

	/**
	 * @see #setLabelOptions(LabelOptions)
	 */
	public LabelOptions getLabelOptions() {
		if (labelOptions == null) {
			labelOptions = new LabelOptions();
		}
		return labelOptions;
	}

	/**
	 * Options for annotation's labels. Each label inherits options from the
	 * labelOptions object. An option from the labelOptions can be overwritten
	 * by config for a specific label.
	 */
	public void setLabelOptions(LabelOptions labelOptions) {
		this.labelOptions = labelOptions;
	}

	/**
	 * @see #setLabels(ArrayList)
	 */
	public ArrayList<AnnotationLabel> getLabels() {
		if (labels == null) {
			labels = new ArrayList<AnnotationLabel>();
		}
		return labels;
	}

	/**
	 * An array of labels for the annotation. For options that apply to multiple
	 * labels, they can be added to the
	 * [labelOptions](annotations.labelOptions.html).
	 */
	public void setLabels(ArrayList<AnnotationLabel> labels) {
		this.labels = labels;
	}

	/**
	 * @see #setShapeOptions(ShapeOptions)
	 */
	public ShapeOptions getShapeOptions() {
		if (shapeOptions == null) {
			shapeOptions = new ShapeOptions();
		}
		return shapeOptions;
	}

	/**
	 * Options for annotation's shapes. Each shape inherits options from the
	 * shapeOptions object. An option from the shapeOptions can be overwritten
	 * by config for a specific shape.
	 */
	public void setShapeOptions(ShapeOptions shapeOptions) {
		this.shapeOptions = shapeOptions;
	}

	/**
	 * @see #setShapes(ArrayList)
	 */
	public ArrayList<AnnotationShape> getShapes() {
		if (shapes == null) {
			shapes = new ArrayList<AnnotationShape>();
		}
		return shapes;
	}

	/**
	 * An array of shapes for the annotation. For options that apply to multiple
	 * shapes, then can be added to the
	 * [shapeOptions](annotations.shapeOptions.html).
	 */
	public void setShapes(ArrayList<AnnotationShape> shapes) {
		this.shapes = shapes;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Whether the annotation is visible.
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The Z index of the annotation.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
