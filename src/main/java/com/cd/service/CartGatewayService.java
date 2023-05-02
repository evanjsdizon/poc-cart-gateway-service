package com.cd.service;

import com.cd.dto.CartDto;
import com.cd.dto.ProductDto;
import com.cd.exception.NotFoundException;
import com.cd.exception.ServerException;

public interface CartGatewayService {

	CartDto addCart() throws ServerException;
	
	CartDto getCart(int id) throws ServerException, NotFoundException;
	
	ProductDto addToCart(int cartId, int productId) throws ServerException, NotFoundException;
	
	void deleteFromCart(int cartId, int cartProductId) throws ServerException, NotFoundException;
}
