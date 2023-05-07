package com.scaler.bmsbackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel {
    private String seatNumber;
    private  int row;
    private int column;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    @Enumerated(EnumType.STRING) //create a table for Enum and mark the relationship
    private SeatStatus seatStatus;

    @ManyToOne
    private Auditorium auditorium;
}

/*
Seat -SeatType : M:1
Seat - Auditorium M:1
 */
