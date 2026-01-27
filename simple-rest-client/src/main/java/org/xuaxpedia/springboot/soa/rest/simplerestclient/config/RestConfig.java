package org.xuaxpedia.springboot.soa.rest.simplerestclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RestClient restClient(RestClient.Builder builder) {
        return builder
          .baseUrl("http://localhost:8082/api/rest")
          .build();
    }
}
