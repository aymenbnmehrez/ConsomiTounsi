package tn.consomiTounsi.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.Address;
@Repository
public interface IAddressRepository extends CrudRepository<Address, Long>{

}
