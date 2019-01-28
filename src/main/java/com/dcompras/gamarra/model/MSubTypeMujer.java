package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.SubTypeHombre;

public class MSubTypeMujer {

    private int id;
    private String name;
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
    public MSubTypeMujer(int id, String name, int state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public MSubTypeMujer() {

    }

    public MSubTypeMujer(MSubTypeMujer subTypeMujer) {
        this.id = subTypeMujer.getId();
        this.name = subTypeMujer.getName();
        this.state = subTypeMujer.getState();
    }
}
