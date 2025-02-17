package com.mugeeth.exceptionHandling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleException(IllegalArgumentException e){
        return new ResponseEntity<Object>("Illegal Argument exception in global", HttpStatus.BAD_REQUEST);
    }
}
