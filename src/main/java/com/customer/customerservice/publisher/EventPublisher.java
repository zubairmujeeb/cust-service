package com.customer.customerservice.publisher;

import com.customer.customerservice.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
  @Autowired
  private KafkaTemplate<String, Event> kafkaTemplate;

  public void publishEvent(Event event) {
    kafkaTemplate.send("events", event);
  }
}

