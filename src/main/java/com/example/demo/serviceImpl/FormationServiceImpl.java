package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cv;
import com.example.demo.model.Formation;
import com.example.demo.service.FormationService;

public class FormationServiceImpl implements FormationService {

	@Override
	public List<Formation> getAll(String sortby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Formation> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Formation addOne(Formation experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> getByGrade(Date grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> getByEstablishmentNameContain(String establishmentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> getByCreatedAt(Date createdAt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> getByCv(Cv cv) {
		// TODO Auto-generated method stub
		return null;
	}

}
