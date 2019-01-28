package com.dcompras.gamarra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="gallery")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Gallery {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="direction")
    private String direction;

    @Column(name="name")
    private String name;

    @Column(name="nro_stands")
    private int nro_stands;

    @Column(name="nro_flows")
    private int nro_flows;

    @Column(name="lt")
    private double lt;

    @Column(name="lg")
    private double lg;


}
