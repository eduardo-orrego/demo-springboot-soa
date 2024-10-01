package org.xuaxpedia.springboot.soa.rest.simplesoapclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.client.SoapClient;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.DataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.GetDataXmlRequest;

@Service
public class SoapClientServiceImpl implements SoapClientService {

  @Autowired
  private SoapClient soapClient;

  @Override
  public DataXmlResponse getDataSoapClientWST(GetDataXmlRequest request) {
    return soapClient.getDataSoapClient(request);
  }

  @Override
  public DataXmlResponse createDataSoapClientWST(CreateDataXmlRequest request) {
    return soapClient.createDataSoapClient(request);
  }
}
