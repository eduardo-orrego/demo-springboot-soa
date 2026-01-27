package org.xuaxpedia.springboot.soa.rest.simplerestclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.service.DemoService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

  @Autowired
  private DemoService demoService;

  @GetMapping("/client/rest/rt/{id}")
  public ResponseEntity<DemoModel> getClientRest(@PathVariable Long id) {
    DemoModel demoModel = demoService.getDataRestRT(id);
    return ResponseEntity.ok().body(demoModel);
  }

  /*
   * ResponseEntity is not used because the HTTP status is fixed (201)
   * and no custom headers are required.
   * Spring automatically serializes the object to JSON and applies
   * the status defined by @ResponseStatus.
   * This code is for educational/demo purposes only.
   */
  @GetMapping("/client/rest/wc/{id}")
  public DemoModel getRestWC(@PathVariable Long id) {
    return demoService.getDataRestWC(id);
  }

}