package tn.consomiTounsi.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.Delivery;
import tn.consomiTounsi.spring.entity.DeliveryMan;

@Repository
public interface IDeliveryManRepository extends CrudRepository<DeliveryMan, Long>{

}
