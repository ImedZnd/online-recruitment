package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Responsable;

@Service
public interface ResponsableService {

	List<Responsable> getAll(String sortby);

    Optional<Responsable> getById(Long id);

    void deleteById(Long id);

    Responsable addOne(Responsable client);

    List<Responsable> getResponsableByName(String name);
    
    List<Responsable> getResponsableByRole(Enum role);
        
    List<Responsable> getResponsableByStatus(String status);
}
