package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MBrand {

    private int id;
    private String address;
    private double lt;
    private double lg;
    private int galery;
    private int type;
    private int category;
    private String email;
    private String name;
    private String telephone;
    private String web;


    public MBrand(Brand brand){
        this.id=brand.getId();
        this.address = brand.getAddress();
        this.lt = brand.getLt();
        this.lg = brand.getLg();
        this.galery = brand.getGallery();
        this.type = brand.getType();
        this.category = brand.getCategory();
        this.email = brand.getEmail();
        this.name = brand.getName();
        this.telephone = brand.getTelephone();
        this.web = brand.getWeb();
    }
}
