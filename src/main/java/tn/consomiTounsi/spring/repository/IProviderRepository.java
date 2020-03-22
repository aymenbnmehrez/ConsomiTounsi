package tn.consomiTounsi.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.Provider;
@Repository
public interface IProviderRepository extends CrudRepository<Provider, Long>{

}
