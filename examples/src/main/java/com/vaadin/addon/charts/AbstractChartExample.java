package com.vaadin.addon.charts;

import com.vaadin.server.Command;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.html.Div;

import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static void runWhileAttached(final Component component,
            final Command task, final int interval, final int initialPause) {
        UI.getCurrent().setPollInterval(interval);

        final Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(initialPause);
                    while (component.getUI().isPresent()) {
                        Future<Void> future = component.getUI().get().access(task);
                        future.get();
                        Thread.sleep(interval);
                    }
                } catch (Exception e) {
                    Logger.getLogger(this.getClass().getName())
                            .log(Level.WARNING,
                                    "Unexpected exception while running scheduled update",
                                    e);
                }
                Logger.getLogger(this.getClass().getName()).log(Level.INFO,
                        "Thread stopped");
            }
        };
        thread.start();
    }
}
