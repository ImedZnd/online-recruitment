package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;
import com.example.demo.service.PostulationService;

public class PostulationServiceImpl implements PostulationService {

	@Override
	public List<Postulation> getAll(String sortby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Postulation> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Postulation addOne(Postulation location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Postulation> getByOffres(Offre offres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Postulation> getByCandidats(Candidat candidats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Postulation> getByModifiedAt(Date modifiedAt) {
		// TODO Auto-generated method stub
		return null;
	}

}
