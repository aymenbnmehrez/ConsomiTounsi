package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_ORDER")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDER_ID")
	private Long id; // Clé primaire

	@Column(name = "ORDER_AMOUNT")
	private float amount;
	
	@Column(name = "ORDER_DELIVERY_PRICE")
	private float deliveryPrice;
	
	@Column(name = "ORDER_ADRESS")
	private String adress;
	
	@Column(name = "ORDER_PHONE")
	private int phone;
	
	@Column(name = "ORDER_STATUS")
	private String status;
	
	public float getDeliveryPrice() {
		return deliveryPrice;
	}


	public void setDeliveryPrice(float deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}


	@ManyToOne
	Client clients;
	

	@OneToMany(targetEntity = CommandLine.class, mappedBy = "order", fetch = FetchType.EAGER)
	private List<CommandLine> commandLines;
	
	@ManyToOne
	Delivery deliveries;

	@OneToMany(cascade = CascadeType.ALL,mappedBy="orders")
	private Set<OrderClaim> orderClaims;

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Client getClients() {
		return clients;
	}


	public void setClients(Client clients) {
		this.clients = clients;
	}


	public List<CommandLine> getCommandLines() {
		return commandLines;
	}


	public void setCommandLines(List<CommandLine> commandLines) {
		this.commandLines = commandLines;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}



	public Delivery getDeliveries() {
		return deliveries;
	}


	public void setDeliveries(Delivery deliveries) {
		this.deliveries = deliveries;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Set<OrderClaim> getOrderClaims() {
		return orderClaims;
	}


	public void setOrderClaims(Set<OrderClaim> orderClaims) {
		this.orderClaims = orderClaims;
	}
	
	
}
