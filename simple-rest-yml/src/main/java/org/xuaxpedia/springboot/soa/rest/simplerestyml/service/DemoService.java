package org.xuaxpedia.springboot.soa.rest.simplerestyml.service;

import org.xuaxpedia.springboot.soa.rest.simplerestyml.model.DemoModel;

public interface DemoService {
    DemoModel getModelById(Long id);
    DemoModel saveModel(DemoModel entity);
}
