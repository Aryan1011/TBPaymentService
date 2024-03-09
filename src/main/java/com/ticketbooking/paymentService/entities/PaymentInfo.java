package com.ticketbooking.paymentService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PaymentInfo {
    @Id
    private String paymentId;
    private String userId;
    private int amount;
    private Date transactionDate;
    private Boolean isRefund;
    private String creditCardNo;

    public PaymentInfo(String paymentId, String userId, int amount, Date transactionDate, Boolean isRefund, String creditCardNo) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isRefund = isRefund;
        this.creditCardNo = creditCardNo;
    }

    public PaymentInfo() {
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Boolean getRefund() {
        return isRefund;
    }

    public void setRefund(Boolean refund) {
        isRefund = refund;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
}
