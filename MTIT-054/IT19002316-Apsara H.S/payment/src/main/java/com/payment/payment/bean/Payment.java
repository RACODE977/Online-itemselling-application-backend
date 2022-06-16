package com.payment.payment.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	
	@Id
	private String id;
	private int invoiceNo;
	private int amount;
	private String paymentType;
	
	
	
	public Payment() {
		super();
	}
	public Payment(String id, int invoiceNo, int amount, String paymentType) {
		super();
		this.id = id;
		this.invoiceNo = invoiceNo;
		this.amount = amount;
		this.paymentType = paymentType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	
	
	
	
}
