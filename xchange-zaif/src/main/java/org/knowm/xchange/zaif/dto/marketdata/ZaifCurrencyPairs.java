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
public class ZaifCurrencyPairs implements Serializable {
    private final static long serialVersionUID = -1L;

    private long eventNumber;
    private BigDecimal itemUnitMin;
    private String description;
    private String currencyPair;
    private BigDecimal auxUnitMin;
    private BigDecimal itemUnitStep;
    private long seq;
    private BigDecimal auxUnitStep;
    private String auxJapanese;
    private boolean isToken;
    private String title;
    private long id;
    private String name;
    private String itemJapanese;
    private long auxUnitPolong;
}