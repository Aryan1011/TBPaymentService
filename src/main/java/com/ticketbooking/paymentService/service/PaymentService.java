package com.ticketbooking.paymentService.service;

import com.ticketbooking.paymentService.entities.PaymentInfo;

public interface PaymentService {
    PaymentInfo createPayment(PaymentInfo paymentInfo);

    boolean validateCreditCard(String creditCardNo);
}
