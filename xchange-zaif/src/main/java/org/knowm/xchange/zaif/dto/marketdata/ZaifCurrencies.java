package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ZaifCurrencies implements Serializable {

    private final static long serialVersionUID = 1L;

    private long id;
    @JsonProperty("is_token")
    private boolean isToken;
    private String name;

    /**
     * No args constructor for use in serialization
     */
    public ZaifCurrencies() {
    }

    /**
     * @param id
     * @param name
     * @param isToken
     */
    public ZaifCurrencies(int id, boolean isToken, String name) {
        super();
        this.id = id;
        this.isToken = isToken;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public boolean isToken() {
        return isToken;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ZaifCurrencies{" +
                "id=" + id +
                ", isToken=" + isToken +
                ", name='" + name + '\'' +
                '}';
    }
}