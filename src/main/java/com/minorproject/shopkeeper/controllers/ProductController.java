/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minorproject.shopkeeper.controllers;

import com.minorproject.shopkeeper.entities.Product;
import com.minorproject.shopkeeper.repositories.ProductRepository;
import com.minorproject.shopkeeper.services.ProductService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Avidut
 */
@RestController
@Transactional
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;
    
    @PostMapping("/products")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
       productRepository.save(product);
       return ResponseEntity.ok("saved");
    }
    
    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(productService.findAllProduct());
    }
    
    @GetMapping("/products/name")
    public ResponseEntity<?> getAllProductsName(){
        return ResponseEntity.ok(productService.findAllProductNames());
    }
    
    @PutMapping("/products")
    public ResponseEntity<?> updateProduct(@RequestParam Long productId,@RequestBody Product product){
        Product oldProduct=productRepository.findOne(productId);
        oldProduct.setProductName(product.getProductName());
        return ResponseEntity.ok("product saved");
    }
    
    @DeleteMapping("/products")
    public ResponseEntity<?> deleteProduct(@RequestParam Long productId){
        productRepository.delete(productId);
        return ResponseEntity.ok("Product Deleted Successfully");
    }
    
}
