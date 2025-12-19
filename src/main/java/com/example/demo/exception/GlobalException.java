package com.example.demo.exception;


import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ResponeBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.Http;


@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponeBody<String>handleValidationException(ValidationException ex){
        return new ResponeBody<String>(ex.getMessage(),Httpstatus.BAD_GATEWAY);
    }
}