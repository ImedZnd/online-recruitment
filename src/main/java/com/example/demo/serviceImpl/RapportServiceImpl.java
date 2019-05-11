package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Candidat;
import com.example.demo.model.Offre;
import com.example.demo.model.Rapport;
import com.example.demo.repository.RapportRepository;
import com.example.demo.service.RapportService;

@Service
public class RapportServiceImpl implements RapportService {

	@Autowired
	RapportRepository rapportRepository;
	
	@Override
	public List<Rapport> getAll(String sortby) {
		// TODO Auto-generated method stub
		return rapportRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Rapport> getById(Long id) {
		// TODO Auto-generated method stub
		return rapportRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		rapportRepository.deleteById(id);
	}

	@Override
	public Rapport addOne(Rapport rapport) {
		// TODO Auto-generated method stub
		return rapportRepository.save(rapport);
	}

	@Override
	public List<Rapport> getByOffres(Offre offre) {
		// TODO Auto-generated method stub
		return rapportRepository.findByOffres(offre);
	}

	public List<Rapport> getByCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		return rapportRepository.findByCandidat(candidat);
	}

	@Override
	public List<Rapport> getByRaisonContaining(String raison) {
		// TODO Auto-generated method stub
		return rapportRepository.findByRaisonContaining(raison);
	}

	@Override
	public List<Rapport> getByCreatedAt(Date createdAt) {
		// TODO Auto-generated method stub
		return rapportRepository.findByCreatedAt(createdAt);
	}

	@Override
	public List<Rapport> getByModifiedAt(Date modifiedAt) {
		// TODO Auto-generated method stub
		return rapportRepository.findByModifiedAt(modifiedAt);
	}

	@Override
	public List<Rapport> getByCandidatId(Long canId) {
		// TODO Auto-generated method stub
		return rapportRepository.findByCandidatId(canId);
	}



}
