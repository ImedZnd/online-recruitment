package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Candidat;
import com.example.demo.model.Favorite;
import com.example.demo.model.Offre;
import com.example.demo.repository.FavoriteRepository;
import com.example.demo.service.FavoriteService;

@Service
public class FavoriteServiceImpl implements FavoriteService {

	@Autowired
	FavoriteRepository favoriteRepository;
	
	@Override
	public List<Favorite> getAll(String sortby) {
		// TODO Auto-generated method stub
		return favoriteRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Favorite> getById(Long id) {
		// TODO Auto-generated method stub
		return favoriteRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		favoriteRepository.deleteById(id);
	}

	@Override
	public Favorite addOne(Favorite favorite) {
		// TODO Auto-generated method stub
		return favoriteRepository.save(favorite);
	}

	@Override
	public List<Favorite> getByOffres(Offre offre) {
		// TODO Auto-generated method stub
		return favoriteRepository.findByOffres(offre);
	}

	@Override
	public List<Favorite> getByCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		return favoriteRepository.findByCandidat(candidat);
	}

	@Override
	public List<Favorite> getByCandidatId(Long canId) {
		// TODO Auto-generated method stub
		return favoriteRepository.findByCandidatId(canId);
	}

}
