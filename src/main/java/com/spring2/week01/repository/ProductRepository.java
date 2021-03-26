package com.spring2.week01.repository;

import com.spring2.week01.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {
}