package tn.consomiTounsi.spring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CommandLinePk implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	private Long product_id;
	private Long cart_id;


	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getCart_id() {
		return cart_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

}
