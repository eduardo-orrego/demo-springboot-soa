package org.xuaxpedia.springboot.soa.soap.simplesoapyml.service;

import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.DataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.GetDataXmlRequest;

public interface DemoService {
    DataXmlResponse getModelById(GetDataXmlRequest request);

    DataXmlResponse saveModel(CreateDataXmlRequest request);
}

