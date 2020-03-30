package tn.consomiTounsi.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "T_PRODUCT")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private Long idProduct;

	@NotNull
	@Column(name = "PRODUCT_NAME")
	private String Name;

	@NotNull
	@Column(name = "PRODUCT_PRICE")
	private double price;

	@Column(name = "PRODUCT_QUANTITY_STOCK")
	@NotNull
	private int quantity_stock;

	@Column(name = "PRODUCT_QUANTITY_ALERT")
	@NotNull
	private int quantity_alert;

	@Column(name = "PRODUCT_PICTURE")
	@NotNull
	private String picture;

	@Column(name = "PRODUCT_DESCRIPTION")
	private String Description;

	@Column(name = "PRODUCT_STATUS_STOCK")
	@Enumerated(EnumType.STRING)
	@NotNull
	private EtatStock etat_stock;

	@OneToMany(targetEntity = CommandLine.class, mappedBy = "product", fetch = FetchType.EAGER)
	private List<CommandLine> commandLines;

	@ManyToOne
	Category categories;

	@OneToMany(mappedBy = "product", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<ProviderEntry> providerEntry;

	@OneToMany(mappedBy = "product")
	private List<Publicity> publicities;

	public Product() {
		super();
	}

	public Product(Long idProduct, @NotNull String name, @NotNull double price, @NotNull int quantity_stock,
			@NotNull int quantity_alert, @NotNull String picture, String description, @NotNull EtatStock etat_stock,
			List<CommandLine> commandLines, Category categories, List<ProviderEntry> providerEntry,
			List<Publicity> publicities) {
		super();
		this.idProduct = idProduct;
		Name = name;
		this.price = price;
		this.quantity_stock = quantity_stock;
		this.quantity_alert = quantity_alert;
		this.picture = picture;
		Description = description;
		this.etat_stock = etat_stock;
		this.commandLines = commandLines;
		this.categories = categories;
		this.providerEntry = providerEntry;
		this.publicities = publicities;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity_stock() {
		return quantity_stock;
	}

	public void setQuantity_stock(int quantity_stock) {
		this.quantity_stock = quantity_stock;
	}

	public int getQuantity_alert() {
		return quantity_alert;
	}

	public void setQuantity_alert(int quantity_alert) {
		this.quantity_alert = quantity_alert;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public EtatStock getEtat_stock() {
		return etat_stock;
	}

	public void setEtat_stock(EtatStock etat_stock) {
		this.etat_stock = etat_stock;
	}

	public List<ProviderEntry> getProviderEntry() {
		return providerEntry;
	}

	public void setProviderEntry(List<ProviderEntry> providerEntry) {
		this.providerEntry = providerEntry;
	}

	public List<Publicity> getPublicities() {
		return publicities;
	}

	public void setPublicities(List<Publicity> publicities) {
		this.publicities = publicities;
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

	public Category getCategories() {
		return categories;
	}

	public void setCategories(Category categories) {
		this.categories = categories;
	}

}
