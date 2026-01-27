package org.xuaxpedia.springboot.soa.rest.simplerestclient.client;

import org.springframework.stereotype.Component;
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

    public DemoModel getFromRestTemplate(Long id) {
        String url = "http://localhost:8082/api/rest/get/" + id;
        return restTemplate.getForObject(url, DemoModel.class);
    }

    public DemoModel getFromWebClient(Long id) {
        return restClient.get()
                .uri("/get/{id}", id)
                .retrieve()
                .body(DemoModel.class);
    }
}
