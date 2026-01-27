package org.xuaxpedia.springboot.soa.rest.simplerestclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class RestApiConfig {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(
          new DefaultUriBuilderFactory("http://localhost:8082/api/rest")
        );
        return restTemplate;
    }

    @Bean
    public RestClient restClient(RestClient.Builder builder) {
        return builder
          .baseUrl("http://localhost:8082/api/rest")
          .build();
    }
}
