package com.ticketbooking.paymentService.repositories;

import com.ticketbooking.paymentService.entities.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentInfo,String> {
}
