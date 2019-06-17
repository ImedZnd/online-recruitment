package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Candidat;
import com.example.demo.repository.CandidatRepository;
import com.example.demo.service.CandidatService;

@Service
public class CandidatServiceImpl implements CandidatService {

	@Autowired
	CandidatRepository candidatRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public List<Candidat> getAll(String sortby) {
		// TODO Auto-generated method stub
		return candidatRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Candidat> getById(Long id) {
		// TODO Auto-generated method stub
		return candidatRepository.findById( id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		candidatRepository.deleteById(id);
	}

	@Override
	public Candidat addOne(Candidat candidat) {
		// TODO Auto-generated method stub
		candidat.setPassword(passwordEncoder.encode(candidat.getPassword()));
		return candidatRepository.save(candidat);
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

	@Override
	public List<Candidat> getAllCandidat() {
		// TODO Auto-generated method stub
		return candidatRepository.findAll();
	}

	@Override
	public Candidat getByMail(String mail) {
		// TODO Auto-generated method stub
		return candidatRepository.findByMail(mail);
	}

}
