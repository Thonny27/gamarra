package com.dcompras.gamarra.converter;

import java.util.ArrayList;
import java.util.List;

import com.dcompras.gamarra.entity.*;
import com.dcompras.gamarra.model.*;
import org.springframework.stereotype.Component;

@Component("converter")
public class Converter {

	public List<MProduct> convertirLista(List<Product> products) {
		List<MProduct> mproductos = new ArrayList<>();
		for (Product product : products) {
			mproductos.add(new MProduct(product));
		}
		return mproductos;
	}

	public List<MTienda> convertirTienda(List<Tienda> tiendas) {
		List<MTienda> mtiendas = new ArrayList<>();
		for (Tienda tienda : tiendas) {
			mtiendas.add(new MTienda(tienda));
		}
		return mtiendas;
	}

	public List<MType> typeConverter(List<Type> types) {
		List<MType> mTypes = new ArrayList<>();
		for (Type type : types) {
			mTypes.add(new MType(type));
		}
		return mTypes;
	}

	public List<MSubTypeHombre> convertirSubTypeHombre(List<SubTypeHombre> subTypeHombres) {
		List<MSubTypeHombre> msubTypeHombres = new ArrayList<>();
		for (SubTypeHombre subTypeHombre : subTypeHombres) {
			msubTypeHombres.add(new MSubTypeHombre(subTypeHombre));
		}
		return msubTypeHombres;
	}

	public List<MCategory> categoryConverter(List<Category> categories) {
		List<MCategory> mCategories = new ArrayList<>();
		for (Category category : categories) {
			mCategories.add(new MCategory(category));
		}
		return mCategories;

	}
}
