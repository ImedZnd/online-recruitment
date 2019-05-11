package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Competence;
import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.model.Formation;
import com.example.demo.model.Language;
import com.example.demo.status.StatusCv;

public interface CvService {
	
	List<Cv> getAll(String sortby);

    Optional<Cv> getById(int id);

    void deleteById(Long id);

    Cv addOne(Cv cv);

    List<Cv> getByName(String name);
   
    List<Cv> getByStatus(StatusCv statu);
    
    List<Cv> getBySurename(String surename);
    
    List<Cv> getBySexe(String sexe);
    
    List<Cv> getByEtatCivle(String etatCivle);
    
    List<Cv> getByEtatActuel(String etatActuel);

    List<Cv> getByMonthOfExp(String monthOfExp);
    
    List<Cv> getByPays(String pays);
    
    List<Cv> getByGouvernement(String gouvernement);
    
    List<Cv> getByVille(String ville);
    
    List<Cv> getByCodePostale(String codePostale);
    
    List<Cv> getByFirstTel(Long firstTel);
    
    List<Cv> getBySecondTel(Long SecondTel);
    
    List<Cv> getByFirstMail(String firstMail);
    
    List<Cv> getBySecondMail(String secondMail);
    
    List<Cv> getByLastContact(Date lastContact);
    
    List<Cv> getByDispo(boolean dispo);
    
    List<Cv> getByWaiting(boolean waiting);
    
    List<Cv> getByModifiedAt(Date modifiedAt);
    
    List<Cv> getByFormation(Formation formation);
    
    List<Cv> getByCompetence(Competence competence);
    
    List<Cv> getByExperience(Experience experience);
    
    List<Cv> getByLanguage(Language language);

	Cv getByCandidat(Candidat can);

	Cv getByCandidatId(Long canId);

	List<Cv> getCvByFormationId(Long formationId);

	List<Cv> getByCompetenceId(Long competenceId);

	List<Cv> getByExperienceId(Long experienceId);

	List<Cv> getByLanguageId(Long languageId);
}
