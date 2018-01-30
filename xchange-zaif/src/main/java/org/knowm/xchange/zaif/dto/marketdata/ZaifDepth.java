package org.knowm.xchange.zaif.dto.marketdata;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZaifDepth implements Serializable {

    private final static long serialVersionUID = 1L;

    private List<Order> asks;
    private List<Order> bids;

    public ZaifDepth() {
        //
    }

    public ZaifDepth(List<Order> asks, List<Order> bids) {
        this.asks = asks;
        this.bids = bids;
    }

    public List<Order> getAsks() {
        return asks;
    }

    public List<Order> getBids() {
        return bids;
    }

    @Override
    public String toString() {
        return "ZaifDepth{" +
                "asks=" + asks +
                ", bids=" + bids +
                '}';
    }

    public static class Order extends ArrayList<BigDecimal> implements Serializable {
        private final static long serialVersionUID = 1L;

        public BigDecimal getPrice() {
            return this.get(0);
        }

        public BigDecimal getSize() {
            return this.get(1);
        }
    }
}
