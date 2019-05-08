package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.model.Location;
import com.example.demo.model.Offre;

public interface LocationService {

	List<Location> getAll();

    Optional<Location> getById(Long id);

    void deleteById(Long id);

    Location addOne(Location location);

    List<Location> getByOffres(Offre offre);
   
    List<Location> getByDiscription(String discription);
    
    List<Location> getByNumber(int number);
}
