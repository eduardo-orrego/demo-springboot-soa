package org.xuaxpedia.springboot.soa.rest.simplerestyml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplerestyml.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplerestyml.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public DemoModel getModelById(Long id) {
        return demoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found"));
    }

    @Override
    public DemoModel saveModel(DemoModel entity) {
        return demoRepository.save(entity);
    }

}