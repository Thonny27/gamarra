package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Product;

public class MProduct {


	private int id;
	private String name;
	private boolean isOutfit;
	private String subNameShirt;
	private String subNamePants;
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
	
	

	public MProduct(int id, String name, boolean isOutfit, String subNameShirt, String subNamePants,
			String description) {
		this.id = id;
		this.name = name;
		this.isOutfit = isOutfit;
		this.subNameShirt = subNameShirt;
		this.subNamePants = subNamePants;
		this.description = description;
	}

	public MProduct() {}
	
	public MProduct(Product product) {
		
		this.id = product.getId();
		this.name = product.getName();
		this.isOutfit = product.isOutfit();
		this.subNameShirt = product.getSubNameShirt();
		this.subNamePants = product.getSubNamePants();
		this.description = product.getDescription();
	}

	
}
