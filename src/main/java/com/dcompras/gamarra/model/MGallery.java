package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Gallery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MGallery {

    private int id;
    private String direction;
    private String name;
    private int nro_stands;
    private int nro_flows;
    private double lt;
    private double lg;

    public MGallery(Gallery gallery) {
        this.id=gallery.getId();
        this.direction = gallery.getDirection();
        this.name = gallery.getName();
        this.nro_stands = gallery.getNro_stands();
        this.nro_flows = gallery.getNro_flows();
        this.lt = gallery.getLt();
        this.lg = gallery.getLg();
    }
}
