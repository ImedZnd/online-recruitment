package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cv;
import com.example.demo.model.Experience;
import com.example.demo.repository.ExperienceRepository;
import com.example.demo.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService {

	@Autowired
	ExperienceRepository experienceRepository;
	@Override
	public List<Experience> getAll(String sortby) {
		// TODO Auto-generated method stub
		return experienceRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Experience> getById(Long id) {
		// TODO Auto-generated method stub
		return experienceRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		experienceRepository.deleteById(id);
	}

	@Override
	public Experience addOne(Experience experience) {
		// TODO Auto-generated method stub
		return experienceRepository.save(experience);
	}

	@Override
	public List<Experience> getByCv(Cv cv) {
		// TODO Auto-generated method stub
		return experienceRepository.findByCv(cv);
	}

	@Override
	public List<Experience> getByEstablishmentNameContain(String establishmentName) {
		// TODO Auto-generated method stub
		return experienceRepository.findByEstablishmentName(establishmentName);
	}

	@Override
	public List<Experience> getByStart(Date start) {
		// TODO Auto-generated method stub
		return experienceRepository.findByStart(start);
	}

	@Override
	public List<Experience> getByEnd(Date end) {
		// TODO Auto-generated method stub
		return experienceRepository.findByEnd(end);
	}

	@Override
	public List<Experience> getByCvId(Long cvId) {
		// TODO Auto-generated method stub
		return experienceRepository.findByCvId(cvId);
	}

	//@Override
	//public List<Cv> getByestablishmentNameAndPeriode(String esname, Date start, Date end) {
	//	// TODO Auto-generated method stub
	//	return  experienceRepository.findByestablishmentNameAndPeriode(esname, start, end);
	//}





}
