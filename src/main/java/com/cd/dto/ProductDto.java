package com.cd.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.Positive;

public class ProductDto {

	@Positive
	private int id;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	private int stock;

	public ProductDto() {
		super();
	}

	public ProductDto(@Positive int id, String name, String description, BigDecimal price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
