package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.Brand;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("brandServiceRepositoryTest")
public interface BrandServiceRepositoryTest extends JpaRepository<Brand, Serializable> {

    public abstract Brand findById(int id);
}
