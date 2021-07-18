package com.vidgts.reactive.Demo.Reactive.service;

import com.vidgts.reactive.Demo.Reactive.model.OpenApiData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

@Slf4j
@Service
public class RemoteService {
    @Autowired
    WebClientService webClientService;

    public RemoteService(WebClientService webClientService){
        this.webClientService = webClientService;
    }

    public Flux<OpenApiData> getApiData(){
        LocalDateTime timeStamp = getTimeStamp();
        String url = "/entries/";

        return webClientService.get(url);
    }

    public LocalDateTime getTimeStamp(){
        LocalDateTime timeStamp = LocalDateTime.now();
        return timeStamp;
    }
}
