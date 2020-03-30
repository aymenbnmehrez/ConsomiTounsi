package tn.consomiTounsi.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.Delivery;
import tn.consomiTounsi.spring.entity.DeliveryMan;
import tn.consomiTounsi.spring.repository.IDeliveryManRepository;
import tn.consomiTounsi.spring.repository.IDeliveryRepository;

@Service
public class DeliveryManService implements IDeliveryManService {
	@Autowired
	IDeliveryManRepository deliveryManRepository;
	@Autowired
	IDeliveryRepository delRepository;
	private static final Logger l = LogManager.getLogger(IDeliveryManService.class);

	public List<DeliveryMan> retrieveAllDMen() {
		List<DeliveryMan> DMen = (List<DeliveryMan>) deliveryManRepository.findAll();
		for (DeliveryMan p : DMen) {
			l.info("deliveryMan ++++:" + p);
		}
		return DMen;
	}

	public DeliveryMan addDeliveryMan(DeliveryMan us) {
		return deliveryManRepository.save(us);
	}

	public void deleteDeliveryMan(String id) {
		deliveryManRepository.deleteById(Long.parseLong(id));
	}

	public DeliveryMan updateDeliveryMan(DeliveryMan u) {
		return deliveryManRepository.save(u);
	}

	public List<Delivery> showListDeliveries() {
		List<Delivery> deliveries = (List<Delivery>) delRepository.findAll();

		for (Delivery delivery : deliveries) {
			l.info("delivery:" + delivery);
		}
		return deliveries;
	}
	/*public List<Delivery> showListDeliveriesByCity() {
		List<Delivery> deliveries = (List<Delivery>) delRepository.findAll();

		for (Delivery delivery : deliveries) {
			l.info("users +++:" + delivery);
		}
		return deliveries;
	}*/
	
}
