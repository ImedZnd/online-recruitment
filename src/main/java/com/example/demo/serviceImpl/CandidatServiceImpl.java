package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Candidat;
import com.example.demo.repository.CandidatRepository;
import com.example.demo.service.CandidatService;

@Service
public class CandidatServiceImpl implements CandidatService {

	@Autowired
	CandidatRepository candidatRepository;
	
	@Override
	public List<Candidat> getAll(String sortby) {
		// TODO Auto-generated method stub
		return candidatRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Candidat> getById(Long id) {
		// TODO Auto-generated method stub
		return candidatRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		candidatRepository.deleteById(id);
	}

	@Override
	public Candidat addOne(Candidat Candidat) {
		// TODO Auto-generated method stub
		return candidatRepository.save(Candidat);
	}

	@Override
	public List<Candidat> getByName(String name) {
		// TODO Auto-generated method stub
		return candidatRepository.findCandidatByName(name);
	}

	@Override
	public List<Candidat> getBySexe(String sexe) {
		// TODO Auto-generated method stub
		return candidatRepository.findCandidatBySexe(sexe);
	}

	@Override
	public List<Candidat> getBySurename(String surename) {
		// TODO Auto-generated method stub
		return candidatRepository.findCandidatBySurename(surename);
	}

}
