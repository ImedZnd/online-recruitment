package com.example.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Competence;
import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.model.Formation;
import com.example.demo.model.Language;
import com.example.demo.status.StatusCv;

@Repository
public interface CvRepository extends JpaRepository<Cv, Long> {
	Optional<Cv> findById(int id);
	List<Cv> findCvByName(String name);
	List<Cv> findCvByStatus(StatusCv status);
	List<Cv> findCvBySurename(String surename);
	List<Cv> findCvBySexe(String sexe);
	List<Cv> findCvByEtatCivle(String etatCivle);
	List<Cv> findCvByEtatActuel(String etatActuel);
	List<Cv> findCvByMonthOfExp(String monthOfExp);
	List<Cv> findCvByPays(String pays);
	List<Cv> findCvByGouvernement(String gouvernement);
	List<Cv> findCvByVille(String ville);
	List<Cv> findCvByCodePostale(String codePostale);
	List<Cv> findCvByFirstTel(Long firstTel);
	List<Cv> findCvBySecondTel(Long secondTel);
	List<Cv> findCvByFirstMail(String firstMail);
	List<Cv> findCvBySecondMail(String secondMail);
	List<Cv> findCvByLastContact(Date lastContact);
	List<Cv> findCvByDispo(boolean dispo);
	List<Cv> findCvByWaiting(boolean waiting);
	List<Cv> findCvByModifiedAt(Date modifiedAt);
	List<Cv> findCvByFormation(Formation formation);
	List<Cv> findCvByCompetence(Competence competence);
	List<Cv> findCvByExperience(Experience experience);
	List<Cv> findCvByLanguage(Language language);
	
}
