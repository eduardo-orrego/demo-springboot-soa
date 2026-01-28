package org.xuaxpedia.springboot.soa.rest.simplerestclient.client;

import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

@Component
public class RestApiClient {

    private final RestTemplate restTemplate;

    private final RestClient restClient;

    public RestApiClient(RestTemplate restTemplate, RestClient restClient) {
        this.restTemplate = restTemplate;
        this.restClient = restClient;
    }

    public Optional<DemoModel> getFromRestTemplate(Long id) {
        try {
            return Optional.ofNullable(
              restTemplate.getForObject("/get/{id}", DemoModel.class, id)
            );
        } catch (HttpClientErrorException.NotFound ex) {
            return Optional.empty();
        }
    }

    public DemoModel getFromWebClient(Long id) {
        return restClient.get()
                .uri("/get/{id}", id)
                .retrieve()
                .body(DemoModel.class);
    }
}
