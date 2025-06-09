package com.ecom_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom_backend.model.Product;
import com.ecom_backend.service.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> products=service.getAllProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id){
		return new ResponseEntity<Product>(service.getProductById(id),HttpStatus.OK);
	}
	
	
}
