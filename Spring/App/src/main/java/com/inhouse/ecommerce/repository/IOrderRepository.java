package com.inhouse.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inhouse.ecommerce.model.Order;

public interface IOrderRepository extends JpaRepository<Order, Long>{

}
