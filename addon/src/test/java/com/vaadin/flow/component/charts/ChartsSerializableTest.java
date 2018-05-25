package com.vaadin.flow.component.charts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.stream.Stream;

import com.vaadin.flow.testutil.ClassesSerializableTest;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void verifyJsonFactoryDeserialization() {
        final Chart chart = new Chart();
        final ByteArrayOutputStream objectOutStore = new ByteArrayOutputStream();
        try (ObjectOutputStream serializer = new ObjectOutputStream(objectOutStore)) {
            serializer.writeObject(chart);
            serializer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
            Assert.fail("Unable to serialize Chart");
        }

        try(ByteArrayInputStream objectInStore = new ByteArrayInputStream(objectOutStore.toByteArray());
                ObjectInputStream deserializer = new ObjectInputStream(objectInStore)) {
            final Chart deserializedChart = (Chart) deserializer.readObject();
            Assert.assertNotNull(deserializedChart);
            Assert.assertNotNull(deserializedChart.jsonFactory);
            Assert.assertNotEquals(chart, deserializedChart);
            Assert.assertNotEquals(chart.jsonFactory, deserializedChart.jsonFactory);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            Assert.fail("Unable to deserialize Chart");
        }
    }
}
