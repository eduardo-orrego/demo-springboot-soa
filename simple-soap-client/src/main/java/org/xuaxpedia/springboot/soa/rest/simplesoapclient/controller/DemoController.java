package org.xuaxpedia.springboot.soa.rest.simplesoapclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.service.DemoService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/client/soap/wsc/{id}")
    public ResponseEntity<DemoModel> getData(@PathVariable Long id) {
        DemoModel demoModel = demoService.getDataSoapWST(id);
        return ResponseEntity.ok().body(demoModel);
    }

    @PostMapping("/client/soap/wsc/{name}")
    public ResponseEntity<DemoModel> postData(@PathVariable String name) {
        DemoModel demoModel = demoService.createDataSoapWST(name);
        return ResponseEntity.ok().body(demoModel);
    }
}
