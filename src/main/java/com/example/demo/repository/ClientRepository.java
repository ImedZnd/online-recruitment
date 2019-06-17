package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findClientById(Long id);
	Optional<Client> findClientByName(String name);
	Optional<Client> findClientByMail(String mail);
    List<Client> findClientBySecteur(String secteur);
    List<Client> findAllClientByStatus(String status);
	List<Client> findAll();
	
}
