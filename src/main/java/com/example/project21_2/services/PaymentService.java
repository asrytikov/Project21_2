package com.example.project21_2.services;

import com.example.project21_2.exceptions.NotEnoughMoneyException;
import com.example.project21_2.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }

}
