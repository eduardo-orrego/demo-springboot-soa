package org.xuaxpedia.springboot.soa.rest.simplerestclient.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

@Component
public class RestClient {

    private final RestTemplate restTemplate;

    private final WebClient webClient;

    public RestClient(RestTemplate restTemplate, WebClient.Builder webClientBuilder) {
        this.restTemplate = restTemplate;
        this.webClient = webClientBuilder.baseUrl("http://localhost:8082/api/rest").build();
    }

    public DemoModel getFromRestTemplate(Long id) {
        String url = "http://localhost:8082/api/rest/get/" + id;
        return restTemplate.getForObject(url, DemoModel.class);
    }

    public DemoModel getFromWebClient(Long id) {
        return webClient.get()
                .uri("/get/{id}", id)
                .retrieve()
                .bodyToMono(DemoModel.class)
                .block(); // Blocking, behaves synchronously
    }
}
