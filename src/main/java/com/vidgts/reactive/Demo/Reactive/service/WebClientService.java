package com.vidgts.reactive.Demo.Reactive.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class WebClientService {

    WebClient client = WebClient.create("https://localhost:999");

}
