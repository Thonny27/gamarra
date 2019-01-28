package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Category;
import lombok.Data;

@Data
public class MCategory {

    private int id;
    private String name;
    private String detail;

    public MCategory(Category category) {
        this.name = category.getName();
        this.detail = category.getDetail();
    }
}
