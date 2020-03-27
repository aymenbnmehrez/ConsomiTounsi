package tn.consomiTounsi.spring.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="ADMIN")
public class Admin extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	public Admin(String username, String password, String firstName, String lastName, String email, String image,
			int phoneNbr) {
		super(username, password, firstName, lastName, email, image, phoneNbr);
		// TODO Auto-generated constructor stub
	}
	public Admin() {
		super();
	}


}
