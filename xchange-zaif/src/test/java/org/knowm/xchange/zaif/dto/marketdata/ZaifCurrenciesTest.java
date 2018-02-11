package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.knowm.xchange.zaif.ZaifJacksonObjectMapperFactory;
import si.mazi.rescu.serialization.jackson.DefaultJacksonObjectMapperFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ZaifCurrenciesTest {

    /**
     * Json
     *
     * [ { "id":10, "is_token":true, "name":"MAGATAMARD" },
     * { "id":120,  "is_token":true, "name":"RURUBG" },
     * { "id":1, "is_token":false, "name":"btc" } ]
     * @throws IOException
     */
    @Test
    public void testUnmarshal() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = ZaifCurrenciesTest.class.getResourceAsStream("/example/marketdata/currencies.json");
        ObjectMapper mapper = new ZaifJacksonObjectMapperFactory().createObjectMapper();
        List<ZaifCurrencies> obj = mapper.readValue(is, new TypeReference<List<ZaifCurrencies>>() {});

        // Verify that the example data was unmarshalled correctly
        assertThat(obj.size()).isEqualTo(3);
        assertThat(obj.get(0).getId()).isEqualTo(10L);
        assertThat(obj.get(0).getIsToken()).isEqualTo(true);
        assertThat(obj.get(0).getName()).isEqualTo("MAGATAMARD");
    }
}