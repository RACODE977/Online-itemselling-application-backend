package com.payment.payment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.payment.bean.Payment;
import com.payment.payment.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	public PaymentRepository paymentRepo;
	
	public List<Payment> getAllPayments()
	{
		List<Payment> payments = new ArrayList<>();
		paymentRepo.findAll().forEach(payments::add);
		return payments;
	}

	public void addPayment(Payment payment) {
		paymentRepo.save(payment);
	}

	public void updatePayment(String id, Payment payment) {
		paymentRepo.save(payment);
	}

	public void deletePayment(String id) {
		paymentRepo.deleteById(id);
		
	}

}
