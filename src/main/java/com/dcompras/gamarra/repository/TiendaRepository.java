package com.dcompras.gamarra.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcompras.gamarra.entity.Tienda;

@Repository("tiendaRepository")
public interface TiendaRepository extends JpaRepository<Tienda, Serializable> {
	
	public abstract List<Tienda> findByGaleria(String galeria);



}
