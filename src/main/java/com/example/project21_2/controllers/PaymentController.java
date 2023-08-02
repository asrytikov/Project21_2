package com.example.project21_2.controllers;

import com.example.project21_2.exceptions.NotEnoughMoneyException;
import com.example.project21_2.models.ErrorDetails;
import com.example.project21_2.models.PaymentDetails;
import com.example.project21_2.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(){
        //try{
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        /*}catch (NotEnoughMoneyException exception){
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enought money to make the payment");
            return ResponseEntity
                    .badRequest()
                    .body(errorDetails);
        }*/
    }
    
}
