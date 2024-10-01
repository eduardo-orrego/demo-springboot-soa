package org.xuaxpedia.springboot.soa.rest.simplesoapclient.client;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.DataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.GetDataXmlRequest;

@Component
public class SoapClient extends WebServiceGatewaySupport {

  public SoapClient(Jaxb2Marshaller marshaller) {
    getWebServiceTemplate().setMarshaller(marshaller);
    getWebServiceTemplate().setUnmarshaller(marshaller);
  }

  public DataXmlResponse getDataSoapClient(GetDataXmlRequest request) {
    return (DataXmlResponse) getWebServiceTemplate()
      .marshalSendAndReceive("http://localhost:8084/service/demoDataWsdl.wsdl", request,
        new SoapActionCallback("http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml/GetDataXmlRequest"));
  }

  public DataXmlResponse createDataSoapClient(CreateDataXmlRequest request) {
    return (DataXmlResponse) getWebServiceTemplate()
      .marshalSendAndReceive("http://localhost:8084/service/demoDataWsdl.wsdl", request,
        new SoapActionCallback("http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml/CreateDataXmlRequest"));
  }
}
