package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.dto.StoreRs;
import com.dcompras.gamarra.entity.Store;
import com.dcompras.gamarra.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gamarra")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("listAllStores")
    public List<StoreRs> getStores(){
        return storeService.getStorers();
    }

    @PostMapping("addStore")
    public boolean add(@RequestBody @Validated Store store){
        return storeService.add(store);
    }

}
