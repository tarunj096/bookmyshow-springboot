package com.scaler.bmsbackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel{
    private String name;
    @OneToMany
    private List<Seat> seats;
    @ManyToOne
    private Theatre theatre;

    @ElementCollection //M:M Mapping with enums
    @Enumerated(EnumType.STRING) //table for Enum
    private List<Feature> audiitoriumFeatures;



}

/*
Auditorium :Features :- M:M
Auditorium : Theatre :- M:1
Auditorium: Seats :- 1:M
 */
