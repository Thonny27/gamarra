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

    public MTypeClothing(TypeClothing typeClothing) {
        this.id=typeClothing.getId();
        this.name = typeClothing.getName();
        this.detail = typeClothing.getDetail();
    }

}
