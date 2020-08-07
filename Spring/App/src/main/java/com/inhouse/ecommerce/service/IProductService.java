package com.inhouse.ecommerce.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.inhouse.ecommerce.model.Product;

@Validated
public interface IProductService {
	
	@NotNull Iterable<Product> getAllProducts();
	
	Product getProduct(@Min(value = 1L, message = "Invalid product ID.") Long id);
	
	Product save(Product product);

}