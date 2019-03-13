package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Client;

public interface ClientService {

	List<Client> getAll(String sortby);

    Optional<Client> getById(Long id);

    void deleteById(Long id);

    Client addOne(Client client);
     
    List <Client> getAllBySecteur(String secteur);
    
    List <Client> findAllClientByStatus(String status);
    
    
    
}
