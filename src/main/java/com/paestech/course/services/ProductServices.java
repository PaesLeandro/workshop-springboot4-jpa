package com.paestech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paestech.course.entities.Product;
import com.paestech.course.repositories.ProductRepository;


@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional<Product> obj = repository.findById(Id);
		return obj.get();
	}

}
