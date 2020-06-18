package com.vaadin.flow.component.charts.model;

import com.vaadin.flow.component.charts.model.style.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlotOptionsOrganization extends AbstractPlotOptions {

    private List<Level> levels;
    private List<Node> nodes;
    private String[] keys = new String[] { "to", "from" };
    private Boolean colorByPoint;
    private Color color;
    private DataLabels dataLabels;
    private Color borderColor;
    private Number nodeWidth;

    private Accessibility accessibility;

    /*
     * <p>Enable or disable the initial animation when a series is displayed.
     The animation can also be set as a configuration object. Please
     note that this option only applies to the initial animation of the
     series itself. For other animations, see <a href="../highcharts/chart.animation">chart.animation</a> and the animation parameter under the API methods.
     The following properties are supported:</p>
     <ul>
     <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>
     </li>
     <li><p><code>easing</code>: Can be a string reference to an easing function set on
     the <code>Math</code> object or a function. See the <em>Custom easing function</em>
     demo below.</p>
     </li>
     </ul>
     <p>Due to poor performance, animation is disabled in old IE browsers
     for several chart types.</p>

     */
    //private Animation animation;

    private String boostBlending;

    private Number borderRadius;
    private Number borderWidth;
    private Boolean centerInCategory;
    private String className;
    private Boolean clip;
    private Number colorIndex;
    private List<Color> colors;
    private String cursor;
    /* <p>A reserved subspace to store options and values for customized
     functionality. Here you can add additional data for your own event
     callbacks and formatter callbacks.</p>
     */
    //private Highcharts.Dictionary.<*> custom;

    private DashStyle dashStyle;
    private String description;
    private Boolean enableMouseTracking;
    /*
     * <p>General event handlers for the series items. These event hooks can
     also be attached to the series at run time using the
     <code>Highcharts.addEvent</code> function.</p>

     */
    // private None events;
    private Boolean getExtremesFromAll;
    private Number hangingIndent;
    private Boolean includeInDataExport;

    private Label label;

    private Color linkColor;
    private String linkedTo;
    private Number linkLineWidth;
    private Number linkOpacity;
    private Number linkRadius;
    private Number minLinkWidth;
    private Number nodePadding;
    private Number opacity;
    /* <p>Properties for each single point.</p>
   //private  point;
   /*
    * <p>Same as
    <a href="../highcharts/accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>,
    but for an individual series. Overrides the chart wide configuration.</p>
    */
    //private Function pointDescriptionFormatter;
    private Boolean selected;
    private Boolean showCheckbox;
    private Boolean showInLegend;
    private Boolean skipKeyboardNavigation;
    private States states;
    private Boolean stickyTracking;
    private Tooltip tooltip;
    private Number turboThreshold;
    private Boolean visible;

    /**
     * @see #setAccessibility(Accessibility)
     */
    public Accessibility getAccessibility() {
        return accessibility;
    }

    /**
     * <p>Accessibility options for a series.</p>
     */
    public void setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
    }

    /**
     * @see #setBoostBlending(String)
     */
    public String getBoostBlending() {
        return boostBlending;
    }

    /**
     * <p>Sets the color blending in the boost module.</p>
     */
    public void setBoostBlending(String boostBlending) {
        this.boostBlending = boostBlending;
    }

    /**
     * @see #setBorderRadius(Number)
     */
    public Number getBorderRadius() {
        return borderRadius;
    }

    /**
     * <p>The border radius of the node cards.</p>
     */
    public void setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
    }

    /**
     * @see #setBorderWidth(Number)
     */
    public Number getBorderWidth() {
        return borderWidth;
    }

    /**
     * <p>The width of the border surrounding each column or bar. Defaults to
     * <code>1</code> when there is room for a border, but to <code>0</code> when the columns are
     * so dense that a border would cover the next column.</p>
     * <p>In <a href="https://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width can be set with the
     * <code>.highcharts-point</code> rule.</p>
     */
    public void setBorderWidth(Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * @see #setCenterInCategory(Boolean)
     */
    public Boolean getCenterInCategory() {
        return centerInCategory;
    }

    /**
     * <p>When <code>true</code>, the columns will center in the category, ignoring null
     * or missing points. When <code>false</code>, space will be reserved for null or
     * missing points.</p>
     */
    public void setCenterInCategory(Boolean centerInCategory) {
        this.centerInCategory = centerInCategory;
    }

    /**
     * @see #setClassName(String)
     */
    public String getClassName() {
        return className;
    }

    /**
     * <p>An additional class name to apply to the series' graphical elements.
     * This option does not replace default class names of the graphical
     * element.</p>
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @see #setClip(Boolean)
     */
    public Boolean getClip() {
        return clip;
    }

    /**
     * <p>Disable this option to allow series rendering in the whole plotting
     * area.</p>
     * <p><strong>Note:</strong> Clipping should be always enabled when
     * <a href="../highcharts/chart.zoomType">chart.zoomType</a> is set</p>
     */
    public void setClip(Boolean clip) {
        this.clip = clip;
    }

    /**
     * @see #setColorIndex(Number)
     */
    public Number getColorIndex() {
        return colorIndex;
    }

    /**
     * <p><a href="https://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the series, so
     * its graphic representations are given the class name
     * <code>highcharts-color-{n}</code>.</p>
     */
    public void setColorIndex(Number colorIndex) {
        this.colorIndex = colorIndex;
    }

    /**
     * @see #setColors(List<Color>)
     */
    public List<Color> getColors() {
        return colors;
    }

    /**
     * <p>A series specific or series type specific color set to apply instead
     * of the global <a href="../highcharts/colors">colors</a> when <a href="../highcharts/plotOptions.column.colorByPoint">colorByPoint</a> is true.</p>
     */
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    /**
     * @see #setCursor(String)
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * <p>You can set the cursor to "pointer" if you have click events attached
     * to the series, to signal to the user that the points and lines can
     * be clicked.</p>
     * <p>In <a href="https://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the series cursor can be set with the same classes
     * as listed under <a href="../highcharts/plotOptions.series.color">series.color</a>.</p>
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    /**
     * @see #setDashStyle(DashStyle)
     */
    public DashStyle getDashStyle() {
        return dashStyle;
    }

    /**
     * <p>Name of the dash style to use for the graph, or for some series types
     * the outline of each shape.</p>
     * <p>In <a href="https://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the
     * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-dashstyle/">stroke dash-array</a>
     * can be set with the same classes as listed under
     * <a href="../highcharts/plotOptions.series.color">series.color</a>.</p>
     */
    public void setDashStyle(DashStyle dashStyle) {
        this.dashStyle = dashStyle;
    }

    /**
     * @see #setDescription(String)
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>A description of the series to add to the screen reader information
     * about the series.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @see #setEnableMouseTracking(Boolean)
     */
    public Boolean getEnableMouseTracking() {
        return enableMouseTracking;
    }

    /**
     * <p>Enable or disable the mouse tracking for a specific series. This
     * includes point tooltips and click events on graphs and points. For
     * large datasets it improves performance.</p>
     */
    public void setEnableMouseTracking(Boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
    }

    /**
     * @see #setGetExtremesFromAll(Boolean)
     */
    public Boolean getGetExtremesFromAll() {
        return getExtremesFromAll;
    }

    /**
     * <p>Whether to use the Y extremes of the total chart width or only the
     * zoomed area when zooming in on parts of the X axis. By default, the
     * Y axis adjusts to the min and max of the visible data. Cartesian
     * series only.</p>
     */
    public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
        this.getExtremesFromAll = getExtremesFromAll;
    }

    /**
     * @see #setHangingIndent(Number)
     */
    public Number getHangingIndent() {
        return hangingIndent;
    }

    /**
     * <p>The indentation in pixels of hanging nodes, nodes which parent has
     * <a href="../highcharts/series.organization.nodes.layout">layout</a> set to <code>hanging</code>.</p>
     */
    public void setHangingIndent(Number hangingIndent) {
        this.hangingIndent = hangingIndent;
    }

    /**
     * @see #setIncludeInDataExport(Boolean)
     */
    public Boolean getIncludeInDataExport() {
        return includeInDataExport;
    }

    /**
     * <p>When set to <code>false</code> will prevent the series data from being included in
     * any form of data export.</p>
     * <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented
     * as <code>includeInCSVExport</code>.</p>
     */
    public void setIncludeInDataExport(Boolean includeInDataExport) {
        this.includeInDataExport = includeInDataExport;
    }

    /**
     * @see #setKeys(String[])
     */
    public String[] getKeys() {
        return keys;
    }

    /**
     * <p>An array specifying which option maps to which key in the data point
     * array. This makes it convenient to work with unstructured data arrays
     * from different sources.</p>
     */
    public void setKeys(String... keys) {
        this.keys = keys;
    }

    /**
     * @see #setLabel(Label)
     */
    public Label getLabel() {
        return label;
    }

    /**
     * <p>Series labels are placed as close to the series as possible in a
     * natural way, seeking to avoid other series. The goal of this
     * feature is to make the chart more easily readable, like if a
     * human designer placed the labels in the optimal position.</p>
     * <p>The series labels currently work with series types having a
     * <code>graph</code> or an <code>area</code>.</p>
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * @see #setLevels(List<Level>)
     */
    public List<Level> getLevels() {
        return levels;
    }

    /**
     * <p>Set options on specific levels. Takes precedence over series options,
     * but not node and link options.</p>
     */
    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    /**
     * Set options on specific levels. Takes precedence over series options, but
     * not point options.
     */
    public void setLevels(Level... levels) {
        this.levels = Arrays.stream(levels)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * @see #setLinkColor(Color)
     */
    public Color getLinkColor() {
        return linkColor;
    }

    /**
     * <p>The color of the links between nodes.</p>
     */
    public void setLinkColor(Color linkColor) {
        this.linkColor = linkColor;
    }

    /**
     * @see #setLinkedTo(String)
     */
    public String getLinkedTo() {
        return linkedTo;
    }

    /**
     * <p>The <a href="../highcharts/series.id">id</a> of another series to link to. Additionally,
     * the value can be ":previous" to link to the previous series. When
     * two series are linked, only the first one appears in the legend.
     * Toggling the visibility of this also toggles the linked series.</p>
     * <p>If master series uses data sorting and linked series does not have
     * its own sorting definition, the linked series will be sorted in the
     * same order as the master one.</p>
     */
    public void setLinkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
    }

    /**
     * @see #setLinkLineWidth(Number)
     */
    public Number getLinkLineWidth() {
        return linkLineWidth;
    }

    /**
     * <p>The line width of the links connecting nodes, in pixels.</p>
     */
    public void setLinkLineWidth(Number linkLineWidth) {
        this.linkLineWidth = linkLineWidth;
    }

    /**
     * @see #setLinkOpacity(Number)
     */
    public Number getLinkOpacity() {
        return linkOpacity;
    }

    /**
     * <p>Opacity for the links between nodes in the sankey diagram.</p>
     */
    public void setLinkOpacity(Number linkOpacity) {
        this.linkOpacity = linkOpacity;
    }

    /**
     * @see #setLinkRadius(Number)
     */
    public Number getLinkRadius() {
        return linkRadius;
    }

    /**
     * <p>Radius for the rounded corners of the links between nodes.</p>
     */
    public void setLinkRadius(Number linkRadius) {
        this.linkRadius = linkRadius;
    }

    /**
     * @see #setMinLinkWidth(Number)
     */
    public Number getMinLinkWidth() {
        return minLinkWidth;
    }

    /**
     * <p>The minimal width for a line of a sankey. By default,
     * 0 values are not shown.</p>
     */
    public void setMinLinkWidth(Number minLinkWidth) {
        this.minLinkWidth = minLinkWidth;
    }

    /**
     * @see #setNodePadding(Number)
     */
    public Number getNodePadding() {
        return nodePadding;
    }

    /**
     * <p>The padding between nodes in a sankey diagram or dependency wheel, in
     * pixels.</p>
     * <p>If the number of nodes is so great that it is possible to lay them
     * out within the plot area with the given <code>nodePadding</code>, they will be
     * rendered with a smaller padding as a strategy to avoid overflow.</p>
     */
    public void setNodePadding(Number nodePadding) {
        this.nodePadding = nodePadding;
    }

    /**
     * @see #setOpacity(Number)
     */
    public Number getOpacity() {
        return opacity;
    }

    /**
     * <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
     */
    public void setOpacity(Number opacity) {
        this.opacity = opacity;
    }

    /**
     * @see #setSelected(Boolean)
     */
    public Boolean getSelected() {
        return selected;
    }

    /**
     * <p>Whether to select the series initially. If <code>showCheckbox</code> is true,
     * the checkbox next to the series name in the legend will be checked
     * for a selected series.</p>
     */
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    /**
     * @see #setShowCheckbox(Boolean)
     */
    public Boolean getShowCheckbox() {
        return showCheckbox;
    }

    /**
     * <p>If true, a checkbox is displayed next to the legend item to allow
     * selecting the series. The state of the checkbox is determined by
     * the <code>selected</code> option.</p>
     */
    public void setShowCheckbox(Boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
    }

    /**
     * @see #setShowInLegend(Boolean)
     */
    public Boolean getShowInLegend() {
        return showInLegend;
    }

    /**
     * <p>Whether to display this particular series or series type in the
     * legend. Standalone series are shown in legend by default, and linked
     * series are not. Since v7.2.0 it is possible to show series that use
     * colorAxis by setting this option to <code>true</code>.</p>
     */
    public void setShowInLegend(Boolean showInLegend) {
        this.showInLegend = showInLegend;
    }

    /**
     * @see #setSkipKeyboardNavigation(Boolean)
     */
    public Boolean getSkipKeyboardNavigation() {
        return skipKeyboardNavigation;
    }

    /**
     * <p>If set to <code>true</code>, the accessibility module will skip past the points
     * in this series for keyboard navigation.</p>
     */
    public void setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
        this.skipKeyboardNavigation = skipKeyboardNavigation;
    }

    /**
     * @see #setStates(States)
     */
    public States getStates() {
        return states;
    }

    /**
     * @see States
     */
    public void setStates(States states) {
        this.states = states;
    }

    /**
     * @see #setStickyTracking(Boolean)
     */
    public Boolean getStickyTracking() {
        return stickyTracking;
    }

    /**
     * <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a
     * series isn't triggered until the mouse moves over another series, or
     * out of the plot area. When false, the <code>mouseOut</code> event on a series is
     * triggered when the mouse leaves the area around the series' graph or
     * markers. This also implies the tooltip when not shared. When
     * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
     * will be hidden when moving the mouse between series. Defaults to true
     * for line and area type series, but to false for columns, pies etc.</p>
     * <p><strong>Note:</strong> The boost module will force this option because of
     * technical limitations.</p>
     */
    public void setStickyTracking(Boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
    }

    /**
     * @see #setTooltip(Tooltip)
     */
    public Tooltip getTooltip() {
        return tooltip;
    }

    /**
     * <p>A configuration object for the tooltip rendering of each single
     * series. Properties are inherited from <a href="../highcharts/tooltip">tooltip</a>, but only
     * the following properties can be defined on a series level.</p>
     */
    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * @see #setTurboThreshold(Number)
     */
    public Number getTurboThreshold() {
        return turboThreshold;
    }

    /**
     * <p>When a series contains a data array that is longer than this, only
     * one dimensional arrays of numbers, or two dimensional arrays with
     * x and y values are allowed. Also, only the first point is tested,
     * and the rest are assumed to be the same format. This saves expensive
     * data checking and indexing in long series. Set it to <code>0</code> disable.</p>
     * <p>Note:
     * In boost mode turbo threshold is forced. Only array of numbers or
     * two dimensional arrays are allowed.</p>
     */
    public void setTurboThreshold(Number turboThreshold) {
        this.turboThreshold = turboThreshold;
    }

    /**
     * @see #setVisible(Boolean)
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * <p>Set the initial visibility of the series.</p>
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * Adds level to the levels array
     *
     * @param level to add
     * @see #setLevels(Level...)
     */
    public void addLevel(Level level) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        this.levels.add(level);
    }

    /**
     * Removes first occurrence of level in levels array
     *
     * @param level to remove
     * @see #setLevels(Level...)
     */
    public void removeLevel(Level level) {
        if (this.levels != null) {
            this.levels.remove(level);
        }
    }

    /**
     * @see #setNodes(Node...)
     */
    public Node[] getNodes() {
        if (nodes == null) {
            return new Node[] {};
        }
        return nodes.toArray(new Node[nodes.size()]);
    }

    /**
     * A collection of options for the individual nodes.
     * The nodes in an org chart are auto-generated instances of
     * Highcharts.Point, but options can be applied here and linked by the id.
     */
    public void setNodes(Node... nodes) {
        this.nodes = Arrays.stream(nodes)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Adds node to the nodes array
     *
     * @param node to add
     * @see #setNodes(Node...)
     */
    public void addNode(Node node) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(node);
    }

    /**
     * Removes first occurrence of node in nodes array
     *
     * @param node to remove
     * @see #setNodes(Node...)
     */
    public void removeNode(Node node) {
        if (this.nodes != null) {
            this.nodes.remove(node);
        }
    }

    /**
     * @see #setColorByPoint(Boolean)
     */
    public Boolean getColorByPoint() {
        return colorByPoint;
    }

    /**
     *
     */
    public void setColorByPoint(Boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
    }

    /**
     * @see #setColor(Color)
     */
    public Color getColor() {
        return color;
    }

    /**
     * <p>The main color of the series. In line type series it applies to the
     * line and the point markers unless otherwise specified. In bar type
     * series it applies to the bars unless a color is specified per point.
     * The default value is pulled from the options.colors array.</p>
     *
     * <p>In styled mode, the color can be defined by the colorIndex option.
     * Also, the series color can be set with the .highcharts-series,
     * .highcharts-color-{n}, .highcharts-{type}-series or
     * .highcharts-series-{n} class, or individual classes given by the
     * className option.</p>
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @see #setDataLabels(DataLabels)
     */
    public DataLabels getDataLabels() {
        return dataLabels;
    }

    /**
     * Options for the data labels appearing on top of the nodes and links.
     * For sankey charts, data labels are visible for the nodes by default,
     * but hidden for links. This is controlled by modifying the nodeFormat,
     * and the format that applies to links and is an empty string by default.
     */
    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * @see #setBorderColor(Color)
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * The border color of the node cards. Defaults to #666666.
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * @see #setNodeWidth(Number)
     */
    public Number getNodeWidth() {
        return nodeWidth;
    }

    /**
     * In a horizontal chart, the width of the nodes in pixels. Node that most organization charts are vertical, so the name of this option is counterintuitive.
     * Defaults to 50.
     */
    public void setNodeWidth(Number nodeWidth) {
        this.nodeWidth = nodeWidth;
    }

    @Override
    public ChartType getChartType() {
        return ChartType.ORGANIZATION;
    }
}