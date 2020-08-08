package com.inhouse.ecommerce.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inhouse.ecommerce.exception.ResourceNotFoundException;
import com.inhouse.ecommerce.model.Product;
import com.inhouse.ecommerce.repository.IProductRepository;
@Service
@Transactional
public class ProductService implements IProductService {
	
	private IProductRepository productRepository;
	
	public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

	@Override
	public Iterable<Product> getAllProducts() {	
		return this.productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		return this.productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Product not found"));
	}

	@Override
	public Product save(Product product) {
		return this.productRepository.save(product);
	}

}
