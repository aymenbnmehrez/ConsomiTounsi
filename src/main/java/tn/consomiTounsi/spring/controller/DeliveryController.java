package tn.consomiTounsi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.consomiTounsi.spring.entity.Delivery;
import tn.consomiTounsi.spring.service.IDeliveryService;


@RestController

public class DeliveryController {

	@Autowired
	IDeliveryService iDeliveryService;

	@GetMapping("/get-all-deliveries")
	@ResponseBody
	public List<Delivery> getDeliveries() {
		List<Delivery> list = iDeliveryService.getAllDeliveries();
		return list;
	}

	@GetMapping("/get-delivery/{delivery-id}")
	@ResponseBody
	public Delivery getDelivery(@PathVariable("delivery-id") String id) {
		return iDeliveryService.getDelivery(id);
	}

	@PostMapping("/add-delivery")
	@ResponseBody
	public Delivery addDelivery(@RequestBody Delivery d) {
		Delivery delivery = iDeliveryService.addDelivery(d);
		return delivery;
	}

	@DeleteMapping("/remove-delivery/{delivery-id}")
	@ResponseBody
	public void removeDeliveryr(@PathVariable("delivery-id") String id) {
		iDeliveryService.deleteDelivery(id);
	}
}
