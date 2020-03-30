package tn.consomiTounsi.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.Provider;
@Service
public interface IProviderService {

	List<Provider> retrieveAllProviders();

	public Provider addProvider(Provider us);

	public void deleteProvider(String id);

	public Provider updateProvider(Provider u);
}
