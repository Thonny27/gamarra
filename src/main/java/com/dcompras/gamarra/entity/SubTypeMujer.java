package com.dcompras.gamarra.entity;

import javax.persistence.*;

@Table(name="SubTypeMujer")
@Entity
public class SubTypeMujer {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="state")
    private int state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public SubTypeMujer(int id, String name, int state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public SubTypeMujer() {

    }
}
