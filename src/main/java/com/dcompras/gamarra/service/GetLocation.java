package com.dcompras.gamarra.service;

import com.dcompras.gamarra.dto.GetLocationList;
import com.dcompras.gamarra.model.Response;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class GetLocation {

   /* public static void main(String[] args) {
        getLocationList();
    }*/

    /*public String address="Leoncio Prado, San Martín de Porres 15107";

    public  List<GetLocationList> getLocationList(){

        GetLocationList ss = new GetLocationList();

        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject("https://geocoder.api.here.com/6.2/geocode.json?app_id=kDdjNcp6YR8GQdD5pOaI&app_code=RlZvZ52xurUciGnFcXQ9Ag&searchtext="+address, Response.class);
        System.out.println("Direccion :Leoncio Prado, San Martín de Porres 15107");
        ss.setLt(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLatitude());
        ss.setLg(response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLongitude());
        return getLocationList();
    }

*/
}
