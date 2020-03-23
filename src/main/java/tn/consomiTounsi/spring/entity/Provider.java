package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROVIDER")
public class Provider extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "MARQUE")
	private String marque;
	@Column(name = "FAX")
	private String fax;

	@OneToMany(mappedBy = "provider")
	private List<ProviderEntry> quantitiestyEntry;

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

	public List<ProviderEntry> getQuantitiestyEntry() {
		return quantitiestyEntry;
	}

	public void setQuantitiestyEntry(List<ProviderEntry> quantitiestyEntry) {
		this.quantitiestyEntry = quantitiestyEntry;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
