package com.dcompras.gamarra.service;

import com.dcompras.gamarra.dto.TypeByCategoryRq;
import com.dcompras.gamarra.dto.TypeByCategoryRs;
import com.dcompras.gamarra.dto.TypeByRepositoryRs;
import com.dcompras.gamarra.entity.Category;
import com.dcompras.gamarra.entity.TypeByCategory;
import com.dcompras.gamarra.repository.CategoryRepository;
import com.dcompras.gamarra.repository.TypeByCategoryRepository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeByCategoryService {
    private static final Log logger = org.apache.commons.logging.LogFactory.getLog(TypeByCategoryService.class);

    @Autowired
    private TypeByCategoryRepository typeByCategoryRepository;

    @Autowired
    @Qualifier("brandServiceServiceTest")
    private BrandServiceServiceTest brandServiceServiceTest;

    @Autowired
    @Qualifier("categoryRepository")
    private CategoryRepository categoryRepository;

    public boolean add(TypeByCategoryRq request){
        logger.info("creando typeClothing...");
        TypeByCategory response = new TypeByCategory();
        try {
            response.setIdCategory(request.getIdCategory());
            response.setName(request.getName());
            response.setNameCategory(brandServiceServiceTest.obtenerCategorylist().get(request.getIdCategory()).getName());

            typeByCategoryRepository.save(response);
            logger.info("creado correctamente...");
            return true;
        }catch (Exception e){
            logger.info("error al crear typeClothing... " + e);
        }
        return false;
    }

    /*private List<TypeByCategoryRs> getTypeByCategory(int category){

        List<TypeByCategoryRs> listTypeByCategory = new ArrayList<>();

        TypeByCategoryRs typeByCategoryRs = new TypeByCategoryRs();

        for (int i=0;i<brandServiceServiceTest.obtenerTypeByCategorylist().size();i++)

        typeByCategoryRs.setName(brandServiceServiceTest.obtenerTypeByCategorylist().get(i).getName());


        return null;
    }*/

    public List<TypeByCategory> listTypeCategory(int idCategory){

        return typeByCategoryRepository.findByIdCategory(idCategory);
    }



}
