package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;

/**
 * An array of shapes for the annotation. For options that apply to multiple
 * shapes, then can be added to the
 * [shapeOptions](annotations.shapeOptions.html).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class AnnotationShape extends ShapeOptions {

	private String markerEnd;
	private String markerStart;
	private LabelPoint point;
	private ArrayList<LabelPoint> points;

	public AnnotationShape() {
	}

	/**
	 * @see #setMarkerEnd(String)
	 */
	public String getMarkerEnd() {
		return markerEnd;
	}

	/**
	 * Id of the marker which will be drawn at the final vertex of the path.
	 * Custom markers can be defined in defs property.
	 */
	public void setMarkerEnd(String markerEnd) {
		this.markerEnd = markerEnd;
	}

	/**
	 * @see #setMarkerStart(String)
	 */
	public String getMarkerStart() {
		return markerStart;
	}

	/**
	 * Id of the marker which will be drawn at the first vertex of the path.
	 * Custom markers can be defined in defs property.
	 */
	public void setMarkerStart(String markerStart) {
		this.markerStart = markerStart;
	}

	/**
	 * @see #setPoint(LabelPoint)
	 */
	public LabelPoint getPoint() {
		if (point == null) {
			point = new LabelPoint();
		}
		return point;
	}

	/**
	 * This option defines the point to which the shape will be connected. It
	 * can be either the point which exists in the series - it is referenced by
	 * the point's id - or a new point with defined x, y properties and
	 * optionally axes.
	 */
	public void setPoint(LabelPoint point) {
		this.point = point;
	}

	/**
	 * @see #setPoints(ArrayList)
	 */
	public ArrayList<LabelPoint> getPoints() {
		if (points == null) {
			points = new ArrayList<LabelPoint>();
		}
		return points;
	}

	/**
	 * An array of points for the shape. This option is available for shapes
	 * which can use multiple points such as path. A point can be either a point
	 * object or a point's id.
	 */
	public void setPoints(ArrayList<LabelPoint> points) {
		this.points = points;
	}
}
