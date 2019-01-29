package com.dcompras.gamarra.service;

import com.dcompras.gamarra.model.TypeList;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.repository.TypeRepository;

@Service("typeService")
public class TypeService {
	
	private static final Log logger = org.apache.commons.logging.LogFactory.getLog(TypeService.class);
	
	@Autowired
	@Qualifier("convertidor")
	private Converter converter;
	
	@Autowired
	@Qualifier("typeRepository")
	private TypeRepository typeRepository;
	
	public TypeList getTypeList(){
		logger.info("listando categorias");
		return new TypeList(converter.typeConverter(typeRepository.findAll()));
	}

}
