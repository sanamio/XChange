package org.knowm.xchange.zaif.dto.marketdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ZaifCurrencies implements Serializable {

    private final static long serialVersionUID = 1L;

    private long id;
    private boolean isToken;
    private String name;
}