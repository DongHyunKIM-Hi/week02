package com.spring2.week01.repository;

import com.spring2.week01.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product,Long> {
List<Product> findAllByUserId(Long id);
}