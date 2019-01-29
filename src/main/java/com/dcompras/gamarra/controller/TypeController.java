package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.model.TypeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dcompras.gamarra.service.TypeService;

@RestController
@RequestMapping("/gamarra")
public class TypeController {

	@Autowired
	@Qualifier("typeService")
	private TypeService typeService;
	
	@GetMapping("/listType")
	public TypeList getTypes(){
		return typeService.getTypeList();
	}
}
