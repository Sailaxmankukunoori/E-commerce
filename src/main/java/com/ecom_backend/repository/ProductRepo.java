package com.ecom_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom_backend.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
