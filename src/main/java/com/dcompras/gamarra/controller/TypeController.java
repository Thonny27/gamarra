package com.dcompras.gamarra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcompras.gamarra.model.MType;
import com.dcompras.gamarra.service.TypeService;

@RestController
@RequestMapping("/gamarra")
public class TypeController {

	@Autowired
	@Qualifier("typeService")
	private TypeService typeService;
	
	@GetMapping("/listType")
	public List<MType> obtenerType(){
		return typeService.obtener();
	}
}
