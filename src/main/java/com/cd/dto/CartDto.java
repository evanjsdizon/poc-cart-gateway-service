package com.cd.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class CartDto {

	@PositiveOrZero
	private int id;
	
	@NotNull
	private List<ProductDto> items;

	public CartDto() {
		super();
	}

	public CartDto(@PositiveOrZero int id) {
		super();
		this.id = id;
	}

	public CartDto(@PositiveOrZero int id, @NotNull List<ProductDto> items) {
		super();
		this.id = id;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ProductDto> getItems() {
		return items;
	}

	public void setItems(List<ProductDto> items) {
		this.items = items;
	}
}
