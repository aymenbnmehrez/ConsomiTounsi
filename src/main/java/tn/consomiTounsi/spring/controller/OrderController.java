package tn.consomiTounsi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.consomiTounsi.spring.entity.Delivery;
import tn.consomiTounsi.spring.entity.Order;
import tn.consomiTounsi.spring.service.IOrderService;


@RestController

public class OrderController {

	@Autowired
	IOrderService iOrderService;

	@GetMapping("/get-all-orders")
	@ResponseBody
	public List<Order> getOrders() {
		List<Order> list = iOrderService.getAllOrders();
		return list;
	}
	@PostMapping("/add-order")
	@ResponseBody
	public Order addOrder(@RequestBody Order o) {
		Order order = iOrderService.addOrder(o);
		return order;
	}
	@DeleteMapping("/remove-order/{order-id}")
	@ResponseBody
	public void removeOrder(@PathVariable("order-id") String id) {
		iOrderService.deleteOrder(id);
	}
	
	@PutMapping("/calcul-amount-orders")
	@ResponseBody
	public void calculAmountOrder(String id) {
		iOrderService.calculAmountOrder(id);
		
	}
	
	 @GetMapping(value = "getOrderByProduct")
	    @ResponseBody
		public List<String> getOrderByProduct(String id) {
			return iOrderService.getAllOrdersByProduct(id);
		}
	 
	 @GetMapping(value = "getOrderByUser")
	    @ResponseBody
		public List<Order> getOrderByUser(String id) {
			return iOrderService.getAllOrdersByUser(id);
		}
	
}
