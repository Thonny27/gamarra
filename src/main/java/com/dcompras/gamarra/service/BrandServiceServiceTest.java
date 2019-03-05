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

    @Autowired
    @Qualifier("productRepository")
    private ProductRepository productRepository;

    @Autowired
    @Qualifier("colorListRepository")
    private ColorListRepository colorListRepository;

    @Autowired
    @Qualifier("sizeRepository")
    private SizeRepository sizeRepository;


    @Autowired
    private StoreRepository storeRepository;

    public List<Brand> obtenerLista(){
        return brandServiceRepositoryTest.findAll();
    }

    public List<Product> obtenerListaProduct(){
        return productRepository.findAll();
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

    public List<Product> obtenerProduct(int id){
        return productRepository.findById(id);
    }

    public List<ColorList> obtenerColorList(int id){
        return colorListRepository.findById(id);
    }

    public List<Size> obtenerSizeList(int id){
        return sizeRepository.findById(id);
    }

    public List<Store> obtenerStorelist(){
        return storeRepository.findAll();
    }

    public List<Category> obtenerCategorylist(){
        return categoryRepository.findAll();
    }



}
