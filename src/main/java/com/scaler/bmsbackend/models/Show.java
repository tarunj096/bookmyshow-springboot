package com.scaler.bmsbackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Show extends BaseModel {

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    @OneToMany
    private List<ShowSeat> showSeats;

    @OneToMany
    private List<Ticket> tickets;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> showFeatures;
}

/*
SHOW-MOvie M:1
Show - Auditorium M:1
Show - ShowSeats 1:M
Show - Ticket 1:M
Show - ShowFeatures M:M
 */
