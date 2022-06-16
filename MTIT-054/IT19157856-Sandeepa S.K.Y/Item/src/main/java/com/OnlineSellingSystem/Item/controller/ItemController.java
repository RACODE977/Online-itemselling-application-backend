package com.OnlineSellingSystem.Item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineSellingSystem.Item.bean.Item;
import com.OnlineSellingSystem.Item.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/items")
	public List<Item> getAllItems()
	{
		return itemService.getAllItems();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/items")
	public void addItem(@RequestBody Item item)
	{
		itemService.addItem(item);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/items/{id}")
	public void updateItem(@PathVariable String id, @RequestBody Item item)
	{
		itemService.updateItem(id, item);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/items/{id}")
	public void DeleteItem(@PathVariable String id)
	{
		itemService.deleteItem(id);
	}
	
}
