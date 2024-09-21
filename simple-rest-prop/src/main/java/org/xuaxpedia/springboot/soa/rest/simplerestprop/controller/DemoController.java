package org.xuaxpedia.springboot.soa.rest.simplerestprop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xuaxpedia.springboot.soa.rest.simplerestprop.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplerestprop.service.DemoService;

@RestController
@RequestMapping("/api/rest")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/get/{id}")
    private ResponseEntity<DemoModel> getDemo(@PathVariable Long id) {
        return ResponseEntity.ok(demoService.getModelById(id));
    }

    @PostMapping("/post")
    private ResponseEntity<DemoModel> createDemo(@RequestBody DemoModel demoModel){
        DemoModel savedDemo = demoService.saveModel(demoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDemo);
    }
}
