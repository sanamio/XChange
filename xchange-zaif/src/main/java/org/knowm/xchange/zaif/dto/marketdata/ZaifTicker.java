package org.knowm.xchange.zaif.dto.marketdata;

import java.io.Serializable;
import java.math.BigDecimal;

public final class ZaifTicker implements Serializable {

    private final static long serialVersionUID = 1L;

    private BigDecimal last;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal vwap;
    private BigDecimal volume;
    private BigDecimal bid;
    private BigDecimal ask;

    /**
     * No args constructor for use in serialization
     */
    public ZaifTicker() {
        //
    }

    /**
     * @param vwap
     * @param last
     * @param volume
     * @param high
     * @param ask
     * @param low
     * @param bid
     */
    public ZaifTicker(BigDecimal last, BigDecimal high, BigDecimal low, BigDecimal vwap, BigDecimal volume, BigDecimal bid, BigDecimal ask) {
        super();
        this.last = last;
        this.high = high;
        this.low = low;
        this.vwap = vwap;
        this.volume = volume;
        this.bid = bid;
        this.ask = ask;
    }

    public BigDecimal getLast() {
        return last;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public BigDecimal getVwap() {
        return vwap;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    @Override
    public String toString() {
        return "ZaifTicker{" +
                "last=" + last +
                ", high=" + high +
                ", low=" + low +
                ", vwap=" + vwap +
                ", volume=" + volume +
                ", bid=" + bid +
                ", ask=" + ask +
                '}';
    }
}
