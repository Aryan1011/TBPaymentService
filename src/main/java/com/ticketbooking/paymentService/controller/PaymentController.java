package com.ticketbooking.paymentService.controller;


import com.ticketbooking.paymentService.entities.PaymentInfo;
import com.ticketbooking.paymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping
    ResponseEntity<Object> createPayment(@RequestBody PaymentInfo paymentInfo){
        if(!paymentService.validateCreditCard(paymentInfo.getCreditCardNo())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid credit card");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(paymentService.createPayment(paymentInfo));
    }
}
