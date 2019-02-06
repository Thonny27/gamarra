package com.dcompras.gamarra.service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.dto.GetLocationList;
import com.dcompras.gamarra.entity.Gallery;
import com.dcompras.gamarra.model.GalleryList;
import com.dcompras.gamarra.model.Response;
import com.dcompras.gamarra.repository.GalleryRespository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("galleryService")
public class GalleryService {
    private static final Log logger = org.apache.commons.logging.LogFactory.getLog(GalleryService.class);

    @Autowired
    @Qualifier("convertidor")
    private Converter converter;

    @Autowired
    @Qualifier("galleryRepository")
    private GalleryRespository galleryRepository;

    public GalleryList getGalleryList(){
        return new GalleryList(converter.galleryConverter(galleryRepository.findAll()));
    }

    public GalleryList getGalleryListId(int id){
        return new GalleryList(converter.galleryConverter(galleryRepository.findById(id)));
    }

    //public String address="Leoncio Prado, San Martín de Porres 15107";

    public boolean add(Gallery gallery) {


        logger.info("Creando gallery");

        try {
            GetLocationList getLocationList = new GetLocationList();

            RestTemplate restTemplate = new RestTemplate();
            Response response = restTemplate.getForObject("https://geocoder.api.here.com/6.2/geocode.json?app_id=kDdjNcp6YR8GQdD5pOaI&app_code=RlZvZ52xurUciGnFcXQ9Ag&searchtext="+gallery.getDirection(), Response.class);
            logger.info("Obteniendo coordenadas ...");
            getLocationList.setLt(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLatitude());
            getLocationList.setLg(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLongitude());
            gallery.setLt(getLocationList.getLt());
            gallery.setLg(getLocationList.getLg());
            galleryRepository.save(gallery);
            return true;
        } catch (Exception e) {
            logger.error("error al crear gallery "+e);
        }
        return false;
    }
}
