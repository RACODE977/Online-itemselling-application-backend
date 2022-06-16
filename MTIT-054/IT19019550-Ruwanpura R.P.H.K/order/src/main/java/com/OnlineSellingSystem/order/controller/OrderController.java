package com.OnlineSellingSystem.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineSellingSystem.order.bean.Order;
import com.OnlineSellingSystem.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@RequestMapping("/orders")
	public List<Order> getAllSubjects()
	{
		return orderService.getAllOrders();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/orders/insert")
	public void addOrder(@RequestBody Order order)
	{
		orderService.addOrder(order);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/orders/update/{order_id}")
	public void updateOrder(@PathVariable String order_id, @RequestBody Order order)
	{
		orderService.updateOrder(order_id, order);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/orders/delete/{order_id}")
	public void DeleteOrder(@PathVariable String order_id)
	{
		orderService.deleteOrder(order_id);
	}

}
