package com.dcompras.gamarra.service;

import com.dcompras.gamarra.model.Response2;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.entity.SubTypeHombre;
import com.dcompras.gamarra.repository.SubTypeHombreRepository;

@Service("SubTypeHombreService")
public class SubTypeHombreService {

	private static final Log logger = org.apache.commons.logging.LogFactory.getLog(SubTypeHombreService.class);
	
	@Autowired
	@Qualifier("convertidor")
	private Converter converter;
	
	@Autowired
	@Qualifier("subTypeHombreRepository")
	private SubTypeHombreRepository subTypeHombreRepository;
	
	public Response2 obtener(){
		logger.info("listando categorias");

		return new Response2(converter.convertirSubTypeHombre(subTypeHombreRepository.findAll()));
	}

	public boolean add(SubTypeHombre subTypeHombre) {
		logger.info("CREANDO SUBTYPE_HOMBRE");
		try {
			
			subTypeHombreRepository.save(subTypeHombre);
			logger.info("SUBTYPE_HOMBRE CREADO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR EL SUBTYPE_HOMBRE");
		}
		return false;
	}
}
