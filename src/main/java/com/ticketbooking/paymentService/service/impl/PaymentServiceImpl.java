package com.ticketbooking.paymentService.service.impl;

import com.ticketbooking.paymentService.entities.PaymentInfo;
import com.ticketbooking.paymentService.repositories.PaymentRepository;
import com.ticketbooking.paymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public PaymentInfo createPayment(PaymentInfo paymentInfo) {
        paymentInfo.setPaymentId(UUID.randomUUID().toString());
        return paymentRepository.save(paymentInfo);
    }

    @Override
    public boolean validateCreditCard(String creditCardNo) {
        return creditCardNo.length()==10;
    }

}
