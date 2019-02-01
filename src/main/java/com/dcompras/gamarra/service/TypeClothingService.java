package com.dcompras.gamarra.service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.dto.TypeClothingRq;
import com.dcompras.gamarra.entity.TypeClothing;
import com.dcompras.gamarra.model.TypeClothingList;
import com.dcompras.gamarra.repository.TypeclothingRepository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("typeClothingService")
public class TypeClothingService {
    private static final Log logger = org.apache.commons.logging.LogFactory.getLog(TypeClothingService.class);

    @Autowired
    @Qualifier("convertidor")
    private Converter converter;

    @Autowired
    @Qualifier("typleClothingRepository")
    private TypeclothingRepository typeclothingRepository;

    public TypeClothingList getTypleClothingList(){
        return new TypeClothingList(converter.typeClothingConverter(typeclothingRepository.findAll()));
    }

    public boolean add(TypeClothing typeClothing){
        logger.info("creando typeClothing...");
        try {

            typeclothingRepository.save(typeClothing);
            logger.info("creado correctamente...");
            return true;
        }catch (Exception e){
            logger.info("error al crear typeClothing... " + e);
        }
        return false;
    }
}
