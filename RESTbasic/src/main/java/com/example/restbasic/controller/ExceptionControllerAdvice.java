package com.example.restbasic.controller;

import com.example.restbasic.exception.NotEnoughMoneyException;
import com.example.restbasic.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)//only this exception will trigger this advice
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoney(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to make the payment.");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
