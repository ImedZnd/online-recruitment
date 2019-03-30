package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.service.ExperienceService;

public class ExperienceServiceImpl implements ExperienceService {

	@Override
	public List<Experience> getAll(String sortby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Experience> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Experience addOne(Experience experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getByCv(Cv cv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getByEstablishmentNameContain(String establishmentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getBystart(Date start) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getByend(Date end) {
		// TODO Auto-generated method stub
		return null;
	}

}
