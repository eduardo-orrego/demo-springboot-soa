package org.xuaxpedia.springboot.soa.rest.simplesoapclient.client;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.CreateDataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.GetDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.GetDataXmlResponse;

@Component
public class SoapClient {

  private final WebServiceTemplate wsTemplate;

  public SoapClient(WebServiceTemplate webServiceTemplate) {
    this.wsTemplate = webServiceTemplate;
  }

  public GetDataXmlResponse getDataSoapClient(GetDataXmlRequest request) {
    String uriActionGet = "http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml/GetDataXmlRequest";
    Object objectResponse = wsTemplate.marshalSendAndReceive(request, new SoapActionCallback(uriActionGet));
    return (GetDataXmlResponse) objectResponse;
  }

  public CreateDataXmlResponse createDataSoapClient(CreateDataXmlRequest request) {
    String uriActionCreate = "http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml/GetDataXmlRequest";
    Object objectResponse = wsTemplate.marshalSendAndReceive(request, new SoapActionCallback(uriActionCreate));
    return (CreateDataXmlResponse) objectResponse;
  }

}
