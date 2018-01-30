package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class ZaifCurrencyPairs implements Serializable {
    private final static long serialVersionUID = -1L;

    @JsonProperty("event_number")
    private long eventNumber;
    @JsonProperty("item_unit_min")
    private BigDecimal itemUnitMin;
    private String description;
    @JsonProperty("currency_pair")
    private String currencyPair;
    @JsonProperty("aux_unit_min")
    private BigDecimal auxUnitMin;
    @JsonProperty("item_unit_step")
    private BigDecimal itemUnitStep;
    private long seq;
    @JsonProperty("aux_unit_step")
    private BigDecimal auxUnitStep;
    @JsonProperty("aux_japanese")
    private String auxJapanese;
    @JsonProperty("is_token")
    private boolean isToken;
    private String title;
    private long id;
    private String name;
    @JsonProperty("item_japanese")
    private String itemJapanese;
    @JsonProperty("aux_unit_polong")
    private long auxUnitPolong;

    /**
     * No args constructor for use in serialization
     */
    public ZaifCurrencyPairs() {
    }

    /**
     * @param auxUnitMin
     * @param auxJapanese
     * @param isToken
     * @param auxUnitStep
     * @param currencyPair
     * @param id
     * @param itemUnitStep
     * @param title
     * @param auxUnitPolong
     * @param itemJapanese
     * @param eventNumber
     * @param description
     * @param name
     * @param seq
     * @param itemUnitMin
     */
    public ZaifCurrencyPairs(long eventNumber, BigDecimal itemUnitMin, String description, String currencyPair, BigDecimal auxUnitMin, BigDecimal itemUnitStep, long seq, BigDecimal auxUnitStep, String auxJapanese, boolean isToken, String title, long id, String name, String itemJapanese, long auxUnitPolong) {
        super();
        this.eventNumber = eventNumber;
        this.itemUnitMin = itemUnitMin;
        this.description = description;
        this.currencyPair = currencyPair;
        this.auxUnitMin = auxUnitMin;
        this.itemUnitStep = itemUnitStep;
        this.seq = seq;
        this.auxUnitStep = auxUnitStep;
        this.auxJapanese = auxJapanese;
        this.isToken = isToken;
        this.title = title;
        this.id = id;
        this.name = name;
        this.itemJapanese = itemJapanese;
        this.auxUnitPolong = auxUnitPolong;
    }

    public long getEventNumber() {
        return eventNumber;
    }

    public BigDecimal getItemUnitMin() {
        return itemUnitMin;
    }

    public String getDescription() {
        return description;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public BigDecimal getAuxUnitMin() {
        return auxUnitMin;
    }

    public BigDecimal getItemUnitStep() {
        return itemUnitStep;
    }

    public long getSeq() {
        return seq;
    }

    public BigDecimal getAuxUnitStep() {
        return auxUnitStep;
    }

    public String getAuxJapanese() {
        return auxJapanese;
    }

    public boolean isToken() {
        return isToken;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getItemJapanese() {
        return itemJapanese;
    }

    public long getAuxUnitPolong() {
        return auxUnitPolong;
    }

    @Override
    public String toString() {
        return "ZaifCurrencyPairs{" +
                "eventNumber=" + eventNumber +
                ", itemUnitMin=" + itemUnitMin +
                ", description='" + description + '\'' +
                ", currencyPair='" + currencyPair + '\'' +
                ", auxUnitMin=" + auxUnitMin +
                ", itemUnitStep=" + itemUnitStep +
                ", seq=" + seq +
                ", auxUnitStep=" + auxUnitStep +
                ", auxJapanese='" + auxJapanese + '\'' +
                ", isToken=" + isToken +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", itemJapanese='" + itemJapanese + '\'' +
                ", auxUnitPolong=" + auxUnitPolong +
                '}';
    }
}