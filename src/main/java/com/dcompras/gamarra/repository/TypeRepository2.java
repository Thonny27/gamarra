package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("typeRepository2")
public interface TypeRepository2 extends JpaRepository<Type, Serializable> {

}
