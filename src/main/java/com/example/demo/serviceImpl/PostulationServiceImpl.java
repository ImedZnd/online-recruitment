package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Candidat;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;
import com.example.demo.repository.PostulationRepository;
import com.example.demo.service.PostulationService;

@Service
public class PostulationServiceImpl implements PostulationService {

	
	@Autowired
	PostulationRepository postulationRepository;
	
	@Override
	public List<Postulation> getAll(String sortby) {
		// TODO Auto-generated method stub
		return postulationRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Postulation> getById(Long id) {
		// TODO Auto-generated method stub
		return postulationRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		postulationRepository.deleteById(id);
	}

	@Override
	public Postulation addOne(Postulation location) {
		// TODO Auto-generated method stub
		return postulationRepository.save(location);
	}

	@Override
	public List<Postulation> getByOffres(Offre offres) {
		// TODO Auto-generated method stub
		return postulationRepository.findByOffres(offres);
	}

	@Override
	public List<Postulation> getByCandidats(Candidat candidats) {
		// TODO Auto-generated method stub
		return postulationRepository.findByCandidats(candidats);
	}

	@Override
	public List<Postulation> getByModifiedAt(Date modifiedAt) {
		// TODO Auto-generated method stub
		return postulationRepository.findByModifiedAt(modifiedAt);
	}

}
