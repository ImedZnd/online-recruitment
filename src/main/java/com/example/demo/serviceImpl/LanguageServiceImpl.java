package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cv;
import com.example.demo.model.Language;
import com.example.demo.repository.LanguageRepository;
import com.example.demo.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	LanguageRepository languageRepository;
	
	@Override
	public List<Language> getAll(String sort) {
		// TODO Auto-generated method stub
		return languageRepository.findAll(Sort.by(sort));
	}

	@Override
	public Optional<Language> getById(Long id) {
		// TODO Auto-generated method stub
		return languageRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		languageRepository.deleteById(id);
	}

	@Override
	public Language addOne(Language language) {
		// TODO Auto-generated method stub
		return languageRepository.save(language);
	}

	@Override
	public List<Language> getByCv(Cv cv) {
		// TODO Auto-generated method stub
		return languageRepository.findByCv(cv);
	}

	@Override
	public List<Language> getByEstablishmentNameContaining(String establishmentName) {
		// TODO Auto-generated method stub
		return languageRepository.findByEstablishmentNameContaining(establishmentName);
	}

	@Override
	public List<Language> getBylange(String lange) {
		// TODO Auto-generated method stub
		return languageRepository.findBylange(lange);
	}

	@Override
	public List<Language> getBySpeekLevel(String speekLevel) {
		// TODO Auto-generated method stub
		return languageRepository.findBySpeekLevel(speekLevel);
	}

	@Override
	public List<Language> getByWriteLevel(String writeLevel) {
		// TODO Auto-generated method stub
		return languageRepository.findByWriteLevel(writeLevel);
	}

	@Override
	public List<Language> getByReadLevel(String readLevel) {
		// TODO Auto-generated method stub
		return languageRepository.findByReadLevel(readLevel);
	}

}
