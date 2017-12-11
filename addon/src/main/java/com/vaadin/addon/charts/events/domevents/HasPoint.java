package com.vaadin.addon.charts.events.domevents;

public interface HasPoint extends HasItem {

    default int getPointIndex() {
        return getItemIndex();
    }
}
