package com.juaracoding.pcmfundamental.unittest.controller;

import com.juaracoding.pcmfundamental.unittest.model.Product;
import com.juaracoding.pcmfundamental.unittest.service.ProductServices;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 16/06/2025 20:10
@Last Modified 16/06/2025 20:10
Version 1.0
*/
public class ProductController {

    private ProductServices productService = new ProductServices();

    public String save(Product product){
        return productService.insert(product);
    }

    public String update(Long id,Product product){
        return productService.update(id,product);
    }
}
