package com.theboy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theboy.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
