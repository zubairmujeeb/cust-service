package com.customer.customerservice.repository;

import com.customer.customerservice.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}

