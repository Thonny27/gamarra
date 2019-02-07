package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("sizeRepository")
public interface SizeRepository extends JpaRepository<Size, Serializable> {

    public abstract List<Size> findById(int id);

}
