package com.dcompras.gamarra.service;

import com.dcompras.gamarra.entity.*;
import com.dcompras.gamarra.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("brandServiceServiceTest")
public class BrandServiceServiceTest {

    @Autowired
    @Qualifier("brandServiceRepositoryTest")
    private BrandServiceRepositoryTest brandServiceRepositoryTest;

    @Autowired
    @Qualifier("galleryRepository")
    private GalleryRespository galleryRespository;

    @Autowired
    @Qualifier("typeRepository")
    private TypeRepository typeRepository;

    @Autowired
    @Qualifier("typleClothingRepository")
    private TypeclothingRepository typeclothingRepository;

    @Autowired
    @Qualifier("categoryRepository")
    private CategoryRepository categoryRepository;

   /* @Autowired
    @Qualifier("productRepository")
    private ProductRepository productRepository;*/


    public List<Brand> obtenerLista(){
        return brandServiceRepositoryTest.findAll();
    }

    public List<Gallery> obtenerGallery(int id){
        return galleryRespository.findById(id);
    }

    public List<Type> obtenerType(int id){
        return typeRepository.findById(id);
    }

    public List<TypeClothing> obtenerTypeClothing(int id){
        return typeclothingRepository.findById(id);
    }

    public List<Category> obtenerCategory(int id){
        return categoryRepository.findById(id);
    }

   /* public List<Product> getProduct(String name){
        return productRepository.findByName(name);
    }*/

}
