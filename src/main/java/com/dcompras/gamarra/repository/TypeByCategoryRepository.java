package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.TypeByCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface TypeByCategoryRepository extends JpaRepository<TypeByCategory, Serializable> {

    public abstract List<TypeByCategory> findByIdAnAndCategory(int id,int category);
}
