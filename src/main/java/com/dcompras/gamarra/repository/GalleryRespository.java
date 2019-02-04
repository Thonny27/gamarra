package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("galleryRepository")
public interface GalleryRespository extends JpaRepository<Gallery, Serializable> {

    public abstract List<Gallery> findById(int id);
    public abstract List<Gallery> findByName(String name);
}
