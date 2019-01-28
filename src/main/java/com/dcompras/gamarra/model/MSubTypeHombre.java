package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.SubTypeHombre;

public class MSubTypeHombre {

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
	public MSubTypeHombre(int id, String name, int state) {
		this.id = id;
		this.name = name;
		this.state = state;
	}

	public MSubTypeHombre() {

	}

	public MSubTypeHombre(SubTypeHombre subTypeHombre) {
		this.id = subTypeHombre.getId();
		this.name = subTypeHombre.getName();
		this.state = subTypeHombre.getState();
	}


}
