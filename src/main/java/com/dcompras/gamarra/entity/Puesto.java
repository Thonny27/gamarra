package com.dcompras.gamarra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="puesto")
@Entity
public class Puesto {
	
	@Id
	@GeneratedValue
	@Column(name="idpuesto")
	private int idpuesto;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="numero_puesto")
	private String numero_puesto;
	
	@Column(name="galeria")
	private String galeria;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="categoria")
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

	public Puesto(int idpuesto, String direccion, String numero_puesto, String galeria, String descripcion,
			String categoria) {
		this.idpuesto = idpuesto;
		this.direccion = direccion;
		this.numero_puesto = numero_puesto;
		this.galeria = galeria;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}
	
	public Puesto() {}

}
