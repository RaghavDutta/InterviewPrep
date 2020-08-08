package com.inhouse.ecommerce.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.inhouse.ecommerce.model.OrderProduct;
@Validated
public interface IOrderProductService {
	OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}
