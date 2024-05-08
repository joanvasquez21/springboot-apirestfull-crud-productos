package com.jov.app.services;

import java.util.List;
import java.util.Optional;

import com.jov.app.entities.Product;

public interface IProductoService {
	
	List<Product> findAll();
	
	Optional<Product> findById(Long id);
	
	Product save(Product product);
	
	Optional<Product> update(Long id, Product product);

	
	Optional<Product> delete(Long id);
	
	
	
}
