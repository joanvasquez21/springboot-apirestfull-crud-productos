package com.jov.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jov.app.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
