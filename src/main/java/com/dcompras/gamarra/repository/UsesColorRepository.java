package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.UsesColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("usesColorRepository")
public interface UsesColorRepository extends JpaRepository<UsesColor, Serializable> {

    public abstract List<UsesColor> findById(int id);
}
