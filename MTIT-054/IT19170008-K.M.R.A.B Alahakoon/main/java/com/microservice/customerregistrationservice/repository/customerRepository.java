package com.microservice.customerregistrationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.customerregistrationservice.model.Customer;

@Repository
public interface customerRepository extends JpaRepository<Customer, Long> {

}
