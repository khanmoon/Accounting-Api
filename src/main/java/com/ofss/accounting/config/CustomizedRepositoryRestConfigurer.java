package com.ofss.accounting.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class CustomizedRepositoryRestConfigurer implements RepositoryRestConfigurer {
    @Override
    public void configureJacksonObjectMapper(ObjectMapper objectMapper) {

    }
}
