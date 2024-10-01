package org.xuaxpedia.springboot.soa.rest.simplerestclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.client.RestClient;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

@Service
public class RestClientServiceImpl implements RestClientService {

    @Autowired
    private RestClient restClient;

    @Override
    public DemoModel getDataRestClientRT(Long id) {
        return restClient.getFromRestTemplate(id);
    }

    @Override
    public DemoModel getDataRestClientWC(Long id) {
        return restClient.getFromWebClient(id);
    }
}
