package com.scaler.bmsbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Payment extends BaseModel {
    private double amount;
    private Date time;
    private String transactionNo;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @OneToOne
    private Ticket ticket;

}
/*
PAYMENT:PAYMENTSTATUS : M:1
 */