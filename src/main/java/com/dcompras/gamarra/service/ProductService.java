package com.dcompras.gamarra.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.entity.Product;
import com.dcompras.gamarra.model.MProduct;
import com.dcompras.gamarra.repository.ProductRepository;


@Service("servicio")
public class ProductService {

	private static final Log logger = org.apache.commons.logging.LogFactory.getLog(ProductService.class); //logger
	
	@Autowired
	@Qualifier("repositorio")
	private ProductRepository repositorio;
	
	@Autowired
	@Qualifier("converter")
	private Converter converter;
	
	public boolean crear(Product product) {
		logger.info("CREANDO PRODUCTO");
		try {
			
			repositorio.save(product);
			logger.info("PRODUCTO CREADO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR EL PRODUCTO");
		}
		return false;
	}
	
	public List<MProduct> obtener(){
		logger.info("LISTANDO TODOS LOS PRODUCTOS");
		return converter.convertirLista(repositorio.findAll());
	}
}
