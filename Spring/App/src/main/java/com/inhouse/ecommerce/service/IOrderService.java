package com.inhouse.ecommerce.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.inhouse.ecommerce.model.Order;

@Validated
public interface IOrderService {
	
	@NotNull Iterable<Order> getAllOrders();
	
	Order create(@NotNull(message="The order cannot be null") @Valid Order order);
	
	void update(@NotNull(message="The order cannot be null") @Valid Order order);

}
