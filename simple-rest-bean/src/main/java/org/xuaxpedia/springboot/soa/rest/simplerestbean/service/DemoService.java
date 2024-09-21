package org.xuaxpedia.springboot.soa.rest.simplerestbean.service;

import org.xuaxpedia.springboot.soa.rest.simplerestbean.model.DemoModel;

public interface DemoService {
    DemoModel getModelById(Long id);
    DemoModel saveModel(DemoModel entity);
}
