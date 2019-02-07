package com.dcompras.gamarra.dto;

import com.dcompras.gamarra.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class ProductRs {

    private int id;
    private List<Type> type;
    private List<Category> category;
    private List<TypeClothing> typeClothing;
    private List<UsesColor> usesColor;
    private List<ColorList> colorList;
    private String description;
    private int discount;
    private String imageList;
    private List<Size> size;
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
}
