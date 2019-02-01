package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.dto.TypeClothingRq;
import com.dcompras.gamarra.entity.TypeClothing;
import com.dcompras.gamarra.model.TypeClothingList;
import com.dcompras.gamarra.service.TypeClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gamarra")
public class TypeClothingcontroller {

    @Autowired
    @Qualifier("typeClothingService")
    private TypeClothingService typeClothingService;

    @GetMapping("/listTypeClothing")
    public TypeClothingList getTypeclothings() {
        return typeClothingService.getTypleClothingList();
    }

    @PostMapping("addTypeClothing")
    public boolean addTypeClothing(@RequestBody @Validated TypeClothing typeClothing) {
        return typeClothingService.add(typeClothing);

    }
}