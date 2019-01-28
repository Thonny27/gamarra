package com.dcompras.gamarra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="producto")
@Entity
public class Product {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="isOutfit")
	private boolean isOutfit;
	
	@Column(name="subNameShirt")
	private String subNameShirt;
	
	@Column(name="subNamePants")
	private String subNamePants;
	
	@Column(name="description")
	private String description;
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isOutfit() {
		return isOutfit;
	}



	public void setOutfit(boolean isOutfit) {
		this.isOutfit = isOutfit;
	}



	public String getSubNameShirt() {
		return subNameShirt;
	}



	public void setSubNameShirt(String subNameShirt) {
		this.subNameShirt = subNameShirt;
	}



	public String getSubNamePants() {
		return subNamePants;
	}



	public void setSubNamePants(String subNamePants) {
		this.subNamePants = subNamePants;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	


	public Product(int id, String name, boolean isOutfit, String subNameShirt, String subNamePants,
			String description) {
		this.id = id;
		this.name = name;
		this.isOutfit = isOutfit;
		this.subNameShirt = subNameShirt;
		this.subNamePants = subNamePants;
		this.description = description;
	}

	public Product() {}
}
