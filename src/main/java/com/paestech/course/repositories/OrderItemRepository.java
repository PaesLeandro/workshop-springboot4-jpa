package com.paestech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paestech.course.entities.OrderItem;
import com.paestech.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
