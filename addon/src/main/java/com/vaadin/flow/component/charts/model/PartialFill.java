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
 * A partial fill for each point, typically used to visualize how much of a task
 * is performed. The partial fill object can be set either on series or point
 * level.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PartialFill extends AbstractConfigurationObject {

	private Number amount;
	private Color fill;

	public PartialFill() {
	}

	/**
	 * @see #setAmount(Number)
	 */
	public Number getAmount() {
		return amount;
	}

	/**
	 * The amount of the X-range point to be filled. Values can be 0-1 and are
	 * converted to percentages in the default data label formatter.
	 */
	public void setAmount(Number amount) {
		this.amount = amount;
	}

	/**
	 * @see #setFill(Color)
	 */
	public Color getFill() {
		return fill;
	}

	/**
	 * The fill color to be used for partial fills. Defaults to a darker shade
	 * of the point color.
	 */
	public void setFill(Color fill) {
		this.fill = fill;
	}
}
