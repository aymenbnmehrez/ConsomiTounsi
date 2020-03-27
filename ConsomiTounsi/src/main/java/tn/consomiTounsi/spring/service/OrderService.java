package tn.consomiTounsi.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.CommandLine;
import tn.consomiTounsi.spring.entity.Order;
import tn.consomiTounsi.spring.entity.Product;
import tn.consomiTounsi.spring.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService {

	private static final Logger L = LogManager.getLogger(OrderService.class);

	@Autowired
	IOrderRepository iOrderRepository;

	@Override
	public void calculDeliveryPriceOrder(String id) {
		Order orderToCaculateDeliveryPrice = iOrderRepository.findById(Long.parseLong(id)).get();
		List<CommandLine> commandLineList = orderToCaculateDeliveryPrice.getCommandLines();
		float weightCommandLine = 0;
		float deliveryPrice=5;
		for (int i = 0; i < commandLineList.size(); i++) {
			int commandLineQuantity = 0;
			commandLineQuantity = commandLineList.get(i).getQuantity();
			L.info(commandLineQuantity);
			weightCommandLine += commandLineQuantity * (commandLineList.get(i).getProduct().getWeight());
			// L.info("weghit comm"+weightCommandLine);

		}
		L.info("weight commande " + weightCommandLine);
		
		if(weightCommandLine>3){
			deliveryPrice += (weightCommandLine-3)*0.500;
			
		}
		
		L.info("delivery price " + deliveryPrice +" Dt");
		
		orderToCaculateDeliveryPrice.setDeliveryPrice(deliveryPrice);
		iOrderRepository.save(orderToCaculateDeliveryPrice);
	}
}
