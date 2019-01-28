package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.TypeClothing;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MTypeClothing {

    private int id;
    private String name;
    private String detail;

    public MTypeClothing(TypeClothing mtypeClothing) {
        this.name = mtypeClothing.getName();
        this.detail = mtypeClothing.getDetail();
    }

}
