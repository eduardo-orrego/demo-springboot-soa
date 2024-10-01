package org.xuaxpedia.springboot.soa.rest.simplerestclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

  @GetMapping("/client/rest/wc/{id}")
  public ResponseEntity<DemoModel> getRestWC(@PathVariable Long id) {
    DemoModel demoModel = demoService.getDataRestWC(id);
    return ResponseEntity.ok().body(demoModel);
  }

}