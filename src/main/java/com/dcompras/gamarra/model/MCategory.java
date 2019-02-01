package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MCategory {

    private int id;
    private String name;
    private String detail;

    public MCategory(Category category) {
        this.id=category.getId();
        this.name = category.getName();
        this.detail = category.getDetail();
    }
}
