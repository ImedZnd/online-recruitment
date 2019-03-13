package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;

public class ClientServiceImp  implements ClientService
{

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public List<Client> getAll(String sortby) {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Optional<Client> getById(Long id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
	}

	@Override
	public Client addOne(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}


	@Override
	public List<Client> getAllBySecteur(String secteur) {
		// TODO Auto-generated method stub
		return clientRepository.findClientBySecteur(secteur);
	}

	@Override
	public List <Client> findAllClientByStatus(String status) {
		// TODO Auto-generated method stub
		return clientRepository.findAllClientByStatus(status);
	}

}