package com.dcompras.gamarra.model;

import java.util.List;


public class Response2 {

    private List<MSubTypeHombre> listSubTypeHombre;

    public Response2(List<MSubTypeHombre> listSubTypeHombre) {
        this.listSubTypeHombre = listSubTypeHombre;
    }

    public List<MSubTypeHombre> getlistSubTypeHombre() {
        return listSubTypeHombre;
    }

    public void setlistSubTypeHombre(List<MSubTypeHombre> listSubTypeHombre) {
        this.listSubTypeHombre = listSubTypeHombre;
    }
}
