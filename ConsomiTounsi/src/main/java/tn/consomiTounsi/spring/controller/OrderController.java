package tn.consomiTounsi.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.consomiTounsi.spring.service.IOrderService;

@RestController
public class OrderController {
	
	@Autowired
	IOrderService iOrderService;
	
	@PutMapping("/calcul-delivery-price")
	@ResponseBody
	public void calculDeliveryPrice(String id) {
		iOrderService.calculDeliveryPriceOrder(id);
		//iUserRepository.save(userToUpdate)
	}
}
