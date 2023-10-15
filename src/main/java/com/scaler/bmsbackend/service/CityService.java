package com.scaler.bmsbackend.service;

import com.scaler.bmsbackend.models.City;
import com.scaler.bmsbackend.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }
    public City addCity(String name){
        City newCity = new City();
        newCity.setName(name);
        return cityRepository.save(newCity);
    }

}
