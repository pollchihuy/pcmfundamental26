package com.juaracoding.pcmfundamental.oop.contohgeneric.product;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 13/06/2025 21:18
@Last Modified 13/06/2025 21:18
Version 1.0
*/
public class ProductController {

    ProductService productService = new ProductService();

    public void insertProduct(Product product) {
        productService.insert(product);
    }

    public void updateProduct(Long id, Product product) {
        productService.update(id,product);
    }
}
