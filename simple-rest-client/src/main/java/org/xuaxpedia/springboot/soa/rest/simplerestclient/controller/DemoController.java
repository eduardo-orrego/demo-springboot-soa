package org.xuaxpedia.springboot.soa.rest.simplerestclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplerestclient.service.DemoService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

  @Autowired
  private DemoService demoService;

  /*
   * ResponseEntity is used when the HTTP response must be built dynamically.
   * It allows setting status codes and headers at runtime based on application logic.
   * In this example, a custom "X-Source" header is added to indicate
   * the origin of the data.
   *
   * This code is intended for educational/demo purposes.
   */
  @GetMapping("/client/rest/rt/{id}")
  public ResponseEntity<DemoModel> getClientRest(@PathVariable Long id) {
    return demoService.getDataRestRT(id)
      .map(user -> ResponseEntity.ok()
        .header("X-Source", "rest-template-client")
        .body(user))
      .orElse(ResponseEntity.notFound().build());
  }

  /*
   * ResponseEntity is not required in this case because the HTTP status
   * is static and no dynamic response customization is needed.
   * Spring automatically serializes the returned object to JSON and
   * applies the status defined by the @ResponseStatus annotation.
   *
   * This code is intended for educational/demo purposes.
   */
  @GetMapping("/client/rest/wc/{id}")
  @ResponseStatus(HttpStatus.CREATED)
  public DemoModel getRestWC(@PathVariable Long id) {
    return demoService.getDataRestWC(id);
  }

}