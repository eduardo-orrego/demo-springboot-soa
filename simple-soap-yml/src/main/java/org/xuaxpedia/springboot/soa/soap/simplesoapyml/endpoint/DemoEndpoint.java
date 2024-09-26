package org.xuaxpedia.springboot.soa.soap.simplesoapyml.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.service.DemoService;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.DataXmlResponse;
import org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml.GetDataXmlRequest;

@Endpoint
public class DemoEndpoint {
    private static final String NAMESPACE_URI = "http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml";

    @Autowired
    private DemoService demoService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetDataXmlRequest")
    @ResponsePayload
    public DataXmlResponse getData(@RequestPayload GetDataXmlRequest request) {
        return demoService.getModelById(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateDataXmlRequest")
    @ResponsePayload
    public DataXmlResponse createData(@RequestPayload CreateDataXmlRequest request) {
        return demoService.saveModel(request);
    }
}
