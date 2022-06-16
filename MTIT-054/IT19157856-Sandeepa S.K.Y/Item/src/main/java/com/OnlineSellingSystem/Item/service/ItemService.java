package com.OnlineSellingSystem.Item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineSellingSystem.Item.bean.Item;
import com.OnlineSellingSystem.Item.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	public ItemRepository itemRepo;
	
	public List<Item> getAllItems()
	{
		List<Item> items = new ArrayList<>();
		itemRepo.findAll().forEach(items::add);
		return items;
	}

	public void addItem(Item item) {
		itemRepo.save(item);
	}

	public void updateItem(String id, Item item) {
		itemRepo.save(item);
	}

	public void deleteItem(String id) {
		itemRepo.deleteById(id);
		
	}

	
}
