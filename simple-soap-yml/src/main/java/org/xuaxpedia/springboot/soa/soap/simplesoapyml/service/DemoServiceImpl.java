package org.xuaxpedia.springboot.soa.soap.simplesoapyml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.model.DemoModel;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.repository.DemoRepository;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.DataXml;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.DataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.GetDataXmlRequest;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public DataXmlResponse getModelById(GetDataXmlRequest request) {
        DemoModel demoModel = demoRepository.findById(request.getCode())
                .orElseThrow(() -> new RuntimeException("Data not found"));
        DataXml dataXml = new DataXml();
        dataXml.setName(demoModel.getName());
        dataXml.setId(demoModel.getId());
        DataXmlResponse response = new DataXmlResponse();
        response.setDataXml(dataXml);
        return response;
    }

    @Override
    public DataXmlResponse saveModel(CreateDataXmlRequest request) {
        DemoModel demoModel = new DemoModel();
        demoModel.setName(request.getName());
        DemoModel modelSaved = demoRepository.save(demoModel);
        DataXml dataXml = new DataXml();
        dataXml.setName(modelSaved.getName());
        dataXml.setId(modelSaved.getId());
        DataXmlResponse response = new DataXmlResponse();
        response.setDataXml(dataXml);
        return response;
    }
}
