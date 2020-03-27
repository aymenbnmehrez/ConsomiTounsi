package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_COMMAND_LINE")
public class CommandLine implements Serializable {

	private static final long serialVersionUID = 1L;

	private CommandLinePk commandLinePk;
	private Order order;
	private Product product;


	@EmbeddedId
	public CommandLinePk getCommandLinePk() {
		return commandLinePk;
	}

	@Column(name = "COMMAND_LINE_QUANTITY")
	private int quantity ;
	
	@Column(name = "COMMAND_LINE_AMOUNT")
	private float amount;
	
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@ManyToOne()
	@JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne()
	@JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}	

	public Date getAddedDate() {
		return addedDate;
	}


	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCommandLinePk(CommandLinePk commandLinePk) {
		this.commandLinePk = commandLinePk;
	}

	public CommandLine() {
		setAddedDate(new Date());
	}

	@Override
	public String toString() {
		return "CommandLine [commandLinePk=" + commandLinePk + ", order=" + order + ", product=" + product
				+ ", quantity=" + quantity + ", amount=" + amount + ", addedDate=" + addedDate + "]";
	}
	
	

}
