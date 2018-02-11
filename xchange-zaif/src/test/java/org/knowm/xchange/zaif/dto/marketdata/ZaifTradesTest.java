package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.knowm.xchange.zaif.ZaifJacksonObjectMapperFactory;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ZaifTradesTest {

    /**
     * Json
     *
     * {
     * "date":1517289403,
     * "price":1191880.0,
     * "amount":0.0802,
     * "tid":97592926,
     * "currency_pair":"btc_jpy",
     * "trade_type":"bid"
     * }
     * @throws IOException
     */
    @Test
    public void testUnmarshal() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = ZaifTradesTest.class.getResourceAsStream("/example/marketdata/trades.json");

        ObjectMapper mapper = new ZaifJacksonObjectMapperFactory().createObjectMapper();
        List<ZaifTrades> obj = mapper.readValue(is, new TypeReference<List<ZaifTrades>>() {});

        // Verify that the example data was unmarshalled correctly
        assertThat(obj.size()).isEqualTo(4);
        assertThat(obj.get(0).getDate()).isEqualTo(1517289403L);
        assertThat(obj.get(0).getPrice()).isEqualTo(new BigDecimal("1191880.0"));
        assertThat(obj.get(0).getAmount()).isEqualTo(new BigDecimal("0.0802"));
        assertThat(obj.get(0).getTid()).isEqualTo(97592926L);
        assertThat(obj.get(0).getCurrencyPair()).isEqualTo("btc_jpy");
        assertThat(obj.get(0).getTradeType()).isEqualTo("bid");
    }
}