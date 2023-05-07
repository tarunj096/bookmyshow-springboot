package com.scaler.bmsbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel {

    private int price;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

    @ManyToOne
    private Ticket ticket;

}
/*
ShowSeat - Ticket : M:1
 */
