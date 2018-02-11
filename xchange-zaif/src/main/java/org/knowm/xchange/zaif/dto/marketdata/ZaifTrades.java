package org.knowm.xchange.zaif.dto.marketdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public final class ZaifTrades implements Serializable {

    private final static long serialVersionUID = 1L;

    private long date;
    private BigDecimal price;
    private BigDecimal amount;
    private long tid;
    private String currencyPair;
    private String tradeType;
}
