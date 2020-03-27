package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity

@DiscriminatorValue(value = "CLIENT")
public class Client extends User implements Serializable {


	private static final long serialVersionUID = 1L;

	// @ManyToMany(cascade = CascadeType.ALL)

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clients")
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

	public Client(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr) {
		super(username, password, firstName, lastName, email, image, phoneNbr);
	}

	public Client(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr,  Set<Order> orders) {
		super(username, password, firstName, lastName, email, image, phoneNbr);
		this.orders = orders;
	}

	public Client() {
		super();
	}

}
