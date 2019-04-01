package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cv;
import com.example.demo.model.Formation;
import com.example.demo.repository.FormationRepository;
import com.example.demo.service.FormationService;

@Service
public class FormationServiceImpl implements FormationService {
	
	@Autowired
	FormationRepository formationRepository;
	
	@Override
	public List<Formation> getAll(String sortby) {
		// TODO Auto-generated method stub
		return formationRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Formation> getById(Long id) {
		// TODO Auto-generated method stub
		return formationRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		formationRepository.deleteById(id);
	}

	@Override
	public Formation addOne(Formation formation) {
		// TODO Auto-generated method stub
		return formationRepository.save(formation);
	}

	@Override
	public List<Formation> getByGrade(Date grade) {
		// TODO Auto-generated method stub
		return formationRepository.findByGrade(grade);
	}

	@Override
	public List<Formation> getByEstablishmentNameContain(String establishmentName) {
		// TODO Auto-generated method stub
		return formationRepository.findByEstablishmentNameContaining(establishmentName);
	}

	@Override
	public List<Formation> getByCreatedAt(Date createdAt) {
		// TODO Auto-generated method stub
		return formationRepository.findByCreatedAt(createdAt);
	}

	@Override
	public List<Formation> getByCv(Cv cv) {
		// TODO Auto-generated method stub
		return formationRepository.findByCv(cv);
	}

}
