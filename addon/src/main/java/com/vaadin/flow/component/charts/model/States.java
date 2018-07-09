package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class States extends AbstractConfigurationObject {

	private Hover hover;
	private Normal normal;
	private Select select;

	public States() {
	}

	public Hover getHover() {
		if (hover == null) {
			hover = new Hover();
		}
		return hover;
	}

	public void setHover(Hover hover) {
		this.hover = hover;
	}

	/**
	 * @see #setNormal(Normal)
	 */
	public Normal getNormal() {
		if (normal == null) {
			normal = new Normal();
		}
		return normal;
	}

	/**
	 * The normal state of a single point marker. Currently only used for
	 * setting animation when returning to normal state from hover.
	 */
	public void setNormal(Normal normal) {
		this.normal = normal;
	}

	/**
	 * @see #setSelect(Select)
	 */
	public Select getSelect() {
		if (select == null) {
			select = new Select();
		}
		return select;
	}

	/**
	 * The appearance of the point marker when selected. In order to allow a
	 * point to be selected, set the `series.allowPointSelect` option to true.
	 */
	public void setSelect(Select select) {
		this.select = select;
	}
}
