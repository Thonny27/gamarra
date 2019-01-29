package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.entity.Gallery;
import com.dcompras.gamarra.model.GalleryList;
import com.dcompras.gamarra.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gamarra")
public class GalleryController {

    @Autowired
    @Qualifier("galleryService")
    private GalleryService galleryService;

    @GetMapping("/listGalleries")
    public GalleryList getGalleries(){
        return galleryService.getGalleryList();
    }

    @PostMapping("/addGallery")
    public boolean addGallery(@RequestBody @Validated Gallery gallery){
        return galleryService.add(gallery);
    }
}
