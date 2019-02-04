package com.dcompras.gamarra.service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.dto.BrandRs;
import com.dcompras.gamarra.dto.GetLocationList;
import com.dcompras.gamarra.entity.Brand;
import com.dcompras.gamarra.model.BrandList;
import com.dcompras.gamarra.model.Response;
import com.dcompras.gamarra.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("brandService")
public class BrandService {

    @Autowired
    @Qualifier("brandRepository")
    private BrandRepository brandRepository;

    @Autowired
    @Qualifier("convertidor")
    private Converter converter;

    public BrandList getBrandList(){

        return new BrandList(brandRepository.findAll());
    }

    public BrandRs getbrandRs(){
        BrandRs brandRs = new BrandRs();
        Brand brand = new Brand();
        brandRs.setAddress(brand.getAddress());
        brandRs.setLt(brand.getLt());
        brandRs.setLg(brand.getLg());
        brandRs.setEmail(brand.getEmail());
        brandRs.getGallery();

        brandRs.setName(brand.getName());
        brandRs.setTelephone(brand.getTelephone());
        brandRs.setWeb(brand.getWeb());

        return brandRs;
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
