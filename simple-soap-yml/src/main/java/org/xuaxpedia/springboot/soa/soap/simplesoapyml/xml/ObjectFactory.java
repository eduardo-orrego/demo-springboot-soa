package org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public GetDataXmlRequest createGetDataXmlRequest() {
        return new GetDataXmlRequest();
    }

    public CreateDataXmlRequest createCreateDataXmlRequest() {
        return new CreateDataXmlRequest();
    }

    public DataXmlResponse createDataXmlResponse() {
        return new DataXmlResponse();
    }

    public DataXml createDataXml() {
        return new DataXml();
    }

}
