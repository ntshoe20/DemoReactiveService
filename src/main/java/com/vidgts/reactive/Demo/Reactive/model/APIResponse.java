package com.vidgts.reactive.Demo.Reactive.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class APIResponse {
    private String statusCode;
    private String statusMessage;
    private LocalDateTime timeStamp;
}
