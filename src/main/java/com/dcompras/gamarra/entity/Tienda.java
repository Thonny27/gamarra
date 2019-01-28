package com.dcompras.gamarra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tienda")
@Entity
public class Tienda {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@Column(name="direccion")
	private String direccion;
	
	@Column(name="referencia")
	private String referencia;
	
	@Column(name="lt")
	private double lt;
	
	@Column(name="lg")
	private double lg;
	
	@Column(name="galeria")
	private String galeria;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="tipo_ropa")
	private String tipo_ropa;
	
	@Column(name="email")
	private String email;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="telefono")
	private int telefono;
	
	@Column(name="web")
	private String web;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public double getLt() {
		return lt;
	}

	public void setLt(double lt) {
		this.lt = lt;
	}

	public double getLg() {
		return lg;
	}

	public void setLg(double lg) {
		this.lg = lg;
	}

	public String getGaleria() {
		return galeria;
	}

	public void setGaleria(String galeria) {
		this.galeria = galeria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipo_ropa() {
		return tipo_ropa;
	}

	public void setTipo_ropa(String tipo_ropa) {
		this.tipo_ropa = tipo_ropa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Tienda(int id, String direccion, String referencia, double lt, double lg, String galeria,
			String genero, String tipo_ropa, String email, String nombre, int telefono, String web) {
		this.id = id;
		this.direccion = direccion;
		this.referencia = referencia;
		this.lt = lt;
		this.lg = lg;
		this.galeria = galeria;
		this.genero = genero;
		this.tipo_ropa = tipo_ropa;
		this.email = email;
		this.nombre = nombre;
		this.telefono = telefono;
		this.web = web;
	}
	
	public Tienda() {}
	
	
}
