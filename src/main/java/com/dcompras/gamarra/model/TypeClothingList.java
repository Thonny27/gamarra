package com.dcompras.gamarra.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TypeClothingList {

    private List<MTypeClothing> listTypeclothing;

    public TypeClothingList(List<MTypeClothing> listTypeclothing){
        this.listTypeclothing=listTypeclothing;
    }
}
