package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Competence;
import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.model.Formation;
import com.example.demo.model.Language;
import com.example.demo.repository.CvRepository;
import com.example.demo.service.CvService;
import com.example.demo.status.StatusCv;

public class CvServiceImpl implements CvService {

	@Autowired
	CvRepository cvRepository;
	
	@Override
	public List<Cv> getAll(String sortby) {
		// TODO Auto-generated method stub
		return cvRepository.findAll();
	}

	@Override
	public Optional<Cv> getById(Long id) {
		// TODO Auto-generated method stub
		return cvRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		cvRepository.deleteById(id);
	}

	@Override
	public Cv addOne(Cv cv) {
		// TODO Auto-generated method stub
		return cvRepository.save(cv);
	}

	@Override
	public List<Cv> getByName(String name) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByName(name);
	}

	@Override
	public List<Cv> getByStatus(StatusCv status) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByStatus(status);
	}

	@Override
	public List<Cv> getBySurename(String surename) {
		// TODO Auto-generated method stub
		return cvRepository.findCvBySurename(surename);
	}

	@Override
	public List<Cv> getBySexe(String sexe) {
		// TODO Auto-generated method stub
		return cvRepository.findCvBySexe(sexe);
	}

	@Override
	public List<Cv> getByEtatCivle(String etatCivle) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByEtatCivle(etatCivle);
	}

	@Override
	public List<Cv> getByEtatActuel(String etatActuel) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByEtatActuel(etatActuel);
	}

	@Override
	public List<Cv> getByMonthOfExp(String monthOfExp) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByMonthOfExp(monthOfExp);
	}

	@Override
	public List<Cv> getByPays(String pays) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByPays(pays);
	}

	@Override
	public List<Cv> getByGouvernement(String gouvernement) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByGouvernement(gouvernement);
	}

	@Override
	public List<Cv> getByVille(String ville) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByVille(ville);
	}

	@Override
	public List<Cv> getByCodePostale(String codePostale) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByCodePostale(codePostale);
	}

	@Override
	public List<Cv> getByFirstTel(Long firstTel) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByFirstTel(firstTel);
	}

	@Override
	public List<Cv> getBySecondTel(Long secondTel) {
		// TODO Auto-generated method stub
		return cvRepository.findCvBySecondTel(secondTel);
	}

	@Override
	public List<Cv> getByFirstMail(String firstMail) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByFirstMail(firstMail);
	}

	@Override
	public List<Cv> getBySecondMail(String secondMail) {
		// TODO Auto-generated method stub
		return cvRepository.findCvBySecondMail(secondMail);
	}

	@Override
	public List<Cv> getByLastContact(Date lastContact) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByLastContact(lastContact);
	}

	@Override
	public List<Cv> getByDispo(boolean dispo) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByDispo(dispo);
	}

	@Override
	public List<Cv> getByWaiting(boolean waiting) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByWaiting(waiting);
	}

	@Override
	public List<Cv> getByModifiedAt(Date modifiedAt) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByModifiedAt(modifiedAt);
	}

	@Override
	public List<Cv> getByFormation(Formation formation) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByFormation(formation);
	}

	@Override
	public List<Cv> getByCompetence(Competence competence) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByCompetence(competence);
	}

	@Override
	public List<Cv> getByExperience(Experience experience) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByExperience(experience);
	}

	@Override
	public List<Cv> getByLanguage(Language language) {
		// TODO Auto-generated method stub
		return cvRepository.findCvByLanguage(language);
	}

}
