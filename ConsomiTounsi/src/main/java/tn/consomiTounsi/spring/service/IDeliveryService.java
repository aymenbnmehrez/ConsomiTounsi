package tn.consomiTounsi.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.Delivery;


@Service

public interface IDeliveryService {
	List<Delivery> getAllDeliveries();

	Delivery addDelivery(Delivery d);

	void deleteDelivery(String id);

	//Delivery updateDelivery(Delivery u);

	Delivery getDelivery(String id);
}
