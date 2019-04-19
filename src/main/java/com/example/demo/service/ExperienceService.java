package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Cv;
import com.example.demo.model.Experience;

public interface ExperienceService {

	List<Experience> getAll(String sortby);

    Optional<Experience> getById(Long id);

    void deleteById(Long id);

    Experience addOne(Experience experience);

    List<Experience> getByCv(Cv cv);
   
    List<Experience> getByEstablishmentNameContain(String establishmentName);

    List<Experience> getByStart(Date start);
    
    List<Experience> getByEnd(Date end);

    //List<Cv> getByestablishmentNameAndPeriode(String esname, Date start, Date end);
    }
