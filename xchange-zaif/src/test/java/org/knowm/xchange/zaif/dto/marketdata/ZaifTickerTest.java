package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ZaifTickerTest {

    /**
     * Json
     * {
     *  "last":1191775.0,
     *  "high":1256340.0,
     *  "low":1177600.0,
     *  "vwap":1221612.2501,
     *  "volume":7404.6007,
     *  "bid":1191775.0,
     *  "ask":1191795.0
     * }
     * @throws IOException
     */
    @Test
    public void testUnmarshal() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = ZaifTickerTest.class.getResourceAsStream("/example/marketdata/ticker.json");

        ObjectMapper mapper = new ObjectMapper();
        ZaifTicker obj = mapper.readValue(is, ZaifTicker.class);

        // Verify that the example data was unmarshalled correctly
        assertThat(obj.getLast()).isEqualTo(new BigDecimal("1191775.0"));
        assertThat(obj.getHigh()).isEqualTo(new BigDecimal("1256340.0"));
        assertThat(obj.getLow()).isEqualTo(new BigDecimal("1177600.0"));
        assertThat(obj.getVwap()).isEqualTo(new BigDecimal("1221612.2501"));
        assertThat(obj.getVolume()).isEqualTo(new BigDecimal("7404.6007"));
        assertThat(obj.getBid()).isEqualTo(new BigDecimal("1191775.0"));
        assertThat(obj.getAsk()).isEqualTo(new BigDecimal("1191795.0"));
    }
}