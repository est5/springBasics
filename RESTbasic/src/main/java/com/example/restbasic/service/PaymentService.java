package com.example.restbasic.service;

import com.example.restbasic.exception.NotEnoughMoneyException;
import com.example.restbasic.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
