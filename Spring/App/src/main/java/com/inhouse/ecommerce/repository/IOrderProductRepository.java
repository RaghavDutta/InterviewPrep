package com.inhouse.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inhouse.ecommerce.model.OrderProduct;
import com.inhouse.ecommerce.model.OrderProductPK;

public interface IOrderProductRepository extends JpaRepository<OrderProduct, OrderProductPK> {

}
