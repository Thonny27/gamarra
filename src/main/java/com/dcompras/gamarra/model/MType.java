package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Type;

public class MType {

	private int id;
	private String name;
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
	public MType(int id, String name, int state) {
		this.id = id;
		this.name = name;
		this.state = state;
	}
	
	public MType(Type type) {
		this.id = type.getId();
		this.name = type.getname();
		this.state = type.getstate();
	}
	
	public MType() {
		
	}
	
}
