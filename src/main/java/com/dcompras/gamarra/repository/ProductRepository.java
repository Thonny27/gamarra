package com.dcompras.gamarra.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcompras.gamarra.entity.Product;

@Repository("repositorio")
public interface ProductRepository extends JpaRepository<Product, Serializable> {

	public abstract List<Product> findByName (String name);
	
	
}