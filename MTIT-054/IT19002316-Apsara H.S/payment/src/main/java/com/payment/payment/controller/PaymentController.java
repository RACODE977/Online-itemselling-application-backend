package com.payment.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.payment.payment.bean.Payment;
import com.payment.payment.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;

	@RequestMapping("/payments")
	public List<Payment> getAllPayments()
	{
		return paymentService.getAllPayments();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/payments")
	public void addPayment(@RequestBody Payment payment)
	{
		paymentService.addPayment(payment);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/payments/{id}")
	public void updatePayment(@PathVariable String id, @RequestBody Payment payment)
	{
		paymentService.updatePayment(id, payment);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/payments/{id}")
	public void DeletePayment(@PathVariable String id)
	{
		paymentService.deletePayment(id);
	}
	
}
