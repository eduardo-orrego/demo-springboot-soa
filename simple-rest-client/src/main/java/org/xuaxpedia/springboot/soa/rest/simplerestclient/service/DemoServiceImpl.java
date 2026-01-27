package org.xuaxpedia.springboot.soa.rest.simplerestclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.client.RestApiClient;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

@Service
public class DemoServiceImpl implements DemoService {

  @Autowired
  private RestApiClient restApiClient;

  @Override
  public DemoModel getDataRestRT(Long id) {
    return restApiClient.getFromRestTemplate(id);
  }

  @Override
  public DemoModel getDataRestWC(Long id) {
    return restApiClient.getFromWebClient(id);
  }

}
