package tn.consomiTounsi.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.consomiTounsi.spring.entity.DeliveryMan;
@Service
public interface IDeliveryManService {
	public List<DeliveryMan> retrieveAllDMen();
	public DeliveryMan addDeliveryMan(DeliveryMan us);

	public void deleteDeliveryMan(String id);

	public DeliveryMan updateDeliveryMan(DeliveryMan u);
}
