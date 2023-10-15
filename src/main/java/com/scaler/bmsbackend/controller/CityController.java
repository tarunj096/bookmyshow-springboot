package com.scaler.bmsbackend.controller;

import com.scaler.bmsbackend.models.City;
import com.scaler.bmsbackend.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CityController {

    private CityService cityService;

    @Autowired //dependency inject
    public CityController(CityService cityService){
        this.cityService = cityService;
    }

    public City addCity(String name){
        return cityService.addCity(name);
    }

}
