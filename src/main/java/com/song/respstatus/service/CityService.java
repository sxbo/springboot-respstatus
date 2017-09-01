package com.song.respstatus.service;

import com.song.respstatus.domain.City;

import java.util.List;

public interface CityService {
    List<City> findAllCity();

    City findById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
