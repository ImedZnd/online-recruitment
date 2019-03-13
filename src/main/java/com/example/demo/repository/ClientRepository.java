package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findClientById(Long id);
    List<Client> findClientBySecteur(String secteur);
    List<Client> findAllClientByStatus(String status);
	List<Client> findAll();
}