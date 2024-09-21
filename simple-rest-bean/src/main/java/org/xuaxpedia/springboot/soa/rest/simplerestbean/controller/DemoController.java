package org.xuaxpedia.springboot.soa.rest.simplerestbean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @PostMapping("/post")
    public ResponseEntity<DemoModel> postDemo(@RequestBody DemoModel demoModel) {
        DemoModel savedModel = demoService.saveModel(demoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedModel);
    }
}
