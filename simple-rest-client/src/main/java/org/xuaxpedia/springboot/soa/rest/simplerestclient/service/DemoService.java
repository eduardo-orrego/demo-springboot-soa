package org.xuaxpedia.springboot.soa.rest.simplerestclient.service;

import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

public interface DemoService {
    DemoModel getDataRestRT(Long id);

    DemoModel getDataRestWC(Long id);

}
