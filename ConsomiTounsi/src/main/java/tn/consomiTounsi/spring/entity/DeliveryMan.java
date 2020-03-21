package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity

public class DeliveryMan extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="deliveryMans")
	private Set<Delivery> deliveries;


	public Set<Delivery> getDeliveries() {
		return deliveries;
	}


	public void setDeliveries(Set<Delivery> deliveries) {
		this.deliveries = deliveries;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
