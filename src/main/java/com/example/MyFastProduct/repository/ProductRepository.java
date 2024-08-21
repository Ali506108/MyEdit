package com.example.MyFastProduct.repository;

import com.example.MyFastProduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long> {

}
