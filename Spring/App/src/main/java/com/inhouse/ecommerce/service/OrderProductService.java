package com.inhouse.ecommerce.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.inhouse.ecommerce.model.OrderProduct;

public class OrderProductService implements IOrderProductService {

	private IOrderProductService orderProductRepository;
	
	public OrderProductService(IOrderProductService orderProductRepository) {
		this.orderProductRepository = orderProductRepository;
	}
	//FIXME: changes in create method
	@Override
	public OrderProduct create(OrderProduct orderProduct) {
		//
		return null;
	}

}
