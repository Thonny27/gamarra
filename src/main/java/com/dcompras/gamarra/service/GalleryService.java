package com.dcompras.gamarra.service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.entity.Gallery;
import com.dcompras.gamarra.model.GalleryList;
import com.dcompras.gamarra.repository.GalleryRespository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("galleryService")
public class GalleryService {
    private static final Log logger = org.apache.commons.logging.LogFactory.getLog(GalleryService.class);

    @Autowired
    @Qualifier("converter")
    private Converter converter;

    @Autowired
    @Qualifier("galleryRepository")
    private GalleryRespository galleryRespository;

    public GalleryList getGalleryList(){
        return new GalleryList(converter.galleryConverter(galleryRespository.findAll()));
    }

    public boolean add(Gallery gallery) {
        logger.info("Creando gallery");
        try {
            galleryRespository.save(gallery);
            return true;
        } catch (Exception e) {
            logger.error("error al crear gallery "+e);
        }
        return false;
    }
}
