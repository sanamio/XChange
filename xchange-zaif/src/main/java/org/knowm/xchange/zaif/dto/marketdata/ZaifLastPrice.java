package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public final class ZaifLastPrice implements Serializable {

    private final static long serialVersionUID = 1L;

    @JsonProperty("last_price")
    private BigDecimal lastPrice;

    /**
     * No args constructor for use in serialization
     */
    public ZaifLastPrice() {
        //
    }

    public ZaifLastPrice(BigDecimal date) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    @Override
    public String toString() {
        return "ZaifLastPrice{" +
                "lastPrice=" + lastPrice +
                '}';
    }
}
