package com.vaadin.flow.component.charts;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("demo-snippet")
@HtmlImport("frontend://src/demo-snippet.html")
public class DemoSnippet extends Component {

    public static final String MARKDOWN_PROPERTY_NAME = "_markdown";

    public void setSource(String source) {
        getElement().setProperty(MARKDOWN_PROPERTY_NAME, source == null ? "No source" : source);
    }
}
