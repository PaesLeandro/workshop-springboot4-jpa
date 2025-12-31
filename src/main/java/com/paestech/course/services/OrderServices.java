package com.paestech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paestech.course.entities.User;
import com.paestech.course.repositories.UserRepository;


@Service
public class OrderServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long Id) {
		Optional<Order> obj = repository.findById(Id);
		return obj.get();
	}

}
