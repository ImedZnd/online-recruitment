package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Picture;
import com.example.demo.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService {

	@Override
	public List<Picture> getAll(String sortby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Picture> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Picture addOne(Picture location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Picture> getByFileName(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
