package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

@DiscriminatorValue(value="DELMAN")
public class DeliveryMan extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="PRIME")
	private int prime;
	@Column(name="SALARY")
	private int salaire;
	@Temporal(TemporalType.DATE)
	@Column(name="HIREDATE")
	private Date hireDate;
	public DeliveryMan(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr) {
		super(username, password, firstName, lastName, email, image, phoneNbr);
		// TODO Auto-generated constructor stub
	}


	public DeliveryMan(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr, Set<Delivery> deliveries) {
		super(username, password, firstName, lastName, email, image, phoneNbr);
		this.deliveries = deliveries;
	}




	
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


	public DeliveryMan() {
		super();
	}
	
	
}
