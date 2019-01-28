package com.dcompras.gamarra.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.entity.Tienda;
import com.dcompras.gamarra.model.MTienda;
import com.dcompras.gamarra.model.Response;
import com.dcompras.gamarra.repository.TiendaRepository;

@Service("tiendaServicio")
public class TiendaService implements CommandLineRunner {
	
	private static final Log logger = org.apache.commons.logging.LogFactory.getLog(TiendaService.class);
	
	@Autowired
	@Qualifier("convertidor")
	private Converter converter;
	
	@Autowired
	@Qualifier("tiendaRepository")
	private TiendaRepository tiendaRepository;
	
	public boolean crear(Tienda tienda) {
		logger.info("Creando tienda");
		Double laitud;
		Double longitud;
		try {
			
			RestTemplate restTemplate = new RestTemplate();
			Response response = restTemplate.getForObject("https://geocoder.api.here.com/6.2/geocode.json?app_id=kDdjNcp6YR8GQdD5pOaI&app_code=RlZvZ52xurUciGnFcXQ9Ag&searchtext=Leoncio Prado, San Martín de Porres 15107", Response.class);
			System.out.println("Direccion :Leoncio Prado, San Martín de Porres 15107");
			laitud=response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLatitude();
			longitud=response.getResponse().getView().get(0).getResult().get(0).getLocation().getDisplayPosition().getLongitude();
			//System.out.println("coordenadas: "+laitud+" & "+longitud);
			
			tiendaRepository.save(tienda).setLt(laitud);
			tiendaRepository.save(tienda).setLg(longitud);
			tiendaRepository.save(tienda);
			logger.info("Tienda Creada");
			return true;
		} catch (Exception e) {;
			logger.info("Error al crar tienda");
		}
		return false;
	}
	
	public List<MTienda> obtener(){
		
		RestTemplate restTemplate = new RestTemplate();
		MTienda mtienda =  restTemplate.getForObject("https://geocoder.api.here.com/6.2/geocode.json?app_id=kDdjNcp6YR8GQdD5pOaI&app_code=RlZvZ52xurUciGnFcXQ9Ag&searchtext=jr gamarra 1043 la victoria", MTienda.class);
		System.out.println("json es"+mtienda);
		
		logger.info("Listando tiendas");
		return converter.convertirTienda(tiendaRepository.findAll());
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
	
	

}
