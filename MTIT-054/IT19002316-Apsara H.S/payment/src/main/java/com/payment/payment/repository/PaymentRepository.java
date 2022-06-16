package com.payment.payment.repository;

import org.springframework.data.repository.CrudRepository;

import com.payment.payment.bean.Payment;

public interface PaymentRepository extends CrudRepository<Payment, String> {

}
