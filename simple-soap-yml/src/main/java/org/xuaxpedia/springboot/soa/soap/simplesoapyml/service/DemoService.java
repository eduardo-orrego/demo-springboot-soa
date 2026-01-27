package org.xuaxpedia.springboot.soa.soap.simplesoapyml.service;

import org.xuaxpedia.springboot.soa.soap.generated.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.generated.DataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.generated.GetDataXmlRequest;

public interface DemoService {
    DataXmlResponse getModelById(GetDataXmlRequest request);

    DataXmlResponse saveModel(CreateDataXmlRequest request);
}

