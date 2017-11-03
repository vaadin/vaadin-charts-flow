package com.vaadin.addon.charts;

import com.vaadin.router.Route;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.html.Div;
import com.vaadin.ui.html.H3;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.reflections.Reflections;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

@Route("")
public class ChartsDemoUI extends UI {

    private static final Properties prop = new Properties();

    static {
        try {
            prop.load(ChartsDemoUI.class.getResourceAsStream("config.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static final Map<String, List<Class<? extends AbstractVaadinChartExample>>> GROUPS;
    private static final Map<String, Class<? extends AbstractVaadinChartExample>> NAME_INDEXED_SUBTYPES;

    static {
        NAME_INDEXED_SUBTYPES = new Reflections("com.vaadin.addon.charts.examples")
                .getSubTypesOf(AbstractVaadinChartExample.class)
                .stream()
                .filter(e -> !e.isAnnotationPresent(SkipFromDemo.class))
                .collect(toMap(Class::getSimpleName, Function.identity()));

        GROUPS = NAME_INDEXED_SUBTYPES
                .values()
                .stream()
                .sorted(comparing(Class::getSimpleName))
                .collect(groupingBy(ChartsDemoUI::lastTokenInPackageName));
    }

    @Override
    protected void init(VaadinRequest request) {
        Div container = new Div();
        container.addClassName("vertical-section-container");
        container.addClassName("centered");

        String currentExample = getTargetExample(request.getPathInfo());

        H3 heading = new H3(currentExample);
        DemoSnippet snippet = new DemoSnippet();

        try {
            final Class<? extends AbstractVaadinChartExample> exampleClass
                    = NAME_INDEXED_SUBTYPES.get(currentExample);
            snippet.setContent(exampleClass.newInstance().getChart());

            snippet.setMarkdown("```java\n"
                    + IOUtils.toString(getClass().getResourceAsStream("/examples/" + currentExample + ".java"))
                    + "\n```");
        } catch (Exception e) {
            e.printStackTrace();
        }

        container.add(heading, snippet);
        setRouterLayoutContent(container);
    }

    private String getTargetExample(String pathInfo) {
        String example = pathInfo.substring(pathInfo.lastIndexOf("/") + 1);
        return example.isEmpty() || !NAME_INDEXED_SUBTYPES.containsKey(example) ? "EmptyChart" : example;
    }

    static String getVersion() {
        return prop.get("charts.version").toString();
    }

    static String splitCamelCase(String s) {
        String replaced = s.replaceAll(String.format("%s|%s|%s",
                "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
                "(?<=[A-Za-z])(?=[^A-Za-z])"), " ");

        replaced = replaced
                .replaceAll("And", "and")
                .replaceAll("With", "with")
                .replaceAll("To", "to")
                .replaceAll("Of", "of")
                .replaceAll("Api", "API")
                .replaceAll("3 D", "3D");

        return StringUtils.capitalize(replaced);
    }

    private static String lastTokenInPackageName(Class<? extends AbstractVaadinChartExample> clazz) {
        String name = clazz.getPackage().getName();
        return name.substring(name.lastIndexOf('.') + 1);
    }
}
