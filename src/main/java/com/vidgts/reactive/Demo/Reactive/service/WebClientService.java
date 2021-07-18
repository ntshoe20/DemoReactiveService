package com.vidgts.reactive.Demo.Reactive.service;

import com.vidgts.reactive.Demo.Reactive.model.OpenApiData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class WebClientService {

    WebClient client = WebClient.create("https://api.publicapis.org");

    public Flux<OpenApiData> get(String endpoint){
        return client.get()
                .uri(endpoint)
                .retrieve()
                .bodyToFlux(OpenApiData.class);
    }

}
