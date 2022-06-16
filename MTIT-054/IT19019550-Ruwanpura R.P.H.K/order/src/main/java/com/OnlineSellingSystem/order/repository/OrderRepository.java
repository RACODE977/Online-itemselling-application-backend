package com.OnlineSellingSystem.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.OnlineSellingSystem.order.bean.Order;

public interface OrderRepository extends CrudRepository<Order, String>{

}
