/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minorproject.shopkeeper.services;

import com.minorproject.shopkeeper.ProductDTO;
import java.util.List;

/**
 *
 * @author Avidut
 */

public interface ProductService {
    List<ProductDTO> findAllProduct();
    List<String> findAllProductNames();
}
