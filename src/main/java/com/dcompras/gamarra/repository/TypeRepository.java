package com.dcompras.gamarra.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcompras.gamarra.entity.Type;

@Repository("typeRepository")
public interface TypeRepository extends JpaRepository<Type, Serializable> {
	
	public abstract List<Type> findById (int id);
	

}
