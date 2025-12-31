package com.paestech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paestech.course.entities.Category;
import com.paestech.course.entities.Order;
import com.paestech.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}

