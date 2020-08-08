package com.inhouse.ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inhouse.ecommerce.model.OrderProduct;
import com.inhouse.ecommerce.repository.IOrderProductRepository;

@Service
@Transactional
public class OrderProductService implements IOrderProductService {

	private IOrderProductRepository orderProductRepository;

	public OrderProductService(IOrderProductRepository orderProductRepository) {
		this.orderProductRepository = orderProductRepository;
	}
	@Override
	public OrderProduct create(OrderProduct orderProduct) {
		return this.orderProductRepository.save(orderProduct);
	}

}
