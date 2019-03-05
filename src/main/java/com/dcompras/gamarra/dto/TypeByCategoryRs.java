package com.dcompras.gamarra.dto;

import com.dcompras.gamarra.entity.Category;
import lombok.Data;

import java.util.List;

@Data
public class TypeByCategoryRs {
    private String name;
    private List<Category> category;

}
