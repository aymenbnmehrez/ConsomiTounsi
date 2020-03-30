package tn.consomiTounsi.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.Client;

@Repository
public interface IClientRepository extends CrudRepository<Client, Long>{

}
