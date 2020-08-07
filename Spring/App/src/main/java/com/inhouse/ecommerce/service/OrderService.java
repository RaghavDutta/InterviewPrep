package com.inhouse.ecommerce.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inhouse.ecommerce.model.Order;
import com.inhouse.ecommerce.repository.IOrderRepository;

@Service
@Transactional
public class OrderService implements IOrderService {

	private IOrderRepository orderRepository;

	public OrderService(IOrderRepository orderRepository) {
		this.orderRepository=orderRepository;
	}

	@Override
	public Iterable<Order> getAllOrders() {
		return this.orderRepository.findAll();
	}

	@Override
	public Order create(Order order) {
		 order.setDateCreated(LocalDate.now());
		 return this.orderRepository.save(order);
	}

	@Override
	public void update(Order order) {
		this.orderRepository.save(order);
	}

}
