package com.cd.util;

import java.math.BigDecimal;

import com.cd.dto.ProductDto;
import com.cd.proto.Product;

public class ProtoProductTransformer {

	private ProtoProductTransformer() {}
	
	public static ProductDto tProductDto(Product product) {
		if (product == null) {
			return null;
		}
		
		return new ProductDto(product.getId(), 
				product.getName(), 
				product.getDescription(), 
				BigDecimal.valueOf(product.getPrice()), 
				product.getStock());
	}
}
