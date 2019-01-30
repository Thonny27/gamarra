package com.dcompras.gamarra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MBrand {

    private int id;
    private String address;
    private double lt;
    private double lg;
    private GalleryList galery;
    private TypeList type;
    private CategoryList category;
    private String email;
    private String name;
    private String telephone;
    private String web;


}
