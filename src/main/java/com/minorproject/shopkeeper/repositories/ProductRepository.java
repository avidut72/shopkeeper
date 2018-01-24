/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minorproject.shopkeeper.repositories;

import com.minorproject.shopkeeper.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Avidut
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    Product findByProductName(String productName);
}
