package org.xuaxpedia.springboot.soa.rest.simplesoapclient.service;

import org.xuaxpedia.springboot.soa.rest.simplesoapclient.model.DemoModel;

public interface DemoService {

    DemoModel getDataSoapWST(Long id);

    DemoModel createDataSoapWST(String name);
}
