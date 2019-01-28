package com.dcompras.gamarra.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcompras.gamarra.entity.Product;
import com.dcompras.gamarra.model.MProduct;
import com.dcompras.gamarra.service.ProductService;

@RestController
@RequestMapping("/gamarra")
public class ProductController {
	
	@Autowired
	@Qualifier("servicio")
	private ProductService servicio;
	
	@PostMapping("/product")
	public boolean agregarProducto(@RequestBody @Valid Product product) {
		return servicio.crear(product);
		
	}
	
	@GetMapping("/listProducts")
	public List<MProduct> obtenerProductos(){
		return servicio.obtener();
	}

}
