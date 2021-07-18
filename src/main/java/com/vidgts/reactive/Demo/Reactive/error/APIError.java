package com.vidgts.reactive.Demo.Reactive.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIError {

    @JsonProperty("status_code")
    private String status_code;

    @JsonProperty("status_message")
    private String status_message;

    @JsonProperty("result")
    private String result;
}
