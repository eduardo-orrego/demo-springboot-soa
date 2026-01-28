package org.xuaxpedia.springboot.soa.rest.simplesoapclient.client;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.CreateDataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.GetDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.GetDataXmlResponse;

@Component
public class SoapClient extends WebServiceGatewaySupport {

  public SoapClient(Jaxb2Marshaller marshaller) {
    getWebServiceTemplate().setMarshaller(marshaller);
    getWebServiceTemplate().setUnmarshaller(marshaller);
  }

  public GetDataXmlResponse getDataSoapClient(GetDataXmlRequest request) {
    return (GetDataXmlResponse) getWebServiceTemplate()
      .marshalSendAndReceive("http://localhost:8084/service/demo-data", request,
        new SoapActionCallback("http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml/GetDataXmlRequest"));
  }

  public CreateDataXmlResponse createDataSoapClient(CreateDataXmlRequest request) {
    return (CreateDataXmlResponse) getWebServiceTemplate()
      .marshalSendAndReceive("http://localhost:8084/service/demo-data", request,
        new SoapActionCallback("http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml/CreateDataXmlRequest"));
  }
}
