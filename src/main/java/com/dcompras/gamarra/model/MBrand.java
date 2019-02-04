package com.dcompras.gamarra.model;

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
    private List<MGallery> galery;
    private List<MType> type;
    private List<MCategory> category;
    private String email;
    private String name;
    private String telephone;
    private String web;


}
