package com.vaadin.addon.charts;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.Id;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

@Tag("demo-plus-sources-area")
@HtmlImport("frontend://src/common/demo-plus-sources-area.html")
public class DemoPlusSourcesArea extends PolymerTemplate<DemoPlusSourcesArea.Model> {

    public interface Model extends TemplateModel {
        String getHeader();

        void setHeader(String header);

        String getJavaSource();

        void setJavaSource(String javaSource);
    }

    @Id("example")
    private DemoArea demoArea;

    public void setHeader(String header) {
        getModel().setHeader(header);
    }

    public void setContent(Component content) {
        demoArea.getElement().appendChild(content.getElement());
    }

    public void setMarkdown(String markdown) {
        getModel().setJavaSource(markdown);
    }
}
