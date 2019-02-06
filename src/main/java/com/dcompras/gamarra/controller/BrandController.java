package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.dto.BrandRs;
import com.dcompras.gamarra.entity.Brand;
import com.dcompras.gamarra.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gamarra")
public class BrandController {

    @Autowired
    @Qualifier("brandService")
    private BrandService brandService;


    @GetMapping("/listBrands")
    public List<BrandRs> getBrands(){
        return brandService.getbrandRs();

    }

    @PostMapping("addBrand")
    public boolean addBrand(@RequestBody @Validated Brand brand){
        return brandService.add(brand);
    }
}
