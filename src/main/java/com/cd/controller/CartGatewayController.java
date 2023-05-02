package com.cd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cd.dto.CartDto;
import com.cd.dto.ProductDto;
import com.cd.exception.NotFoundException;
import com.cd.exception.ServerException;
import com.cd.service.CartGatewayService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/gateway/cart")
public class CartGatewayController {

	@Autowired
	private CartGatewayService cartGatewayService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CartDto> addCart() throws ServerException {
		var cart = cartGatewayService.addCart();
		var location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{cartId})").buildAndExpand(cart.getId()).toUri();
		return ResponseEntity.created(location).body(cart);
	}
	
	@GetMapping(path = "/{cartId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CartDto> getCart(@PathVariable int cartId) throws ServerException, NotFoundException {
		return ResponseEntity.ok(cartGatewayService.getCart(cartId));
	}
	
	@PostMapping(path = "/{cartId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductDto> addToCart(@RequestBody @Valid ProductDto productDto, @PathVariable int cartId) throws ServerException, NotFoundException {
		var product = cartGatewayService.addToCart(cartId, productDto.getId());
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
	
	@DeleteMapping(path = "/{cartId}/{cartProductId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteFromCart(@PathVariable int cartId, @PathVariable int cartProductId) throws ServerException, NotFoundException {
		cartGatewayService.deleteFromCart(cartId, cartProductId);
		return ResponseEntity.noContent().build();
	}
}
