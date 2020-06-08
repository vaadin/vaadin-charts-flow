package com.vaadin.flow.component.charts;

import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.charts.model.AbstractConfigurationObject;
import com.vaadin.flow.component.charts.model.Lang;
import com.vaadin.flow.component.charts.util.ChartSerialization;

import elemental.json.JsonObject;
import elemental.json.impl.JreJsonFactory;

/**
 * The ChartOptions configures a page local global options like localized texts
 * for charts.
 */
public class ChartOptions extends AbstractConfigurationObject {

    private Lang lang;
    private transient JreJsonFactory jsonFactory;

    protected ChartOptions() {
    }

    JreJsonFactory getJsonFactory() {
        if (jsonFactory == null) {
            jsonFactory = new JreJsonFactory();
        }

        return jsonFactory;
    }

    private void updateOptions() {
        UI ui = UI.getCurrent();

        if (ui == null) {
            return;
        }

        JsonObject configurationNode = getJsonFactory()
                .parse(ChartSerialization.toJSON(this));
        ui.getElement().executeJs(
                "customElements.get('vaadin-chart').__callHighchartsFunction('setOptions',$0,$1)",
                true, configurationNode);
    }

    /**
     * Changes the language of all charts.
     *
     * @param lang
     */
    public void setLang(Lang lang) {
        this.lang = lang;
        updateOptions();
    }

    /**
     * Returns the {@link Lang} in use or {@code null} if no lang configuration
     * has been set.
     *
     * @return the {@link Lang} in use or {@code null}.
     */
    public Lang getLang() {
        return lang;
    }

    /**
     * Returns a ChartOptions extension for the given UI. If a ChartOptions
     * extension has not yet been added, a new one is created and added.
     *
     * @param ui
     *            the UI for which the ChartOptions should be returned
     * @return the ChartOptions instance connected to the given UI
     */
    public static ChartOptions get(UI ui) {
        ChartOptions optioner = ComponentUtil.getData(ui, ChartOptions.class);

        // Create new optioner if not found
        if (optioner == null) {
            optioner = new ChartOptions();
            ComponentUtil.setData(ui, ChartOptions.class, optioner);
        }

        return optioner;

    }

    /**
     * Returns a ChartOptions for the current UI. If a ChartOptions extension
     * has not yet been added, a new one is created and added.
     *
     * @return a ChartOptions instance connected to the currently active UI
     */
    public static ChartOptions get() {
        UI ui = UI.getCurrent();

        if (ui == null) {
            throw new IllegalStateException(
                    "This method must be used from UI thread");
        }
        return get(ui);
    }

}
