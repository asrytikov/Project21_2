package com.example.project21_2.controllers;

import com.example.project21_2.exceptions.NotEnoughMoneyException;
import com.example.project21_2.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enought money to make the payment");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

}
