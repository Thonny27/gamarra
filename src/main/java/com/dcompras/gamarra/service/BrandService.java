package com.dcompras.gamarra.service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.dto.BrandRs;
import com.dcompras.gamarra.dto.GetLocationList;
import com.dcompras.gamarra.entity.Brand;
import com.dcompras.gamarra.model.BrandList;
import com.dcompras.gamarra.model.Response;
import com.dcompras.gamarra.repository.*;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("brandService")
public class BrandService{
    private static final Log logger = org.apache.commons.logging.LogFactory.getLog(BrandService.class);

    @Autowired
    @Qualifier("brandRepository")
    private BrandRepository brandRepository;


    @Autowired
    @Qualifier("brandServiceServiceTest")
    private BrandServiceServiceTest brandServiceServiceTest;


    public BrandList getBrandList(){

        return new BrandList(brandRepository.findAll());
    }

    public List<BrandRs> getbrandRs(){

        BrandRs brandRs = new BrandRs();
        List<BrandRs> listBrand = new ArrayList<>();


            for (int i=0;i<brandServiceServiceTest.obtenerLista().size();i++) {


                brandRs.setAddress(brandServiceServiceTest.obtenerLista().get(i).getAddress());
                brandRs.setLt(brandServiceServiceTest.obtenerLista().get(i).getLt());
                brandRs.setLg(brandServiceServiceTest.obtenerLista().get(i).getLg());
                brandRs.setEmail(brandServiceServiceTest.obtenerLista().get(i).getEmail());
                brandRs.setGallery(brandServiceServiceTest.obtenerGallery(brandServiceServiceTest.obtenerLista().get(i).getGallery()));
                brandRs.setType(brandServiceServiceTest.obtenerType(brandServiceServiceTest.obtenerLista().get(i).getType()));
                brandRs.setCategory(brandServiceServiceTest.obtenerCategory(brandServiceServiceTest.obtenerLista().get(i).getCategory()));
                brandRs.setTypeClothing(brandServiceServiceTest.obtenerTypeClothing(brandServiceServiceTest.obtenerLista().get(i).getTypeClothing()));
                brandRs.setName(brandServiceServiceTest.obtenerLista().get(i).getName());
                brandRs.setTelephone(brandServiceServiceTest.obtenerLista().get(i).getTelephone());
                brandRs.setEmail(brandServiceServiceTest.obtenerLista().get(i).getEmail());


                listBrand.add(brandRs);
            }


        return listBrand;
    }

    public boolean add(Brand brand) {
        try {
            GetLocationList getLocationList = new GetLocationList();
            RestTemplate restTemplate = new RestTemplate();
            Response response = restTemplate.getForObject("https://geocoder.api.here.com/6.2/geocode.json?app_id=kDdjNcp6YR8GQdD5pOaI&app_code=RlZvZ52xurUciGnFcXQ9Ag&searchtext=" + brand.getAddress(), Response.class);
            getLocationList.setLt(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLatitude());
            getLocationList.setLg(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLongitude());
            brand.setLt(getLocationList.getLt());
            brand.setLg(getLocationList.getLg());
            brandRepository.save(brand);
            return true;
        } catch (Exception e) {

        }
            return false;

    }
}
