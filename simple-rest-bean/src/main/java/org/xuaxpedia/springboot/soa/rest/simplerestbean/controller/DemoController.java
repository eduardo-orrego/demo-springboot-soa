package org.xuaxpedia.springboot.soa.rest.simplerestbean.controller;

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
import org.xuaxpedia.springboot.soa.rest.simplerestbean.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplerestbean.service.DemoService;

@RestController
@RequestMapping("/api/rest")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/get/{id}")
    public ResponseEntity<DemoModel> getDemo(@PathVariable Long id) {
        return ResponseEntity.ok(demoService.getModelById(id));
    }

    /*
     * ResponseEntity is not used because the HTTP status is fixed (201)
     * and no custom headers are required.
     * Spring automatically serializes the object to JSON and applies
     * the status defined by @ResponseStatus.
     */
    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public DemoModel postDemo(@RequestBody DemoModel demoModel) {
        return demoService.saveModel(demoModel);
    }
}
