package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MProduct {


	private int id;
	private int type;
	private int category;
	private int typeClothing;
	private int usesColor;
	private int colorList;
	private String description;
	private int discount;
	private String imageList;
	private String size;
	private boolean isCart;
	private boolean isOutfit;
	private boolean isWishList;
	private String name;
	private int priority;
	private boolean promotion;
	private int quantity;
	private double retailPrice;
	private String subNamePants;
	private String subNameShirt;
	private double wholesalePrice;


	public MProduct(Product product) {
		this.id = product.getId();
		this.type = product.getType();
		this.category = product.getCategory();
		this.typeClothing = product.getTypeClothing();
		this.usesColor = product.getUsesColor();
		this.colorList = product.getColorList();
		this.description = product.getDescription();
		this.discount = product.getDiscount();
		this.imageList = product.getImageList();
		this.size = product.getSize();
		this.isCart = product.isCart();
		this.isOutfit = product.isOutfit();
		this.isWishList = product.isWishList();
		this.name = product.getName();
		this.priority = product.getPriority();
		this.promotion = product.isPromotion();
		this.quantity = product.getQuantity();
		this.retailPrice = product.getRetailPrice();
		this.subNamePants = product.getSubNamePants();
		this.subNameShirt = product.getSubNameShirt();
		this.wholesalePrice = product.getWholesalePrice();
	}
}
