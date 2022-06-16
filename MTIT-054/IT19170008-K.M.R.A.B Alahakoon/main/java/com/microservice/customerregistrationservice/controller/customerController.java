package com.microservice.customerregistrationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.customerregistrationservice.exception.ResourceNotFoundException;
import com.microservice.customerregistrationservice.model.Customer;
import com.microservice.customerregistrationservice.repository.customerRepository;


@RestController
@RequestMapping("/api")
public class customerController {
  @Autowired
  private customerRepository customerrepository;
  
  //get Customer 
  @GetMapping("/customers")
  public List<Customer> getAllcustomers(){
	  return customerrepository.findAll();
  }
  
  //create customer API
  @PostMapping("/customers")
  public Customer createCustomer(@Validated  @RequestBody Customer customer) {
	return customerrepository.save(customer);
  }
  
  
  //get employee by ID
  @GetMapping("/customers/{id}")
  public ResponseEntity<Customer> getCustomerById(@PathVariable( value ="id") long customerID) throws ResourceNotFoundException{
	Customer customer =  customerrepository.findById(customerID).orElseThrow(()->new ResourceNotFoundException("Eception"));
	return ResponseEntity.ok().body(customer);
  }
  //update employee
  @PutMapping("/customers/{id}")
  public ResponseEntity<Customer> customerUpdate(@PathVariable( value ="id") long customerID, @RequestBody Customer customerDetail) throws ResourceNotFoundException{
	  Customer customer = customerrepository.findById(customerID).orElseThrow(()->new ResourceNotFoundException("Eception"));
	  
	  customer.setName(customerDetail.getName());
	  customer.setAge(customerDetail.getAge());
	  customer.setGender(customerDetail.getGender()); 
	  
	  customerrepository.save(customer);
	  return ResponseEntity.ok().body(customer);  
  }
  //Delete Mapping 
   @DeleteMapping("/customers/{id}")
   public ResponseEntity<Customer> deleteCutomer(@PathVariable(value="id") long customerID)throws ResourceNotFoundException {
	  
	   customerrepository.deleteById(customerID);
	   
	   return ResponseEntity.ok().build();  
   }
  }
