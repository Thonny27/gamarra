package com.dcompras.gamarra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="typeByCategory")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TypeByCategory {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="idCategory")
    private int idCategory;

    @Column(name="nameCategory")
    private String nameCategory;
}
