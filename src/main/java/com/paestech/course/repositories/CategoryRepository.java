package com.paestech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paestech.course.entities.Category;
import com.paestech.course.entities.Order;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}

