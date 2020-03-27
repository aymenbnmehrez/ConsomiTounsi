package tn.consomiTounsi.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.Provider;
import tn.consomiTounsi.spring.repository.IProviderRepository;

@Service
public class ProviderService implements IProviderService {
	@Autowired
	IProviderRepository providerRepository;
	private static final Logger l = LogManager.getLogger(IUserService.class);

	@Override
	public List<Provider> retrieveAllProviders() {
		List<Provider> providers = (List<Provider>) providerRepository.findAll();
		for (Provider p : providers) {
			l.info("provider ++++:" + p);
		}
		return providers;
	}

	public Provider addProvider(Provider us) {
		return providerRepository.save(us);
	}

	public void deleteProvider(String id) {
		providerRepository.deleteById(Long.parseLong(id));
	}

	public Provider updateProvider(Provider u) {
		return providerRepository.save(u);
	}

	/*
	 * public User retrieveUser(String id) { return u; }
	 */
}
