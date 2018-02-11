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
public final class ZaifTicker implements Serializable {

    private final static long serialVersionUID = 1L;

    private BigDecimal last;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal vwap;
    private BigDecimal volume;
    private BigDecimal bid;
    private BigDecimal ask;
}
