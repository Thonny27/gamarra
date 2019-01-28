package com.dcompras.gamarra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="type")
@Entity
public class Type {
	
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

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getstate() {
		return state;
	}

	public void setstate(int state) {
		this.state = state;
	}

	public Type(int id, String name, int state) {
		this.id = id;
		this.name = name;
		this.state = state;
	}
	
	public Type() {
		
	}
	
	
	

}
