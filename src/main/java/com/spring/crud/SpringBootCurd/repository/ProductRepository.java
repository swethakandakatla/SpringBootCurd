package com.spring.crud.SpringBootCurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.SpringBootCurd.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByName(String name);
}
