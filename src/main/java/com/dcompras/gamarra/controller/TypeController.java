package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.dto.TypeClothingRq;
import com.dcompras.gamarra.entity.Type;
import com.dcompras.gamarra.model.TypeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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

	@PostMapping("/addType")
	public boolean addType(@RequestBody @Validated Type type){
		return typeService.add(type);

	}
}
