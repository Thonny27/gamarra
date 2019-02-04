package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Category;
import com.dcompras.gamarra.entity.Gallery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
