package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Responsable;


public interface ResponsableService {

	List<Responsable> getAll(String sortby);

    Optional<Responsable> getById(Long id);

    void deleteById(Long id);

    Responsable addOne(Responsable client);

    List<Responsable> getResponsableByName(String name);
    
    List<Responsable> getResponsableByRole(Enum role);
        
    List<Responsable> getResponsableByStatus(String status);
}
