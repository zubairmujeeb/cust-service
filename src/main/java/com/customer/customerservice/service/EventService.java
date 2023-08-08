package com.customer.customerservice.service;

import com.customer.customerservice.event.Event;
import com.customer.customerservice.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
  @Autowired
  private EventRepository eventRepository;

  public Event createEvent(Event event) {
    return eventRepository.save(event);
  }
}

