package org.xuaxpedia.springboot.soa.rest.simplerestclient.service;

import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

public interface RestClientService {
    DemoModel getDataRestClientRT(Long id);
    DemoModel getDataRestClientWC(Long id);
}
