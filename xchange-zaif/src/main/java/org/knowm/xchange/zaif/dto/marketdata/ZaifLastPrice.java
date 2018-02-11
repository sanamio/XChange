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
public final class ZaifLastPrice implements Serializable {

    private final static long serialVersionUID = 1L;

    private BigDecimal lastPrice;
}
