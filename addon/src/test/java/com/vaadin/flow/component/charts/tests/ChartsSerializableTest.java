package com.vaadin.flow.component.charts.tests;

import java.util.stream.Stream;

import com.vaadin.flow.testutil.ClassesSerializableTest;

public class ChartsSerializableTest extends ClassesSerializableTest {
    @Override
    protected Stream<String> getExcludedPatterns() {
        return Stream.concat(
                super.getExcludedPatterns(),
                Stream.of(
                        "^((?!\\.charts\\.).)*$" /*TODO: Remove when Flow Beta13 is released*/,
                        ".*\\Serializer(Modifier)?$",
                        "com\\.vaadin\\.flow\\.component\\.charts\\.model\\.serializers\\.BeanSerializationDelegate"
                ));
    }
}
