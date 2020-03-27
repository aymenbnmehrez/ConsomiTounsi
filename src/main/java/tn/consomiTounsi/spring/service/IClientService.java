package tn.consomiTounsi.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.Client;

@Service
public interface IClientService {
	public List<Client> retrieveAllClients();

	public Client addClient(Client us);

	public void deleteClient(String id);

	public Client updateClient(Client u);
}
