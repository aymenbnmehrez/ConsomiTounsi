package tn.consomiTounsi.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROVIDER")
public class Provider extends User implements Serializable {

	private static final long serialVersionUID = 1L;
@Column(name = "MARQUE")	
private String marque ;
@Column(name = "FAX")	
private String fax;
}

