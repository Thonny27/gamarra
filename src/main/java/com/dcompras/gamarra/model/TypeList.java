package com.dcompras.gamarra.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TypeList {
    private int state;
    private List<MType> listType;

    public TypeList(List<MType> listType){
        this.listType=listType;

    }
}
