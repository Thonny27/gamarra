package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.dto.TypeByCategoryRq;
import com.dcompras.gamarra.entity.TypeByCategory;
import com.dcompras.gamarra.service.TypeByCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gamarra")
public class TypeByCategoryController {

    @Autowired
    private TypeByCategoryService typeByCategoryService;

    @PostMapping("/addTypeByCategory")
    public boolean addTypeByCategory(@RequestBody TypeByCategoryRq request){

        return typeByCategoryService.add(request);

    }

    @GetMapping("/listTypeByCategory")
    public List<TypeByCategory> getlistType(@RequestParam("idCategory")int idCategory){
        return typeByCategoryService.listTypeCategory(idCategory);
    }







}
