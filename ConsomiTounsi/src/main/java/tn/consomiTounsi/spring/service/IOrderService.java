package tn.consomiTounsi.spring.service;

import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.Order;

@Service
public interface IOrderService {
	void calculDeliveryPriceOrder(String id);

}
