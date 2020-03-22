package tn.consomiTounsi.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.DeliveryMan;
@Repository
public interface IDeliveryManRepository extends CrudRepository<DeliveryMan, Long>{

}
