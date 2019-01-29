package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.model.Response2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcompras.gamarra.entity.SubTypeHombre;
import com.dcompras.gamarra.entity.Tienda;
import com.dcompras.gamarra.model.MSubTypeHombre;
import com.dcompras.gamarra.service.SubTypeHombreService;
@RestController
@RequestMapping("/gamarra")
public class SubTypeHombreController {

	@Autowired
	@Qualifier("SubTypeHombreService")
	private SubTypeHombreService subTypeHombreService;
	
	
	@PostMapping("/addSubTypehombre")
	public boolean agregarSubTypeHombre(@RequestBody @Validated SubTypeHombre subTypeHombre) {
		return subTypeHombreService.add(subTypeHombre);
	}
	
	@GetMapping("/listSubtypesHombre")
	public Response2 obtenerSubTypeHombre(){
		return subTypeHombreService.obtener();
	}
	
	
}
