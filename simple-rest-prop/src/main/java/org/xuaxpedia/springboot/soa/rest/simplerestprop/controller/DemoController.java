package org.xuaxpedia.springboot.soa.rest.simplerestprop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.xuaxpedia.springboot.soa.rest.simplerestprop.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplerestprop.service.DemoService;

@RestController
@RequestMapping("/api/rest")
public class DemoController {
    @Autowired
    private DemoService demoService;

    /*
      * ResponseEntity is used to customize the HTTP response,
      * including status codes and headers.
      * In this case, we add a custom header "X-Source" to indicate
      * the data source and return 200 OK if the model is found,
      * or 404 Not Found if it is not.
      * This code is for educational/demo purposes only.
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<DemoModel> getDemo(@PathVariable Long id) {
      return demoService.getModelById(id)
        .map(user -> ResponseEntity.ok()
          .header("X-Source", "database")
          .body(user))
        .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /*
     * ResponseEntity is not used because the HTTP status is fixed (201)
     * and no custom headers are required.
     * Spring automatically serializes the object to JSON and applies
     * the status defined by @ResponseStatus.
     * This code is for educational/demo purposes only.
     */
    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public DemoModel postDemo(@RequestBody DemoModel demoModel) {
        return demoService.saveModel(demoModel);
    }
}
