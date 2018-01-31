package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ZaifLastPriceTest {

    /**
     * Json
     *
     * {
     * "last_price":1191560.0
     * }
     *
     * @throws IOException
     */
    @Test
    public void testUnmarshal() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = ZaifLastPriceTest.class.getResourceAsStream("/example/marketdata/last_price.json");

        ObjectMapper mapper = new ObjectMapper();
        ZaifLastPrice obj = mapper.readValue(is, ZaifLastPrice.class);

        // Verify that the example data was unmarshalled correctly
        assertThat(obj.getLastPrice()).isEqualTo(new BigDecimal("1191560.0"));
    }
}