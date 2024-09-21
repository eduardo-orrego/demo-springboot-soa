package org.xuaxpedia.springboot.soa.rest.simplerestprop.service;

import org.xuaxpedia.springboot.soa.rest.simplerestprop.model.DemoModel;

public interface DemoService {

    DemoModel getModelById(Long id);
    DemoModel saveModel(DemoModel entity);

}
