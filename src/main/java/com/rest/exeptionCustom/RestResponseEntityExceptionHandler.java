package com.rest.exeptionCustom;


import lombok.AllArgsConstructor;

public class RestResponseEntityExceptionHandler extends RuntimeException {

    private String message;

    public RestResponseEntityExceptionHandler(String message) {
         this.message = message;
    }
}
