package com.dcompras.gamarra.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryList {
    private int state;
    private List<MCategory> listCategory;

    public CategoryList(List<MCategory> listCategory){
         this.listCategory=listCategory;
    }
}
