package com.vidgts.reactive.Demo.Reactive.controller;

import com.vidgts.reactive.Demo.Reactive.model.OpenApiData;
import com.vidgts.reactive.Demo.Reactive.service.RemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@Slf4j
public class RemoteUrlController {

    @Autowired
    public RemoteService service;

    public RemoteUrlController(RemoteService service){
        this.service = service;
    }

    @GetMapping("/openapidata")
    public Flux<OpenApiData> retrieveAllData(){
        return service.getApiData();
    }

}
