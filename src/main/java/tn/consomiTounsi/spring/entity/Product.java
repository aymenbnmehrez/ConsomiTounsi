package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "T_PRODUCT")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private Long id; // Clé primaire

	@Column(name = "PRODUCT_LABEL")
	private String label;

	@Column(name = "PRODUCT_PRICE")
	private float price;

	@Column(name = "PRODUCT_WEIGHT")
	private float weight;
	
	@Column(name = "PRODUCT_QUANTITY")
	private int quantity ;

	@Column(name = "PRODUCT_DESCRIPTION")
	private String description;

	@Column(name = "PRODUCT_IMAGE")
	private String image;

	@OneToMany(targetEntity = CommandLine.class,mappedBy ="product", fetch = FetchType.EAGER)
	private List<CommandLine> commandLines;
	
	@ManyToOne
	Category categories;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<CommandLine> getCommandLines() {
		return commandLines;
	}

	public void setCommandLines(List<CommandLine> commandLines) {
		this.commandLines = commandLines;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategories() {
		return categories;
	}

	public void setCategories(Category categories) {
		this.categories = categories;
	}

	
}
