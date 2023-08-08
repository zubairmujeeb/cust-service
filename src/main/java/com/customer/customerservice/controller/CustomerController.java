package com.customer.customerservice.controller;

import com.customer.customerservice.entities.Customer;
import com.customer.customerservice.enums.EventType;
import com.customer.customerservice.event.Event;
import com.customer.customerservice.publisher.EventPublisher;
import com.customer.customerservice.service.CustomerService;
import jakarta.validation.Valid;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
  @Autowired
  private CustomerService customerService;
  @Autowired
  private EventPublisher eventPublisher;

  @PostMapping
  public ResponseEntity<Customer> createCustomer(@RequestBody @Valid Customer customer) {
    Customer createdCustomer = customerService.createCustomer(customer);

    Event event = new Event();
    event.setEventType(EventType.CUSTOMER_CREATED);
    event.setCustomer(createdCustomer);
    event.setTimestamp(LocalDateTime.now());

    eventPublisher.publishEvent(event);

    return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody @Valid Customer customer) {
    Customer updatedCustomer = customerService.updateCustomer(customer);

    Event event = new Event();
    event.setEventType(EventType.CUSTOMER_UPDATED);
    event.setCustomer(updatedCustomer);
    event.setTimestamp(LocalDateTime.now());

    eventPublisher.publishEvent(event);

    return ResponseEntity.ok(updatedCustomer);
  }



}

