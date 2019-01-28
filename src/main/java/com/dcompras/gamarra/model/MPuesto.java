package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Puesto;

public class MPuesto {


	private int idpuesto;
	private String direccion;
	private String numero_puesto;
	private String galeria;
	private String descripcion;
	private String categoria;
	public int getIdpuesto() {
		return idpuesto;
	}
	public void setIdpuesto(int idpuesto) {
		this.idpuesto = idpuesto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumero_puesto() {
		return numero_puesto;
	}
	public void setNumero_puesto(String numero_puesto) {
		this.numero_puesto = numero_puesto;
	}
	public String getGaleria() {
		return galeria;
	}
	public void setGaleria(String galeria) {
		this.galeria = galeria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public MPuesto(int idpuesto, String direccion, String numero_puesto, String galeria, String descripcion,
			String categoria) {
		this.idpuesto = idpuesto;
		this.direccion = direccion;
		this.numero_puesto = numero_puesto;
		this.galeria = galeria;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}
	
	public MPuesto() {}
	
	public MPuesto(Puesto puesto) {
		
		this.idpuesto = puesto.getIdpuesto();
		this.direccion = puesto.getDireccion();
		this.numero_puesto = puesto.getNumero_puesto();
		this.galeria = puesto.getGaleria();
		this.descripcion = puesto.getDescripcion();
		this.categoria = puesto.getCategoria();
	}
}
