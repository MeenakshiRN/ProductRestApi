package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductRepository repo;
	
	// get Product details
	@GetMapping("/get")
	public List<Product> getAllProducts() {
		List<Product> products = repo.findAll();
		return products;
	}
	
	@GetMapping("/get?{category_id}")
	public Product getProduct(@PathVariable int category_id) {
		Product product = repo.findById(category_id).get();
		return product;
	}
	
	@PostMapping("/product/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createProduct(@RequestBody Product product) {
		repo.save(product);
	}
	
	@PutMapping("/product/update/{product_id}")
	public Product updateProduct(@PathVariable int product_id) {
		Product product = repo.findById(product_id).get();
		product.setProductName("good shirt");
		repo.save(product);
		return product;
	}
	
	@DeleteMapping("/product/delete/{product_id}")
	public void removeProduct(@PathVariable int product_id) {
		Product product = repo.findById(product_id).get();
		repo.delete(product);
	}

}
