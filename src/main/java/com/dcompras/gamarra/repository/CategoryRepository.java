package com.dcompras.gamarra.repository;

import com.dcompras.gamarra.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category,Serializable>{

    public abstract List<Category> findById(int id);
}
