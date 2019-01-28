package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Vendedor;

public class MVendedor {


	private int idvendedor;
	private String nombre;
	private String apellido;
	private int dni;
	private int telefono;
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
	public MVendedor(int idvendedor, String nombre, String apellido, int dni, int telefono, String email) {
		this.idvendedor = idvendedor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
	}
	
	public MVendedor() {}
	
	public MVendedor(Vendedor vendedor) {
		
		this.idvendedor=vendedor.getIdvendedor();
		this.nombre=vendedor.getNombre();
		this.apellido=vendedor.getApellido();
		this.dni=vendedor.getDni();
		this.telefono=vendedor.getTelefono();
		this.email=vendedor.getEmail();
		
	}
	
	
	
	
}
