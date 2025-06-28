package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
