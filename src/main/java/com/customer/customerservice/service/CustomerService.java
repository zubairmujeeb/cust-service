package com.customer.customerservice.service;

import com.customer.customerservice.entities.Customer;
import com.customer.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  @Autowired
  private CustomerRepository customerRepository;

  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public Customer updateCustomer(Customer customer) {
    return customerRepository.save(customer);
  }
}

