package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Responsable;
import com.example.demo.repository.ResponsableRepository;
import com.example.demo.service.ResponsableService;

@Service
public class ResponsableServiceImp implements ResponsableService {

	@Autowired
	ResponsableRepository responsableRepository;
	@Autowired
    private PasswordEncoder passwordEncoder;
	@Override
	public List<Responsable> getAll(String sortby) {
		// TODO Auto-generated method stub
		return responsableRepository.findAll();
	}

	@Override
	public Optional<Responsable> getById(Long id) {
		// TODO Auto-generated method stub
		return responsableRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		responsableRepository.deleteById(id);
	}

	@Override
	public Responsable addOne(Responsable responsable) {
		// TODO Auto-generated method stub
		responsable.setPassword(passwordEncoder.encode(responsable.getPassword()));
		return responsableRepository.save(responsable);
	}

	@Override
	public List<Responsable> getByRole(Enum role) {
		// TODO Auto-generated method stub
		return responsableRepository.findResponsableByRole(role);
	}

	@Override
	public List<Responsable> getByStatus(String status) {
		// TODO Auto-generated method stub
		return responsableRepository.findResponsableByStatus(status);
	}

	@Override
	public List<Responsable> getByName(String name) {
		// TODO Auto-generated method stub
		return responsableRepository.findResponsableByName(name);
	}

	@Override
	public List<Responsable> getBySurename(String surename) {
		// TODO Auto-generated method stub
		return responsableRepository.findResponsableBySurename(surename);
	}





}
