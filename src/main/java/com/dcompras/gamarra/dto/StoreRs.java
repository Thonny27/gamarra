package com.dcompras.gamarra.dto;

import lombok.Data;

import java.util.List;

@Data
public class StoreRs {

    private int id;
    private String address;
    private double lt;
    private double lg;
    private String name;
    private String gender;
    private int type;
    private String email;
    private int telephone;
    private String urlWeb;
    private List<ProductRs> products;
}
