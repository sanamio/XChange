package org.knowm.xchange.zaif.dto.marketdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.knowm.xchange.zaif.ZaifJacksonObjectMapperFactory;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ZaifDepthTest {

    /**
     * Json
     *
     * {
     *   "asks":[
     *     [ 1192090.0, 4.2355],
     *     [ 1192200.0, 1.0],
     *     ...
     *   ],
     *   "bids":[
     *     [ 1192060.0, 0.065],
     *     [ 1192025.0, 0.3365],
     *     ...
     *   ]
     * }
     * @throws IOException
     */
    @Test
    public void testUnmarshal() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = ZaifDepthTest.class.getResourceAsStream("/example/marketdata/depth.json");

        ObjectMapper mapper = new ZaifJacksonObjectMapperFactory().createObjectMapper();
        ZaifDepth obj = mapper.readValue(is, ZaifDepth.class);

        // Verify that the example data was unmarshalled correctly
        assertThat(obj.getAsks().size()).isEqualTo(4);
        assertThat(obj.getBids().size()).isEqualTo(3);
        assertThat(obj.getAsks().get(0).getPrice()).isEqualTo(new BigDecimal("1192090.0"));
        assertThat(obj.getAsks().get(0).getAmount()).isEqualTo(new BigDecimal("4.2355"));
        assertThat(obj.getBids().get(0).getPrice()).isEqualTo(new BigDecimal("1192060.0"));
        assertThat(obj.getBids().get(0).getAmount()).isEqualTo(new BigDecimal("0.065"));
    }
}