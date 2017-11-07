package com.vaadin.addon.charts;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.Id;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

@Tag("chart-demo")
@HtmlImport("frontend://src/chart-demo/chart-demo.html")
public class ChartDemo extends PolymerTemplate<ChartDemo.Model> {

    public interface Model extends TemplateModel {
        String getCategory();

        void setCategory(String category);

        String getDemo();

        void setDemo(String demo);
    }

    @Id("demo-sources-area")
    private DemoPlusSourcesArea demoPlusSourcesArea;

    public DemoPlusSourcesArea getDemoPlusSourcesArea() {
        return demoPlusSourcesArea;
    }

    public void setCategory(String category) {
        getModel().setCategory(category);
    }

    public void setDemo(String demo) {
        getModel().setDemo(demo);
    }
}
