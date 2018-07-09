package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Params extends AbstractConfigurationObject {

	private String algorithm;
	private Number bottomBand;
	private Number decimals;
	private Number deviation;
	private Number highIndex;
	private Number increment;
	private Number index;
	private Number initialAccelerationFactor;
	private Number longPeriod;
	private Number lowIndex;
	private Number maxAccelerationFactor;
	private Number period;
	private Number periodSenkouSpanB;
	private Number periodTenkan;
	private Number periods;
	private Number ranges;
	private Number shortPeriod;
	private Number signalPeriod;
	private Number standardDeviation;
	private Number topBand;
	private String volumeSeriesID;

	public Params() {
	}

	/**
	 * @see #setAlgorithm(String)
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * Algorithm used to calculate ressistance and support lines based on pivot
	 * points. Implemented algorithms: `'standard'`, `'fibonacci'` and
	 * `'camarilla'`
	 */
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * @see #setBottomBand(Number)
	 */
	public Number getBottomBand() {
		return bottomBand;
	}

	/**
	 * Percentage below the moving average that should be displayed. 0.1 means
	 * 90%. Relative to the calculated value.
	 */
	public void setBottomBand(Number bottomBand) {
		this.bottomBand = bottomBand;
	}

	/**
	 * @see #setDecimals(Number)
	 */
	public Number getDecimals() {
		return decimals;
	}

	/**
	 * Number of maximum decimals that are used in MFI calculations.
	 */
	public void setDecimals(Number decimals) {
		this.decimals = decimals;
	}

	/**
	 * @see #setDeviation(Number)
	 */
	public Number getDeviation() {
		return deviation;
	}

	/**
	 * The threshold for the value change. For example deviation=1 means the
	 * indicator will ignore all price movements less than 1%.
	 */
	public void setDeviation(Number deviation) {
		this.deviation = deviation;
	}

	/**
	 * @see #setHighIndex(Number)
	 */
	public Number getHighIndex() {
		return highIndex;
	}

	/**
	 * The point index which indicator calculations will base - high value. For
	 * example using OHLC data, index=1 means the indicator will be calculated
	 * using High values.
	 */
	public void setHighIndex(Number highIndex) {
		this.highIndex = highIndex;
	}

	/**
	 * @see #setIncrement(Number)
	 */
	public Number getIncrement() {
		return increment;
	}

	/**
	 * Acceleration factor increases by increment each time the extreme point
	 * makes a new high.
	 */
	public void setIncrement(Number increment) {
		this.increment = increment;
	}

	public Number getIndex() {
		return index;
	}

	public void setIndex(Number index) {
		this.index = index;
	}

	/**
	 * @see #setInitialAccelerationFactor(Number)
	 */
	public Number getInitialAccelerationFactor() {
		return initialAccelerationFactor;
	}

	/**
	 * The initial value for acceleration factor. Acceleration factor is
	 * starting with this value and increases by specified increment each time
	 * the extreme point makes a new high. AF can reach a maximum of
	 * maxAccelerationFactor, no matter how long the uptrend extends.
	 */
	public void setInitialAccelerationFactor(Number initialAccelerationFactor) {
		this.initialAccelerationFactor = initialAccelerationFactor;
	}

	/**
	 * @see #setLongPeriod(Number)
	 */
	public Number getLongPeriod() {
		return longPeriod;
	}

	/**
	 * The long period for indicator calculations.
	 */
	public void setLongPeriod(Number longPeriod) {
		this.longPeriod = longPeriod;
	}

	/**
	 * @see #setLowIndex(Number)
	 */
	public Number getLowIndex() {
		return lowIndex;
	}

	/**
	 * The point index which indicator calculations will base - low value. For
	 * example using OHLC data, index=2 means the indicator will be calculated
	 * using Low values.
	 */
	public void setLowIndex(Number lowIndex) {
		this.lowIndex = lowIndex;
	}

	/**
	 * @see #setMaxAccelerationFactor(Number)
	 */
	public Number getMaxAccelerationFactor() {
		return maxAccelerationFactor;
	}

	/**
	 * The Maximum value for acceleration factor. AF can reach a maximum of
	 * maxAccelerationFactor, no matter how long the uptrend extends.
	 */
	public void setMaxAccelerationFactor(Number maxAccelerationFactor) {
		this.maxAccelerationFactor = maxAccelerationFactor;
	}

	public Number getPeriod() {
		return period;
	}

	public void setPeriod(Number period) {
		this.period = period;
	}

	/**
	 * @see #setPeriodSenkouSpanB(Number)
	 */
	public Number getPeriodSenkouSpanB() {
		return periodSenkouSpanB;
	}

	/**
	 * The base period for Senkou Span B calculations
	 */
	public void setPeriodSenkouSpanB(Number periodSenkouSpanB) {
		this.periodSenkouSpanB = periodSenkouSpanB;
	}

	/**
	 * @see #setPeriodTenkan(Number)
	 */
	public Number getPeriodTenkan() {
		return periodTenkan;
	}

	/**
	 * The base period for Tenkan calculations.
	 */
	public void setPeriodTenkan(Number periodTenkan) {
		this.periodTenkan = periodTenkan;
	}

	/**
	 * @see #setPeriods(Number)
	 */
	public Number getPeriods() {
		return periods;
	}

	/**
	 * Periods for Stochastic oscillator: [%K, %D].
	 */
	public void setPeriods(Number periods) {
		this.periods = periods;
	}

	/**
	 * @see #setRanges(Number)
	 */
	public Number getRanges() {
		return ranges;
	}

	/**
	 * The number of price zones.
	 */
	public void setRanges(Number ranges) {
		this.ranges = ranges;
	}

	/**
	 * @see #setShortPeriod(Number)
	 */
	public Number getShortPeriod() {
		return shortPeriod;
	}

	/**
	 * The short period for indicator calculations.
	 */
	public void setShortPeriod(Number shortPeriod) {
		this.shortPeriod = shortPeriod;
	}

	/**
	 * @see #setSignalPeriod(Number)
	 */
	public Number getSignalPeriod() {
		return signalPeriod;
	}

	/**
	 * The base period for signal calculations.
	 */
	public void setSignalPeriod(Number signalPeriod) {
		this.signalPeriod = signalPeriod;
	}

	/**
	 * @see #setStandardDeviation(Number)
	 */
	public Number getStandardDeviation() {
		return standardDeviation;
	}

	/**
	 * Standard deviation for top and bottom bands.
	 */
	public void setStandardDeviation(Number standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	/**
	 * @see #setTopBand(Number)
	 */
	public Number getTopBand() {
		return topBand;
	}

	/**
	 * Percentage above the moving average that should be displayed. 0.1 means
	 * 110%. Relative to the calculated value.
	 */
	public void setTopBand(Number topBand) {
		this.topBand = topBand;
	}

	/**
	 * @see #setVolumeSeriesID(String)
	 */
	public String getVolumeSeriesID() {
		return volumeSeriesID;
	}

	/**
	 * The id of volume series which is mandatory. For example using OHLC data,
	 * volumeSeriesID='volume' means the indicator will be calculated using OHLC
	 * and volume values.
	 */
	public void setVolumeSeriesID(String volumeSeriesID) {
		this.volumeSeriesID = volumeSeriesID;
	}
}
