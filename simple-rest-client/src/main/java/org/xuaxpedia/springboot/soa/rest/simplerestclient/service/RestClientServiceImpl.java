package org.xuaxpedia.springboot.soa.rest.simplerestclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.client.DemoApiClient;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

@Service
public class RestClientServiceImpl implements RestClientService {

    @Autowired
    private DemoApiClient demoApiClient;

    @Override
    public DemoModel getDataRestClientRT(Long id) {
        return demoApiClient.getFromRestTemplate(id);
    }

    @Override
    public DemoModel getDataRestClientWC(Long id) {
        return demoApiClient.getFromWebClient(id);
    }
}
