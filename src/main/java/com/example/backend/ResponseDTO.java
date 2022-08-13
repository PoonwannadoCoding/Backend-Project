package com.example.backend;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseDTO {

    private boolean success;
    private boolean message;
}
