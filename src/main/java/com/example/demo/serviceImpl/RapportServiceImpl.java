package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Candidat;
import com.example.demo.model.Offre;
import com.example.demo.model.Rapport;
import com.example.demo.service.RapportService;

public class RapportServiceImpl implements RapportService {

	@Override
	public List<Rapport> getAll(String sortby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Rapport> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Rapport addOne(Rapport Rapport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rapport> getByOffre(Offre offre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rapport> getByCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rapport> getByRaisonContain(String raison) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rapport> getByCreatedAt(Date createdAt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rapport> getByModifiedAt(Date modifiedAt) {
		// TODO Auto-generated method stub
		return null;
	}

}
