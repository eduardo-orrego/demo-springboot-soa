package org.xuaxpedia.springboot.soa.rest.simplesoapclient.service;

import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.CreateDataXmlRequest;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.DataXmlResponse;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl.GetDataXmlRequest;

public interface SoapClientService {
  DataXmlResponse getDataSoapClientWST(GetDataXmlRequest request);

  DataXmlResponse createDataSoapClientWST(CreateDataXmlRequest request);
}
