package org.xuaxpedia.springboot.soa.rest.simplerestclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;

@Service
public class DemoServiceImpl implements DemoService {

  @Autowired
  private RestClientService restClientService;

  @Override
  public DemoModel getDataRestRT(Long id) {
    return restClientService.getDataRestClientRT(id);
  }

  @Override
  public DemoModel getDataRestWC(Long id) {
    return restClientService.getDataRestClientWC(id);
  }

}
