package org.xuaxpedia.springboot.soa.soap.simplesoapyml.service;

import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.DataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.GetDataXmlRequest;

public interface DemoService {
    DataXmlResponse getModelById(GetDataXmlRequest request);

    DataXmlResponse saveModel(CreateDataXmlRequest request);
}

