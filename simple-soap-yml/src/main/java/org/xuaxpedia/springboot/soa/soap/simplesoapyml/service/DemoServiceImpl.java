package org.xuaxpedia.springboot.soa.soap.simplesoapyml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.CreateDataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.DataXml;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.GetDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.GetDataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.model.DemoModel;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public GetDataXmlResponse getModelById(GetDataXmlRequest request) {
        DemoModel demoModel = demoRepository.findById(request.getCode())
                .orElseThrow(() -> new RuntimeException("Data not found"));
        DataXml dataXml = new DataXml();
        dataXml.setName(demoModel.getName());
        dataXml.setId(demoModel.getId());
        GetDataXmlResponse response = new GetDataXmlResponse();
        response.setDataXml(dataXml);
        return response;
    }

    @Override
    public CreateDataXmlResponse saveModel(CreateDataXmlRequest request) {
        DemoModel demoModel = new DemoModel();
        demoModel.setName(request.getName());
        DemoModel modelSaved = demoRepository.save(demoModel);
        DataXml dataXml = new DataXml();
        dataXml.setName(modelSaved.getName());
        dataXml.setId(modelSaved.getId());
        CreateDataXmlResponse response = new CreateDataXmlResponse();
        response.setDataXml(dataXml);
        return response;
    }
}
