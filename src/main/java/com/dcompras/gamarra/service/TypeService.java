package com.dcompras.gamarra.service;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dcompras.gamarra.converter.Convertidor;
import com.dcompras.gamarra.model.MType;
import com.dcompras.gamarra.repository.TypeRepository;

@Service("typeService")
public class TypeService {
	
	private static final Log logger = org.apache.commons.logging.LogFactory.getLog(TypeService.class);
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	@Autowired
	@Qualifier("typeRepository")
	private TypeRepository typeRepository;
	
	public List<MType> obtener(){
		logger.info("listando categorias");
		return convertidor.convertirCategory(typeRepository.findAll());
	}

}
