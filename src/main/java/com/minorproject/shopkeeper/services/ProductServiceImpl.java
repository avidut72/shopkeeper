/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minorproject.shopkeeper.services;

import com.minorproject.shopkeeper.ProductDTO;
import com.minorproject.shopkeeper.entities.Product;
import com.minorproject.shopkeeper.repositories.ProductRepository;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Avidut
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAllProduct() {
        List<Product> productList=productRepository.findAll();
        return productList
                .stream()
                .map(productDTOConverter)
                .collect(Collectors.toList());
    }
    private Function<Product,ProductDTO> productDTOConverter=(d->{
            ProductDTO dto=new ProductDTO();
            dto.setProductId(d.getProductId());
            dto.setProductName(d.getProductName());
            dto.setQuantity(d.getQuantity());
            dto.setRate(d.getRate());
            return dto;
            });

    @Override
    public List<String> findAllProductNames() {
        return productRepository.findAll()
                .stream()
                .map(p->p.getProductName())
                .collect(Collectors.toList());
    }
    
}
