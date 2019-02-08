package com.dcompras.gamarra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="store")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Store {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="address")
    private String address;

    @Column(name="lt")
    private double lt;

    @Column(name="lg")
    private double lg;

    @Column(name="name")
    private String name;

    @Column(name="gender")
    private String gender;

    @Column(name="type")
    private int type;

    @Column(name="email")
    private String email;

    @Column(name="telephone")
    private int telephone;

    @Column(name="urlWeb")
    private String urlWeb;

    @Column(name="products")
    private int products;
}
