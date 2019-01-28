package com.dcompras.gamarra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="vendedor")
@Entity
public class Vendedor {

	@Id
	@GeneratedValue
	@Column(name="idvendedor")
	private int idvendedor;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="dni")
	private int dni;
	
	@Column(name="telefono")
	private int telefono;
	
	@Column(name="email")
	private String email;

	public int getIdvendedor() {
		return idvendedor;
	}

	public void setIdvendedor(int idvendedor) {
		this.idvendedor = idvendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Vendedor(int idvendedor, String nombre, String apellido, int dni, int telefono, String email) {
		this.idvendedor = idvendedor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	public Vendedor() {}
}
