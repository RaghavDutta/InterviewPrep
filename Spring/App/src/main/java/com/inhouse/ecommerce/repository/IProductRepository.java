package com.inhouse.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inhouse.ecommerce.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{

}
