package org.xuaxpedia.springboot.soa.rest.simplerestyml.service;

import java.util.Optional;
import org.xuaxpedia.springboot.soa.rest.simplerestyml.model.DemoModel;

public interface DemoService {

    Optional<DemoModel> getModelById(Long id);
    DemoModel saveModel(DemoModel entity);

}
