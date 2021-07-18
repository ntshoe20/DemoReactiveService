package com.vidgts.reactive.Demo.Reactive.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class RemoteUrlController {

    RestTemplate restTemplate;

    public RemoteUrlController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    //post method to check if twitter is online or not
   /* @GetMapping("/twitter")
    public ResponseEntity getTwitter(){
        String endpoint = "https://twiiter.com";

        String status = restTemplate.getForObject(endpoint,String.class);
        HttpStatus response = status

        return ResponseEntity(HttpStatus.CREATED,response);
    }*/

}
