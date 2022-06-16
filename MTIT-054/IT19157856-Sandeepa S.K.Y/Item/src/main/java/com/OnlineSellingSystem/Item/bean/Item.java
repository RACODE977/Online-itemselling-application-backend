package com.OnlineSellingSystem.Item.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {
	
	@Id
	private String ID;
	private String name;
	private int qty;
	
	
	
	public Item() {
		super();
	}
	public Item(String iD, String name, int qty) {
		super();
		ID = iD;
		this.name = name;
		this.qty = qty;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
