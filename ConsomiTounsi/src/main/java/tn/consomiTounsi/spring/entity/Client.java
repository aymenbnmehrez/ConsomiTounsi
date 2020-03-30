package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Client extends User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	//@ManyToMany(cascade = CascadeType.ALL)


	@OneToMany(cascade = CascadeType.ALL,mappedBy="clients")
	private Set<Order> orders;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	
	
}
