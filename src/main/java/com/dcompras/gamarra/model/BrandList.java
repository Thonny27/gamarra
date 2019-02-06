package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Brand;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BrandList {

    private List<Brand> brandList;

    public BrandList(List<Brand> listBrand){
        this.brandList=listBrand;
    }
}
