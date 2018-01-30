package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public final class ZaifTrades implements Serializable {

    private final static long serialVersionUID = 1L;

    private long date;
    private BigDecimal price;
    private BigDecimal amount;
    private long tid;
    @JsonProperty("currency_pair")
    private String currencyPair;
    @JsonProperty("trade_type")
    private String tradeType;

    /**
     * No args constructor for use in serialization
     */
    public ZaifTrades() {
        //
    }

    public ZaifTrades(long date, BigDecimal price, BigDecimal amount, long tid, String currencyPair, String tradeType) {
        this.date = date;
        this.price = price;
        this.amount = amount;
        this.tid = tid;
        this.currencyPair = currencyPair;
        this.tradeType = tradeType;
    }

    public long getDate() {
        return date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public long getTid() {
        return tid;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public String getTradeType() {
        return tradeType;
    }

    @Override
    public String toString() {
        return "ZaifTrades{" +
                "date=" + date +
                ", price=" + price +
                ", amount=" + amount +
                ", tid=" + tid +
                ", currencyPair='" + currencyPair + '\'' +
                ", tradeType='" + tradeType + '\'' +
                '}';
    }
}
