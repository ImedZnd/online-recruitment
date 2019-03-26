package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Client;

public interface ClientService {

	List<Client> getAll(String sortby);

    Optional<Client> getById(Long id);
    
    Optional<Client> getByName(String name);

    void deleteById(Long id);

    Client addOne(Client client);
     
    List <Client> getAllBySecteur(String secteur);
    
    List <Client> findAllClientByStatus(String status);
    
    
    
}
