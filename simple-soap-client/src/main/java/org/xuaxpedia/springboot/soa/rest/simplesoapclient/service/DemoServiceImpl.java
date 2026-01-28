package org.xuaxpedia.springboot.soa.rest.simplesoapclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.client.SoapClient;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.CreateDataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.GetDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.generated.GetDataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.model.DemoModel;

@Service
public class DemoServiceImpl implements DemoService {

  @Autowired
  private SoapClient soapClientService;

  @Override
  public DemoModel getDataSoapWST(Long id) {
    GetDataXmlRequest soapRequest = new GetDataXmlRequest();
    soapRequest.setCode(id);
    GetDataXmlResponse soapResponse = soapClientService.getDataSoapClient(soapRequest);
    DemoModel demoModel = new DemoModel();
    demoModel.setId(soapResponse.getDataXml().getId());
    demoModel.setDescription(soapResponse.getDataXml().getName());
    return demoModel;
  }

  @Override
  public DemoModel createDataSoapWST(String name) {
    CreateDataXmlRequest soapRequest = new CreateDataXmlRequest();
    soapRequest.setName(name);
    CreateDataXmlResponse soapResponse = soapClientService.createDataSoapClient(soapRequest);
    DemoModel demoModel = new DemoModel();
    demoModel.setId(soapResponse.getDataXml().getId());
    demoModel.setDescription(soapResponse.getDataXml().getName());
    return demoModel;
  }

}
