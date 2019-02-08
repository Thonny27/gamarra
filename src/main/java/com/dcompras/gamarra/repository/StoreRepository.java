package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Serializable> {

    public abstract List<Store> findById(int id);
}
