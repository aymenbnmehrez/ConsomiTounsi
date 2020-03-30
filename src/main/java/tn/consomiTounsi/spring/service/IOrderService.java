package tn.consomiTounsi.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.CommandLinePk;
import tn.consomiTounsi.spring.entity.Order;


@Service

public interface IOrderService {
	List<Order> getAllOrders();
	Order addOrder(Order o);
	void deleteOrder(String id);
	void calculAmountOrder(String id);
	List<String> getAllOrdersByProduct(String id);
	List<Order> getAllOrdersByUser(String id);


	
}
