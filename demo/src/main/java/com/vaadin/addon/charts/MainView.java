package com.vaadin.addon.charts;

import com.vaadin.flow.model.TemplateModel;
import com.vaadin.router.HasUrlParameter;
import com.vaadin.router.Route;
import com.vaadin.router.WildcardParameter;
import com.vaadin.router.event.BeforeNavigationEvent;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.polymertemplate.Id;
import com.vaadin.ui.polymertemplate.PolymerTemplate;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.reflections.Reflections;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

@Tag("charts-demo-app")
@Route("demo")
@HtmlImport("frontend://src/charts-demo-app.html")
public class MainView extends PolymerTemplate<MainView.Model> implements HasUrlParameter<String> {

    public interface Model extends TemplateModel {
        List<Category> getCategories();

        void setCategories(List<Category> categories);
    }

    private static final Map<String, List<Class<? extends AbstractVaadinChartExample>>> GROUPS;
    private static final Map<String, Class<? extends AbstractVaadinChartExample>> NAME_INDEXED_SUBTYPES;

    @Id("demo-snippet")
    private DemoSnippet snippet;

    @Id("demo-sources-area")
    private DemoArea demoPlusSourcesArea;

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
                .collect(groupingBy(MainView::lastTokenInPackageName));
    }

    public MainView() {
        final List<Category> categories = GROUPS.entrySet().stream().map(group -> {
            Category category = new Category(group.getKey());
            category.setDemos(group.getValue().stream().map(e -> new Category.Demo(e.getSimpleName()))
                    .collect(toList()));
            return category;
        }).collect(toList());
        getModel().setCategories(categories);
    }

    @Override
    public void setParameter(BeforeNavigationEvent event, @WildcardParameter String parameter) {

        Pair<String, String> currentExample = getTargetExample(parameter);

        try {
            final Class<? extends AbstractVaadinChartExample> exampleClass
                    = NAME_INDEXED_SUBTYPES.get(currentExample.getValue());

            demoPlusSourcesArea.setContent(exampleClass.newInstance().getChart());
//            demoPlusSourcesArea.setHeader(currentExample.getValue());
            snippet.setSource(IOUtils.toString(getClass().getResourceAsStream(
                    "/examples/" + currentExample.getKey() + "/" + currentExample.getValue() + ".java")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Pair<String, String> getTargetExample(String route) {
        System.out.println(route);

        if (route == null || route.isEmpty()) {
            return new ImmutablePair<>("defaultchart", "EmptyChart");
        }

        final String[] tokens = route.split("/");
        final int count = tokens.length;

        if (count <= 1 || !NAME_INDEXED_SUBTYPES.containsKey(tokens[count - 1])) {
            return new ImmutablePair<>("defaultchart", "EmptyChart");
        }

        return new ImmutablePair<>(tokens[count - 2], tokens[count - 1]);
    }

    private static String lastTokenInPackageName(Class<? extends AbstractVaadinChartExample> clazz) {
        String name = clazz.getPackage().getName();
        return name.substring(name.lastIndexOf('.') + 1);
    }
}
