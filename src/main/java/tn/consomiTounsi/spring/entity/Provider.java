package tn.consomiTounsi.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@DiscriminatorValue(value="PROVIDER")
public class Provider extends User implements Serializable {

	public Provider(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr) {
		super(username, password, firstName, lastName, email, image, phoneNbr);
		// TODO Auto-generated constructor stub
	}
	
	public Provider() {
		super();
	}
	

	public Provider(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr, String marque, String fax) {
		super(username, password, firstName, lastName, email, image, phoneNbr);
		this.marque = marque;
		this.fax = fax;
	}


	private static final long serialVersionUID = 1L;
	@Column(name = "MARQUE")
	private String marque;
	@Column(name = "FAX",nullable=true)
	private String fax;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*
	@Override
	public String toString() {
		return "Formation ["+", marque=" + marque + ", fax=" + fax + "]";
	}*/
	/*@Override
	public String toString() {
		return "Provider [marque=" + marque + ", fax=" + fax + ", getId()=" + getId() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + ", getImage()=" + getImage()
				+ ", getPhoneNbr()=" + getPhoneNbr() + ", toString()=" + super.toString() + ", getPosts()=" + getPosts()
				+ ", getComments()=" + getComments() + ", getAuthorities()=" + getAuthorities()
				+ ", isAccountNonExpired()=" + isAccountNonExpired() + ", isAccountNonLocked()=" + isAccountNonLocked()
				+ ", isCredentialsNonExpired()=" + isCredentialsNonExpired() + ", isEnabled()=" + isEnabled()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}*/

	public Provider(Long id, String username, String password, String firstName, String lastName, String email,
			String image, int phoneNbr, String marque, String fax) {
		super(id, username, password, firstName, lastName, email, image, phoneNbr);
		this.marque = marque;
		this.fax = fax;
	}

	@Override
	public String toString() {
		return "Provider [marque=" + marque + ", fax=" + fax + ", getId()=" + getId() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + ", getImage()=" + getImage()
				+ ", getPhoneNbr()=" + getPhoneNbr() + ", toString()=" + super.toString() + ", getPosts()=" + getPosts()
				+ ", getComments()=" + getComments() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public Provider(Long id) {
		super(id);
	
	}

	public Provider(Long id, String username, String password) {
		super(id, username, password);
		// TODO Auto-generated constructor stub
	}

	

	

}
