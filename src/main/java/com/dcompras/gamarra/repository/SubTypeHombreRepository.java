package com.dcompras.gamarra.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcompras.gamarra.entity.SubTypeHombre;

@Repository("subTypeHombreRepository")
public interface SubTypeHombreRepository extends JpaRepository<SubTypeHombre, Serializable>{
	
	public abstract List<SubTypeHombre> findById(int id);

}
