package com.dcompras.gamarra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcompras.gamarra.entity.Tienda;
import com.dcompras.gamarra.model.MTienda;
import com.dcompras.gamarra.service.TiendaService;

@RestController
@RequestMapping("/gamarra")
public class TiendaController {

	@Autowired
	@Qualifier("tiendaServicio")
	private TiendaService tiendaService;
	
	@PostMapping("/agregarTienda")
	public boolean agregarTienda(@RequestBody @Validated Tienda tienda) {
		return tiendaService.crear(tienda);
	}
	
	@GetMapping("listarTiendas")
	public List<MTienda> listarTiendas(){
		return tiendaService.obtener();
	}
}
