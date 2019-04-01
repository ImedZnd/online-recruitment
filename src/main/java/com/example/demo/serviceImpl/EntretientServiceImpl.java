package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Candidat;
import com.example.demo.model.Entretient;
import com.example.demo.repository.EntretientRepository;
import com.example.demo.service.EntretientService;

@Service
public class EntretientServiceImpl implements EntretientService {

	@Autowired
	EntretientRepository entretientRepository;
	
	@Override
	public List<Entretient> getAll(String sortby) {
		// TODO Auto-generated method stub
		return entretientRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Entretient> getById(Long id) {
		// TODO Auto-generated method stub
		return entretientRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		entretientRepository.deleteById(id);
	}

	@Override
	public Entretient addOne(Entretient entretient) {
		// TODO Auto-generated method stub
		return entretientRepository.save(entretient);
	}

	@Override
	public List<Entretient> getByType(String type) {
		// TODO Auto-generated method stub
		return entretientRepository.findEntretientByType(type);
	}

	@Override
	public List<Entretient> getByCompteRenduContain(String compteRendu) {
		// TODO Auto-generated method stub
		return entretientRepository.findByCompteRenduContaining(compteRendu);
	}

	@Override
	public List<Entretient> getByCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		return entretientRepository.findEntretientByCandidat(candidat);
	}

	@Override
	public List<Entretient> getByCreatedAt(Date createdAt) {
		// TODO Auto-generated method stub
		return entretientRepository.findEntretientByCreatedAt(createdAt);
	}

	@Override
	public List<Entretient> getByModifiedAt(Date modifiedAt) {
		// TODO Auto-generated method stub
		return entretientRepository.findEntretientByModifiedAt(modifiedAt);
	}

}
