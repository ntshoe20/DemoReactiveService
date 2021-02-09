package com.vidgts.reactive.Demo.Reactive.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class healthController {

    @RequestMapping("/health")
    public String Health(){
        log.info("I'm alive");
        return "App is active";
    }

}
