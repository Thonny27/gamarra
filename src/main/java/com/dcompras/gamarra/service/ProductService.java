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

		ProductRs productRs = new ProductRs();
		List<ProductRs> listProduct= new ArrayList<>();

		for (int i=0;i<brandServiceServiceTest.obtenerListaProduct().size();i++) {

			productRs.setType(brandServiceServiceTest.obtenerType(brandServiceServiceTest.obtenerListaProduct().get(0).getType()));
			productRs.setCategory(brandServiceServiceTest.obtenerCategory(brandServiceServiceTest.obtenerListaProduct().get(0).getCategory()));
			productRs.setTypeClothing(brandServiceServiceTest.obtenerTypeClothing(brandServiceServiceTest.obtenerListaProduct().get(0).getTypeClothing()));
			productRs.setColorList(brandServiceServiceTest.obtenerColorList(brandServiceServiceTest.obtenerListaProduct().get(0).getColorList()));
			productRs.setDescription(brandServiceServiceTest.obtenerListaProduct().get(0).getDescription());
			productRs.setDiscount(brandServiceServiceTest.obtenerListaProduct().get(0).getDiscount());
			productRs.setImageList(brandServiceServiceTest.obtenerListaProduct().get(0).getImageList());
			productRs.setSize(brandServiceServiceTest.obtenerSizeList(brandServiceServiceTest.obtenerListaProduct().get(0).getSize()));
			productRs.setCart(brandServiceServiceTest.obtenerListaProduct().get(0).isCart());
			productRs.setOutfit(brandServiceServiceTest.obtenerListaProduct().get(0).isOutfit());
			productRs.setWishList(brandServiceServiceTest.obtenerListaProduct().get(0).isWishList());
			productRs.setName(brandServiceServiceTest.obtenerListaProduct().get(0).getName());
			productRs.setPriority(brandServiceServiceTest.obtenerListaProduct().get(0).getPriority());
			productRs.setPromotion(brandServiceServiceTest.obtenerListaProduct().get(0).isPromotion());
			productRs.setQuantity(brandServiceServiceTest.obtenerListaProduct().get(0).getQuantity());
			productRs.setRetailPrice(brandServiceServiceTest.obtenerListaProduct().get(0).getRetailPrice());
			productRs.setSubNamePants(brandServiceServiceTest.obtenerListaProduct().get(0).getSubNamePants());
			productRs.setSubNameShirt(brandServiceServiceTest.obtenerListaProduct().get(0).getSubNameShirt());
			productRs.setWholesalePrice(brandServiceServiceTest.obtenerListaProduct().get(0).getWholesalePrice());

			listProduct.add(productRs);
		}
		return listProduct;
	}
}
