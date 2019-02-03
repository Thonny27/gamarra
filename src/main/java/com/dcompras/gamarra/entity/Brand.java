package com.dcompras.gamarra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "brand")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Brand {

    @Id
    @GeneratedValue
    private int id;

    private String address;
    private double lt;
    private double lg;
    private String email;
    private String name;
    private String telephone;
    private String web;

}
