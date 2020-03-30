package tn.consomiTounsi.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.consomiTounsi.spring.entity.CommandLine;
import tn.consomiTounsi.spring.entity.CommandLinePk;
import tn.consomiTounsi.spring.entity.Order;


@Repository
public interface IOrderRepository extends CrudRepository<Order, Long >{

}
