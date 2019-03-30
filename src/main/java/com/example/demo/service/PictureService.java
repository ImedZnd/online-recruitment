package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Picture;

public interface PictureService {

	List<Picture> getAll(String sortby);

    Optional<Picture> getById(Long id);

    void deleteById(Long id);

    Picture addOne(Picture location);

    List<Picture> getByFileName(String fileName);

}
