package com.inhouse.ecommerce.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.inhouse.ecommerce.model.Order;

public interface IOrderService {
	
	@NotNull Iterable<Order> getAllOrders();
	
	Order create(@NotNull(message="The order cannot be null") @Valid Order order);
	
	void update(@NotNull(message="The order cannot be null") @Valid Order order);

}
