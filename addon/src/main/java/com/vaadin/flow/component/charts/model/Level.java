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
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * Set options on specific levels. Takes precedence over series options, but not
 * point options.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Level extends AbstractConfigurationObject {

	private ColorVariation colorVariation;
	private DataLabels dataLabels;
	private String layoutAlgorithm;
	private String layoutStartingDirection;
	private Number level;
	private LevelSize levelSize;
	private Number rotation;
	private String rotationMode;

	public Level() {
	}

	/**
	 * @see #setColorVariation(ColorVariation)
	 */
	public ColorVariation getColorVariation() {
		if (colorVariation == null) {
			colorVariation = new ColorVariation();
		}
		return colorVariation;
	}

	/**
	 * Can set a `colorVariation` on all points which lies on the same level.
	 */
	public void setColorVariation(ColorVariation colorVariation) {
		this.colorVariation = colorVariation;
	}

	/**
	 * @see #setDataLabels(DataLabels)
	 */
	public DataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new DataLabels();
		}
		return dataLabels;
	}

	/**
	 * Can set a `dataLabels` on all points which lies on the same level.
	 */
	public void setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
	}

	/**
	 * @see #setLayoutAlgorithm(String)
	 */
	public String getLayoutAlgorithm() {
		return layoutAlgorithm;
	}

	/**
	 * Can set the layoutAlgorithm option on a specific level.
	 */
	public void setLayoutAlgorithm(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
	}

	/**
	 * @see #setLayoutStartingDirection(String)
	 */
	public String getLayoutStartingDirection() {
		return layoutStartingDirection;
	}

	/**
	 * Can set the layoutStartingDirection option on a specific level.
	 */
	public void setLayoutStartingDirection(String layoutStartingDirection) {
		this.layoutStartingDirection = layoutStartingDirection;
	}

	/**
	 * @see #setLevel(Number)
	 */
	public Number getLevel() {
		return level;
	}

	/**
	 * Decides which level takes effect from the options set in the levels
	 * object.
	 */
	public void setLevel(Number level) {
		this.level = level;
	}

	/**
	 * @see #setLevelSize(LevelSize)
	 */
	public LevelSize getLevelSize() {
		if (levelSize == null) {
			levelSize = new LevelSize();
		}
		return levelSize;
	}

	/**
	 * Can set a `levelSize` on all points which lies on the same level.
	 */
	public void setLevelSize(LevelSize levelSize) {
		this.levelSize = levelSize;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * Can set a `rotation` on all points which lies on the same level.
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setRotationMode(String)
	 */
	public String getRotationMode() {
		return rotationMode;
	}

	/**
	 * Can set a `rotationMode` on all points which lies on the same level.
	 */
	public void setRotationMode(String rotationMode) {
		this.rotationMode = rotationMode;
	}
}
