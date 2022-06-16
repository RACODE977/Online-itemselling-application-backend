package com.OnlineSellingSystem.order.bean;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {
	
	@Id
	private String orderId;
	private String customerId;
	private String deliverId;
	private String orderDate;
	private String orderShipDate;
	private String houseNo;
	private String shipAddress01;
	private String shipAddress02;
	private String shipCity;
	
	public Order() {
		super();
	}
	
	public Order(String orderId, String customerId, String deliverId, String orderDate, String orderShipDate,
			String houseNo, String shipAddress01, String shipAddress02, String shipCity) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.deliverId = deliverId;
		this.orderDate = orderDate;
		this.orderShipDate = orderShipDate;
		this.houseNo = houseNo;
		this.shipAddress01 = shipAddress01;
		this.shipAddress02 = shipAddress02;
		this.shipCity = shipCity;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDeliverId() {
		return deliverId;
	}
	public void setDeliverId(String deliverId) {
		this.deliverId = deliverId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderShipDate() {
		return orderShipDate;
	}
	public void setOrderShipDate(String orderShipDate) {
		this.orderShipDate = orderShipDate;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getShipAddress01() {
		return shipAddress01;
	}
	public void setShipAddress01(String shipAddress01) {
		this.shipAddress01 = shipAddress01;
	}
	public String getShipAddress02() {
		return shipAddress02;
	}
	public void setShipAddress02(String shipAddress02) {
		this.shipAddress02 = shipAddress02;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	
	
	
	

}
