package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Client;
import com.example.demo.model.Favorite;
import com.example.demo.model.Location;
import com.example.demo.model.Offre;
import com.example.demo.model.Postulation;
import com.example.demo.model.Rapport;
import com.example.demo.repository.OffreRepository;
import com.example.demo.service.OffreService;
import com.example.demo.status.StatusOffre;

@Service
public class OffreServiceImpl implements OffreService {

	@Autowired
	OffreRepository offreRepository;
	
	@Override
	public List<Offre> getAll(String title) {
		// TODO Auto-generated method stub
		return offreRepository.findAll(Sort.by(title));
	}

	@Override
	public Optional<Offre> getById(Long id) {
		// TODO Auto-generated method stub
		return offreRepository.findById((long) id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		offreRepository.deleteById(id);
	}

	@Override
	public Offre addOne(Offre offre) {
		return offreRepository.save(offre);
	}

	@Override
	public Optional<Offre> getByTitle(String title) {
		// TODO Auto-generated method stub
		return offreRepository.findByTitle(title);
	}

	@Override
	public Optional<Offre> getByType(String type) {
		// TODO Auto-generated method stub
		return offreRepository.findByType(type);
	}

	@Override
	public Optional<Offre> getByStatusOffre(StatusOffre statusOffre) {
		// TODO Auto-generated method stub
		return offreRepository.findByStatusOffre(statusOffre);
	}

	@Override
	public Optional<Offre> getBySalary(Long salary) {
		// TODO Auto-generated method stub
		return offreRepository.findBySalary(salary);
	}

	@Override
	public Optional<Offre> getByDateLimit(Date dateLimit) {
		// TODO Auto-generated method stub
		return offreRepository.findByDateLimit(dateLimit);
	}

	@Override
	public Optional<Offre> getByCreator(Client creator) {
		// TODO Auto-generated method stub
		return null; //offreRepository.findByCreator(creator);
	}

	@Override
	public Optional<Offre> getByCreatedAt(Date createdAt) {
		// TODO Auto-generated method stub
		return offreRepository.findByCreatedAt(createdAt);
	}

	@Override
	public Optional<Offre> getByExperience(Long experience) {
		// TODO Auto-generated method stub
		return offreRepository.findByExperience(experience);
	}

	@Override
	public Optional<Offre> getByTitleContaining(String title) {
		// TODO Auto-generated method stub
		return offreRepository.findByTitleContaining(title);
	}

	@Override
	public Optional<Offre> getByDescriptionContaining(String discrip) {
		// TODO Auto-generated method stub
		return offreRepository.findByDescriptionContaining(discrip);
	}

	@Override
	public Optional<Offre> getByDetailsContaining(String detail) {
		// TODO Auto-generated method stub
		return offreRepository.findByDetailsContaining(detail);
	}

	@Override
	public Optional<Offre> getByFavorite(Favorite favorite) {
		// TODO Auto-generated method stub
		return offreRepository.findByFavorite(favorite);
	}

	@Override
	public Optional<Offre> getByRapport(Rapport rapport) {
		// TODO Auto-generated method stub
		return offreRepository.findByRapport(rapport);
	}

	@Override
	public Optional<Offre> getByPostulation(Postulation postulation) {
		// TODO Auto-generated method stub
		return offreRepository.findByPostulation(postulation);
	}

	@Override
	public Optional<Offre> getByClient(Client client) {
		// TODO Auto-generated method stub
		return offreRepository.findByClient(client);
	}

	@Override
	public Optional<Offre> getByCategory(Category category) {
		// TODO Auto-generated method stub
		return offreRepository.findByCategory(category);
	}

	@Override
	public Optional<Offre> getByLocation(Location location) {
		// TODO Auto-generated method stub
		return offreRepository.findByLocation(location);
	}

}
