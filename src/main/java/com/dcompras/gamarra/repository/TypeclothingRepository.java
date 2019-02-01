package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.TypeClothing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("typleClothingRepository")
public interface TypeclothingRepository extends JpaRepository<TypeClothing,Serializable> {

    public abstract List<TypeClothing> findById(int id);
}
