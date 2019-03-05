package com.dcompras.gamarra.service;

import com.dcompras.gamarra.dto.TypeByCategoryRs;
import com.dcompras.gamarra.entity.TypeByCategory;
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

    public boolean add(TypeByCategory typeByCategory){
        logger.info("creando typeClothing...");
        try {
            typeByCategoryRepository.save(typeByCategory);
            logger.info("creado correctamente...");
            return true;
        }catch (Exception e){
            logger.info("error al crear typeClothing... " + e);
        }
        return false;
    }

    private List<TypeByCategoryRs> getTypeByCategory(int category){

        List<TypeByCategoryRs> listTypeByCategory = new ArrayList<>();

        TypeByCategoryRs typeByCategoryRs = new TypeByCategoryRs();

        for (int i=0;i<brandServiceServiceTest.obtenerTypeByCategorylist().size();i++)

        typeByCategoryRs.setName(brandServiceServiceTest.obtenerTypeByCategorylist().get(i).getName());


        return null;
    }


}
