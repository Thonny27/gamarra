package com.dcompras.gamarra.dto;

import com.dcompras.gamarra.entity.Gallery;
import com.dcompras.gamarra.entity.Type;
import com.dcompras.gamarra.entity.TypeClothing;
import lombok.Data;

import java.util.List;

@Data
public class BrandRs {

    private String address;
    private double lt;
    private double lg;
    private String email;
    private List<Gallery> gallery;
    private List<Type> type;
    private List<TypeClothing> typeClothing;
    private String name;
    private String telephone;
    private String web;

}
