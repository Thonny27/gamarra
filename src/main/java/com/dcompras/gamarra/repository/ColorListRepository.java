package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.ColorList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("colorListRepository")
public interface ColorListRepository extends JpaRepository<ColorList, Serializable> {

    public abstract List<ColorList> findById(int id);
}
