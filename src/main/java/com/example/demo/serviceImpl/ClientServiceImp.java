package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;

@Service
public class ClientServiceImp  implements ClientService
{

	@Autowired
	ClientRepository clientRepository;
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Override
	public List<Client> getAll(String sortby) {
		// TODO Auto-generated method stub
		return clientRepository.findAll(Sort.by(sortby));
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
		client.setPassword(passwordEncoder.encode(client.getPassword()));
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

	@Override
	public Optional<Client> getByName(String name) {
		// TODO Auto-generated method stub
		return clientRepository.findClientByName(name);
	}

	@Override
	public Optional<Client> getByMail(String mail) {
		// TODO Auto-generated method stub
		return clientRepository.findClientByMail(mail);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
