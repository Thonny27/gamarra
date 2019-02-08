package com.dcompras.gamarra.service;

import java.util.ArrayList;
import java.util.List;

import com.dcompras.gamarra.dto.BrandRs;
import com.dcompras.gamarra.dto.ProductRs;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.dcompras.gamarra.converter.Converter;
import com.dcompras.gamarra.entity.Product;
import com.dcompras.gamarra.model.MProduct;
import com.dcompras.gamarra.repository.ProductRepository;


@Service("servicio")
public class ProductService {

	private static final Log logger = org.apache.commons.logging.LogFactory.getLog(ProductService.class); //logger

	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;

	@Autowired
	@Qualifier("brandServiceServiceTest")
	private BrandServiceServiceTest brandServiceServiceTest;

	@Autowired
	@Qualifier("convertidor")
	private Converter converter;

	public boolean crear(Product product) {
		logger.info("CREANDO PRODUCTO");
		try {

			productRepository.save(product);
			logger.info("PRODUCTO CREADO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR EL PRODUCTO");
		}
		return false;
	}

	public List<MProduct> obtener(){
		logger.info("LISTANDO TODOS LOS PRODUCTOS");
		return converter.convertirLista(productRepository.findAll());
	}

	public List<ProductRs> getProductRs(){


		List<ProductRs> listProduct= new ArrayList<>();


		for(Product  b : brandServiceServiceTest.obtenerListaProduct()) {

			ProductRs productRs = new ProductRs();
			productRs.setId(b.getId());
			productRs.setType(brandServiceServiceTest.obtenerType(b.getType()));
			productRs.setCategory(brandServiceServiceTest.obtenerCategory(b.getCategory()));
			productRs.setTypeClothing(brandServiceServiceTest.obtenerTypeClothing(b.getTypeClothing()));
			productRs.setColorList(brandServiceServiceTest.obtenerColorList(b.getColorList()));
			productRs.setDescription(b.getDescription());
			productRs.setDiscount(b.getDiscount());
			productRs.setImageList(b.getImageList());
			productRs.setSize(brandServiceServiceTest.obtenerSizeList(b.getSize()));
			productRs.setCart(b.isCart());
			productRs.setOutfit(b.isOutfit());
			productRs.setWishList(b.isWishList());
			productRs.setName(b.getName());
			productRs.setPriority(b.getPriority());
			productRs.setPromotion(b.isPromotion());
			productRs.setQuantity(b.getQuantity());
			productRs.setRetailPrice(b.getRetailPrice());
			productRs.setSubNamePants(b.getSubNamePants());
			productRs.setSubNameShirt(b.getSubNameShirt());
			productRs.setWholesalePrice(b.getWholesalePrice());


			listProduct.add(productRs);
		}

		return listProduct;
	}
}
