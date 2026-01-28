package org.xuaxpedia.springboot.soa.rest.simplesoapclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.model.DemoModel;
import org.xuaxpedia.springboot.soa.rest.simplesoapclient.service.DemoService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/client/soap/wsc/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DemoModel getData(@PathVariable Long id) {
        return demoService.getDataSoapWST(id);
    }

    @PostMapping("/client/soap/wsc/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public DemoModel postData(@PathVariable String name) {
        return demoService.createDataSoapWST(name);
    }
}
