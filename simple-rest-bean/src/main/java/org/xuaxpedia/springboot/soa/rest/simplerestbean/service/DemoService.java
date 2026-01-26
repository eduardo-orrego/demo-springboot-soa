package org.xuaxpedia.springboot.soa.rest.simplerestbean.service;

import java.util.Optional;
import org.xuaxpedia.springboot.soa.rest.simplerestbean.model.DemoModel;

public interface DemoService {
    Optional<DemoModel> getModelById(Long id);
    DemoModel saveModel(DemoModel entity);
}
