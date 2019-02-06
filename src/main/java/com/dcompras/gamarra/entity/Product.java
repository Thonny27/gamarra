package com.dcompras.gamarra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="producto")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@Column(name="type")
	private int type;

	@Column(name="category")
	private int category;

	@Column(name="typeClothing")
	private int typeClothing;

	@Column(name="usesColor")
	private String usesColor;

	@Column(name="colorList")
	private String colorList;

	@Column(name="description")
	private String description;

	@Column(name="discount")
	private int discount;

	@Column(name="imageList")
	private String imageList;

	@Column(name="size")
	private String size;

	@Column(name="isCart")
	private boolean isCart;

	@Column(name="isOutfit")
	private boolean isOutfit;

	@Column(name="isWishList")
	private boolean isWishList;

	@Column(name="name")
	private String name;

	@Column(name="priority")
	private int priority;

	@Column(name="promotion")
	private boolean promotion;

	@Column(name="quantity")
	private int quantity;

	@Column(name="retailPrice")
	private double retailPrice;

	@Column(name="subNamePants")
	private String subNamePants;

	@Column(name="subNameShirt")
	private String subNameShirt;

	@Column(name="wholesalePrice")
	private double wholesalePrice;


}
