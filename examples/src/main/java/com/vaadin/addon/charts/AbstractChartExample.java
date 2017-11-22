package com.vaadin.addon.charts;

import com.vaadin.server.Command;
import com.vaadin.ui.Component;
import com.vaadin.ui.html.Div;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Abstract class for all chart examples.
 */
public abstract class AbstractChartExample extends Div {
    public AbstractChartExample() {
        initDemo();
    }

    public abstract void initDemo();

    /**
     * Runs given task repeatedly until the reference component is attached
     *
     * @param component
     * @param task
     * @param interval
     * @param initialPause
     *            a timeout after tas is started
     */
    public static void runWhileAttached(Component component, Command task,
            final int interval, final int initialPause) {
        component.addAttachListener(event -> {
            ScheduledExecutorService executor = Executors
                    .newScheduledThreadPool(1);

            component.getUI().ifPresent(ui -> ui.setPollInterval(interval));

            final ScheduledFuture<?> scheduledFuture = executor
                    .scheduleAtFixedRate(() -> {
                        component.getUI().ifPresent(ui -> ui.access(task));
                    }, initialPause, interval, TimeUnit.MILLISECONDS);

            component.addDetachListener(detach -> {
                scheduledFuture.cancel(true);
                detach.getUI().setPollInterval(-1);
            });
        });
    }
}
