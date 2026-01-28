package org.xuaxpedia.springboot.soa.soap.simplesoapyml.service;

import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.CreateDataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.GetDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.generated.GetDataXmlResponse;

public interface DemoService {
    GetDataXmlResponse getModelById(GetDataXmlRequest request);

    CreateDataXmlResponse saveModel(CreateDataXmlRequest request);
}

