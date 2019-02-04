package com.dcompras.gamarra.model;

import com.dcompras.gamarra.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MType {

	private int id;
	private String name;

	
	public MType(Type type) {
		this.id = type.getId();
		this.name = type.getName();
	}

	
}
