package com.dcompras.gamarra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MTypeByCategory {

    private int id;
    private String name;
    private int category;

    public MTypeByCategory(MTypeByCategory mTypeByCategory) {
        this.id = mTypeByCategory.getId();
        this.name = mTypeByCategory.getName();
        this.category = mTypeByCategory.getCategory();
    }
}
