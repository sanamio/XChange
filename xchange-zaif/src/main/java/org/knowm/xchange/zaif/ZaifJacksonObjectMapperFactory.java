package org.knowm.xchange.zaif;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import si.mazi.rescu.serialization.jackson.DefaultJacksonObjectMapperFactory;
import si.mazi.rescu.serialization.jackson.JacksonObjectMapperFactory;

public class ZaifJacksonObjectMapperFactory implements JacksonObjectMapperFactory {

    private final JacksonObjectMapperFactory defaultFactory = new DefaultJacksonObjectMapperFactory();

    @Override
    public ObjectMapper createObjectMapper() {
        ObjectMapper result = defaultFactory.createObjectMapper();
        result.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return result;
    }

    @Override
    public void configureObjectMapper(ObjectMapper objectMapper) {
        defaultFactory.configureObjectMapper(objectMapper);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }
}
