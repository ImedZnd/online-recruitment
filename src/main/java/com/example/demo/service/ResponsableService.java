package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Responsable;


public interface ResponsableService {

	List<Responsable> getAll(String sortby);

    Optional<Responsable> getById(Long id);

    void deleteById(Long id);

    Responsable addOne(Responsable client);

    List<Responsable> getByName(String name);
    
    List<Responsable> getBySurename(String surename);
    
    List<Responsable> getByRole(Enum role);
        
    List<Responsable> getByStatus(String status);
}
