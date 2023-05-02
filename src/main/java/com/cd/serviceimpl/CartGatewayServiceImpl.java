package com.cd.serviceimpl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cd.dto.CartDto;
import com.cd.dto.ProductDto;
import com.cd.exception.NotFoundException;
import com.cd.exception.ServerException;
import com.cd.proto.AddCartRequest;
import com.cd.proto.AddToCartRequest;
import com.cd.proto.CartServiceGrpc;
import com.cd.proto.CartServiceGrpc.CartServiceBlockingStub;
import com.cd.proto.DeleteFromCartRequest;
import com.cd.proto.GetCartRequest;
import com.cd.proto.ResponseCode;
import com.cd.service.CartGatewayService;
import com.cd.util.ProtoProductTransformer;

import io.grpc.ManagedChannel;

@Service
public class CartGatewayServiceImpl implements CartGatewayService {

	@Autowired
	private ManagedChannel channel;
	
	@Override
	public CartDto addCart() throws ServerException {
		var response = getBlockingStub().addCart(AddCartRequest.newBuilder().build());
		if (response.getResponse().getCode() == ResponseCode.ERROR) {
			throw new ServerException("addCart");
		}
		
		return new CartDto(response.getCartId(), Collections.emptyList());
	}

	@Override
	public CartDto getCart(int id) throws ServerException, NotFoundException {
		var request = GetCartRequest.newBuilder()
				.setCartId(id)
				.build();
		var response = getBlockingStub().getCart(request);
		if (response.getResponse().getCode() == ResponseCode.NOT_FOUND) {
			throw new NotFoundException();
		} else if (response.getResponse().getCode() == ResponseCode.ERROR) {
			throw new ServerException("getCart");
		}
		
		var cartItems = response.getProductsList().stream().map(ProtoProductTransformer::tProductDto).toList();
		return new CartDto(response.getCartId(), cartItems);
	}

	@Override
	public ProductDto addToCart(int cartId, int productId) throws ServerException, NotFoundException {
		var request = AddToCartRequest.newBuilder()
				.setCartId(cartId)
				.setProductId(productId)
				.build();
		
		var response = getBlockingStub().addToCart(request);
		if (response.getResponse().getCode() == ResponseCode.NOT_FOUND) {
			throw new NotFoundException();
		} else if (response.getResponse().getCode() == ResponseCode.ERROR) {
			throw new ServerException("addToCart");
		}
		
		return ProtoProductTransformer.tProductDto(response.getProduct());
	}

	@Override
	public void deleteFromCart(int cartId, int cartProductId) throws ServerException, NotFoundException {
		var request = DeleteFromCartRequest.newBuilder()
				.setCartId(cartId)
				.setCartProductId(cartProductId)
				.build();
		
		var response = getBlockingStub().deleteFromCart(request);
		if (response.getResponse().getCode() == ResponseCode.NOT_FOUND) {
			throw new NotFoundException();
		} else if (response.getResponse().getCode() == ResponseCode.ERROR) {
			throw new ServerException("deleteFromCart");
		}
	}

	private CartServiceBlockingStub getBlockingStub() {
		return CartServiceGrpc.newBlockingStub(channel);
	}
}
