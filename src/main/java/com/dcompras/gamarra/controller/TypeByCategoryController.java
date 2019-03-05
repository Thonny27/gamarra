package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.dto.TypeByCategoryRq;
import com.dcompras.gamarra.dto.TypeByCategoryRs;
import com.dcompras.gamarra.entity.TypeByCategory;
import com.dcompras.gamarra.service.BrandService;
import com.dcompras.gamarra.service.TypeByCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
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






}
