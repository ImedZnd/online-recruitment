package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cv;
import com.example.demo.model.Formation;

public interface FormationService {
	List<Formation> getAll(String sortby);

    Optional<Formation> getById(Long id);

    void deleteById(Long id);

    Formation addOne(Formation experience);

    List<Formation> getByGrade(Date grade);
   
    List<Formation> getByEstablishmentNameContain(String establishmentName);

    List<Formation> getByCreatedAt(Date createdAt);
    
    List<Formation> getByCv(Cv cv);
}
