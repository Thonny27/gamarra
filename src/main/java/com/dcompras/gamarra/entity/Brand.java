package com.dcompras.gamarra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="brand")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Brand {

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

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    @Column(name="telephone")
    private String telephone;

    @Column(name="web")
    private String web;

}
