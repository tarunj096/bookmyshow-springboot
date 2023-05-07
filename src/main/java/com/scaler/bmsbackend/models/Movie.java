package com.scaler.bmsbackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    private String description;
    private int length;
    private double rating;

    private Date releaseDate;
    @OneToMany
    private List<Show> shows;

    @ManyToMany
    private List<Actor> actors;

    @ElementCollection //M:M Mapping with enums
    @Enumerated(EnumType.STRING) //table for Enum
    private List<Feature> movieFeatures;

    @ElementCollection //M:M Mapping with enums
    @Enumerated(EnumType.STRING) //table for Enum
    private List<Language> languages;
}

/*
Movie: Shows 1:M
Movie : Actors M:M
Movie Language: M:M
Movie: Features : M:M
 */
