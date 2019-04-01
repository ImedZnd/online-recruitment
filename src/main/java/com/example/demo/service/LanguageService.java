package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cv;
import com.example.demo.model.Language;

public interface LanguageService {

	List<Language> getAll(String sortby);

    Optional<Language> getById(Long id);

    void deleteById(Long id);

    Language addOne(Language experience);

    List<Language> getByCv(Cv cv);
   
    List<Language> getByEstablishmentNameContaining(String establishmentName);

    List<Language> getBylange(String lange);
        
    List<Language> getBySpeekLevel(String speekLevel);
    
    List<Language> getByWriteLevel(String writeLevel);
    
    List<Language> getByReadLevel(String readLevel);
}
