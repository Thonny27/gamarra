package com.dcompras.gamarra.service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.entity.Category;
import com.dcompras.gamarra.model.CategoryList;
import com.dcompras.gamarra.repository.CategoryRepository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("categoryService")
public class CategoryService {
    private static final Log logger = org.apache.commons.logging.LogFactory.getLog(CategoryService.class);

    @Autowired
    @Qualifier("convertidor")
        private Converter converter;

    @Autowired
    @Qualifier("categoryRepository")
    private CategoryRepository categoryRepository;

    public boolean add(Category category){
        try {
            logger.info("Agregando Categoria");
            categoryRepository.save(category);
            return true;
        }catch(Exception e){
            logger.info("error al agregar categoria "+e);
        }
        return false;
    }

    public CategoryList getCategorylist(){
        logger.info("Listando Categorias");
        return new CategoryList(converter.categoryConverter(categoryRepository.findAll()));
    }


}
