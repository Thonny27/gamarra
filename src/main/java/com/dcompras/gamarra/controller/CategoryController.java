package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.entity.Category;
import com.dcompras.gamarra.model.CategoryList;
import com.dcompras.gamarra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gamarra")
public class CategoryController {

    @Autowired
    @Qualifier("categoryService")
    private CategoryService categoryService;

    @GetMapping("/listCategories")
    public CategoryList getCategories(){
        return categoryService.getCategorylist();
    }

    @PostMapping("addCategory")
    public boolean addCategory(@RequestBody @Validated Category category){
        return categoryService.add(category);
    }
}
