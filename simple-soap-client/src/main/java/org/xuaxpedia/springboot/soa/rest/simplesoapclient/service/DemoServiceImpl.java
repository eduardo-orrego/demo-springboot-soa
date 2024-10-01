package org.xuaxpedia.springboot.soa.rest.simplesoapclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.DataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.GetDataXmlRequest;

@Service
public class DemoServiceImpl implements DemoService {

  @Autowired
  private SoapClientService soapClientService;

  @Override
  public DemoModel getDataSoapWST(Long id) {
    GetDataXmlRequest soapRequest = new GetDataXmlRequest();
    soapRequest.setCode(id);
    DataXmlResponse soapResponse = soapClientService.getDataSoapClientWST(soapRequest);
    DemoModel demoModel = new DemoModel();
    demoModel.setId(soapResponse.getDataXml().getId());
    demoModel.setDescription(soapResponse.getDataXml().getName());
    return demoModel;
  }

  @Override
  public DemoModel createDataSoapWST(String name) {
    CreateDataXmlRequest soapRequest = new CreateDataXmlRequest();
    soapRequest.setName(name);
    DataXmlResponse soapResponse = soapClientService.createDataSoapClientWST(soapRequest);
    DemoModel demoModel = new DemoModel();
    demoModel.setId(soapResponse.getDataXml().getId());
    demoModel.setDescription(soapResponse.getDataXml().getName());
    return demoModel;
  }

}
