package com.dcompras.gamarra.controller;

import com.dcompras.gamarra.entity.Type;
import com.dcompras.gamarra.model.TypeList;
import com.dcompras.gamarra.repository.TypeRepository;
import com.dcompras.gamarra.repository.TypeRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.dcompras.gamarra.service.TypeService;

import javax.validation.Valid;

@RestController
@RequestMapping("/gamarra")
public class TypeController {

	@Autowired
	@Qualifier("typeService")
	private TypeService typeService;

	@Autowired
	@Qualifier("typeRepository")
	private TypeRepository typeRepository;


	@Autowired
	@Qualifier("typeRepository2")
	private TypeRepository2 typeRepository2;
	
	@GetMapping("/listType")
	public TypeList getTypes(){
		return typeService.getTypeList();
	}

	@PostMapping("/addType")
	public boolean addType(@RequestBody @Validated Type type){
		return typeService.add(type);
	}

	@PutMapping(path="/updateType")
	public @Valid Type updateUser(@Valid @RequestBody Type type) {
		return typeRepository.save(type);
	}


	@DeleteMapping("/delete/{id}")
	public boolean deleteType(@PathVariable int id) {

		return typeService.deleteTypeById(id);
	}

}
