package tn.consomiTounsi.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_ADDRESS")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private Long id; // Identifiant formation (Clé primaire)

	@Column(name = "STREET")
	private String Street;
	@Column(name = "CITY")
	@Enumerated(EnumType.STRING)
	private City City;
	@Column(name = "CP")
	private String Cp;

}


