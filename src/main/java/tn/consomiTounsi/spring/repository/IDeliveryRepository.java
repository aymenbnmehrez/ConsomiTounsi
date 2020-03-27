package tn.consomiTounsi.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.Delivery;


@Repository
public interface IDeliveryRepository extends CrudRepository<Delivery, Long>{

}
