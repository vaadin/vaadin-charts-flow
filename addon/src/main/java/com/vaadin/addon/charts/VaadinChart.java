package com.vaadin.addon.charts;


import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.util.ChartSerialization;
import com.vaadin.annotations.HtmlImport;
import com.vaadin.annotations.Tag;
import com.vaadin.flow.template.PolymerTemplate;
import com.vaadin.flow.template.model.TemplateModel;
import com.vaadin.ui.AttachEvent;
import com.vaadin.ui.UI;
import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

@Tag("vaadin-chart")
@HtmlImport("frontend://bower_components/vaadin-charts/vaadin-chart.html")
public class VaadinChart extends PolymerTemplate<TemplateModel> {

	private Configuration configuration;

	public VaadinChart() {
		this.configuration = new Configuration();
	}

	@Override
	protected void onAttach(AttachEvent attachEvent) {
		super.onAttach(attachEvent);

		final UI ui = attachEvent.getUI();

	 	ui.beforeClientResponse(this, () -> {
			drawChart();
		});
	}

	public void drawChart() {
		drawChart(false);
	}

	public void drawChart(boolean resetConfiguration) {
		Configuration configuration = getConfiguration();

		final JreJsonFactory jsonFactory = new JreJsonFactory();
		final JsonObject configurationNode = jsonFactory.parse(ChartSerialization.toJSON(configuration));

		getElement().callFunction("update", configurationNode, resetConfiguration);
	}

	public Configuration getConfiguration() {
		return configuration;
	}
}
