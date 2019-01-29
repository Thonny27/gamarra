package com.dcompras.gamarra.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GalleryList {

    private List<MGallery> galleryList;

    public GalleryList(List<MGallery> galleryList){
        this.galleryList=galleryList;
    }

}
