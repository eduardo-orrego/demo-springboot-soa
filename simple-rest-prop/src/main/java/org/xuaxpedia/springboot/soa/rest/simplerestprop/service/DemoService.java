package org.xuaxpedia.springboot.soa.rest.simplerestprop.service;

import java.util.Optional;
import org.xuaxpedia.springboot.soa.rest.simplerestprop.model.DemoModel;

public interface DemoService {

    Optional<DemoModel> getModelById(Long id);
    DemoModel saveModel(DemoModel entity);

}
