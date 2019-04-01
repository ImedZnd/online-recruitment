package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Location;
import com.example.demo.model.Offre;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository  locationRepository;
	@Override
	public List<Location> getAll(String sortby) {
		// TODO Auto-generated method stub
		return locationRepository.findAll(Sort.by(sortby));
	}

	@Override
	public Optional<Location> getById(Long id) {
		// TODO Auto-generated method stub
		return locationRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		locationRepository.deleteById(id);
	}

	@Override
	public Location addOne(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Override
	public List<Location> getByOffres(Offre offre) {
		// TODO Auto-generated method stub
		return locationRepository.findByOffres(offre);
	}

	@Override
	public List<Location> getByDiscription(String discription) {
		// TODO Auto-generated method stub
		return locationRepository.findByDiscription(discription);
	}

	@Override
	public List<Location> getByNumber(int number) {
		// TODO Auto-generated method stub
		return locationRepository.findByNumber(number);
	}

}
