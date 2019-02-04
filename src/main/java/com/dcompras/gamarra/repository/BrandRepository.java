package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("brandRepository")
public interface BrandRepository extends JpaRepository<Brand, Serializable> {

    public abstract List<Brand> findById(int id);
}
