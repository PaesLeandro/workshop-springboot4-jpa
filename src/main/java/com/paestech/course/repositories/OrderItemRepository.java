package com.paestech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paestech.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
