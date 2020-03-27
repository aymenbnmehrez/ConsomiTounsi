package tn.consomiTounsi.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.Client;
import tn.consomiTounsi.spring.repository.IClientRepository;
@Service
public class ClientService implements IClientService {
	@Autowired
	IClientRepository clientRepository;
	private static final Logger l = LogManager.getLogger(IClientService.class);

	
	public List<Client> retrieveAllClients() {
		List<Client> clients = (List<Client>) clientRepository.findAll();
		for (Client p : clients) {
			l.info("client ++++:" + p);
		}
		return clients;
	}
	public Client addClient(Client us) {
		return clientRepository.save(us);
	}

	public void deleteClient(String id) {
		clientRepository.deleteById(Long.parseLong(id));
	}

	public Client updateClient(Client u) {
		return clientRepository.save(u);
	}
}
