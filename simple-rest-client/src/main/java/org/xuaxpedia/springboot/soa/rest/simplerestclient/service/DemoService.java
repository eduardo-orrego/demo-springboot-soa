package org.xuaxpedia.springboot.soa.rest.simplerestclient.service;

import java.util.Optional;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

public interface DemoService {
    Optional<DemoModel> getDataRestRT(Long id);

    DemoModel getDataRestWC(Long id);

}
