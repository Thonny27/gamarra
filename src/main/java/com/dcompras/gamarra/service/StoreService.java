package com.dcompras.gamarra.service;

import com.dcompras.gamarra.dto.GetLocationList;
import com.dcompras.gamarra.dto.StoreRs;
import com.dcompras.gamarra.entity.Store;
import com.dcompras.gamarra.model.Response;
import com.dcompras.gamarra.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    @Qualifier("brandServiceServiceTest")
    private BrandServiceServiceTest brandServiceServiceTest;

    public boolean add(Store store){

        try {

            GetLocationList getLocationList = new GetLocationList();
            RestTemplate restTemplate = new RestTemplate();
            Response response = restTemplate.getForObject("https://geocoder.api.here.com/6.2/geocode.json?app_id=kDdjNcp6YR8GQdD5pOaI&app_code=RlZvZ52xurUciGnFcXQ9Ag&searchtext=" + store.getAddress(), Response.class);
            getLocationList.setLt(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLatitude());
            getLocationList.setLg(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLongitude());
            store.setLt(getLocationList.getLt());
            store.setLg(getLocationList.getLg());
            storeRepository.save(store);
            return true;
        }catch (Exception e){


        }
        return false;
    }

    public List<StoreRs> getStorers(){

        List<StoreRs> listStores= new ArrayList<>();


        StoreRs storeRs=new StoreRs();
        storeRs.setAddress(brandServiceServiceTest.obtenerStorelist().get(0).getAddress());
        storeRs.setLt(brandServiceServiceTest.obtenerStorelist().get(0).getLt());
        storeRs.setLg(brandServiceServiceTest.obtenerStorelist().get(0).getLg());
        storeRs.setName(brandServiceServiceTest.obtenerStorelist().get(0).getName());
        storeRs.setGender(brandServiceServiceTest.obtenerStorelist().get(0).getGender());
        storeRs.setType(brandServiceServiceTest.obtenerStorelist().get(0).getType());
        storeRs.setEmail(brandServiceServiceTest.obtenerStorelist().get(0).getEmail());
        storeRs.setTelephone(brandServiceServiceTest.obtenerStorelist().get(0).getTelephone());
        storeRs.setUrlWeb(brandServiceServiceTest.obtenerStorelist().get(0).getUrlWeb());



        return listStores;
    }
}
