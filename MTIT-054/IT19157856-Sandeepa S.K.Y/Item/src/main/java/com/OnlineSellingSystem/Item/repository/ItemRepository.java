package com.OnlineSellingSystem.Item.repository;

import org.springframework.data.repository.CrudRepository;

import com.OnlineSellingSystem.Item.bean.Item;

public interface ItemRepository extends CrudRepository<Item, String>{

}
