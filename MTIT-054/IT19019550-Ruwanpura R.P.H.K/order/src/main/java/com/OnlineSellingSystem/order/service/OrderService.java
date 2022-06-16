package com.OnlineSellingSystem.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineSellingSystem.order.bean.Order;
import com.OnlineSellingSystem.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepo;
	
	public List<Order> getAllOrders()
	{
		List<Order> orders = new ArrayList<>();
		orderRepo.findAll().forEach(orders::add);
		return orders;
	}

	public void addOrder(Order order) {
		orderRepo.save(order);
	}

	public void updateOrder(String order_id, Order order) {
		orderRepo.save(order);
	}

	public void deleteOrder(String order_id) {
		orderRepo.deleteById(order_id);
		
	}

}
