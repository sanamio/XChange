package org.knowm.xchange.zaif.dto.marketdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ZaifDepth implements Serializable {

    private final static long serialVersionUID = 1L;

    private List<Order> asks;
    private List<Order> bids;

    @ToString
    public static class Order extends ArrayList<BigDecimal> implements Serializable {
        private final static long serialVersionUID = 1L;

        public BigDecimal getPrice() {
            return this.get(0);
        }

        public BigDecimal getAmount() {
            return this.get(1);
        }
    }
}
