package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ZaifCurrencyPairTest {

    /**
     * Json
     *
     * [ {
     * "event_number":0,
     * "item_unit_min":1.0,
     * "description":"XEM\u30fb\u30d3\u30c3\u30c8\u30b3\u30a4\u30f3\u306e\u53d6\u5f15\u3092\u884c\u3046\u3053\u3068\u304c\u3067\u304d\u307e\u3059",
     * "currency_pair":"xem_btc",
     * "aux_unit_min":1e-08,
     * "item_unit_step":1.0,
     * "seq":2,
     * "aux_unit_step":1e-08,
     * "aux_japanese":"\u30d3\u30c3\u30c8\u30b3\u30a4\u30f3",
     * "is_token":false,
     * "title":"XEM/BTC",
     * "id":5,
     * "name":"XEM/BTC",
     * "item_japanese":"XEM",
     * "aux_unit_point":8
     * },
     * ...
     * ]
     * @throws IOException
     */
    @Test
    public void testUnmarshal() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = ZaifCurrencyPairTest.class.getResourceAsStream("/example/marketdata/currency_pair.json");

        ObjectMapper mapper = new ObjectMapper();
        List<ZaifCurrencies> obj = mapper.readValue(is, new TypeReference<List<ZaifCurrencies>>() {});

        // Verify that the example data was unmarshalled correctly
        assertThat(obj.size()).isEqualTo(3);
        assertThat(obj.get(0).getId()).isEqualTo(10L);
        assertThat(obj.get(0).isToken()).isEqualTo(true);
        assertThat(obj.get(0).getName()).isEqualTo("MAGATAMARD");
    }
}