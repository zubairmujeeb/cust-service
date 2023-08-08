package com.customer.customerservice.event;



import com.customer.customerservice.entities.Customer;
import com.customer.customerservice.enums.EventType;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Event {
  private EventType eventType;
  private Customer customer;
  private LocalDateTime timestamp;

}
