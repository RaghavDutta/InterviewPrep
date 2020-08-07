package com.inhouse.ecommerce.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.inhouse.ecommerce.model.OrderProduct;

public interface IOrderProductService {
	OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}
