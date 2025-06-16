package com.juaracoding.pcmfundamental.unittest.service;

import com.juaracoding.pcmfundamental.unittest.core.IService;
import com.juaracoding.pcmfundamental.unittest.model.Product;

import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 16/06/2025 20:07
@Last Modified 16/06/2025 20:07
Version 1.0
*/

/**
 * Platform code : USM
 * Modul Code : 02
 */
public class ProductServices implements IService<Product> {

    @Override
    public String insert(Product product) {
        if(product==null){
            return "Object Null - USM02001";
        }

        return "Data Berhasil Disimpan ";
    }

    @Override
    public String update(Long id, Product product) {
        if(id==null){
            return "Object Null - USM02011";
        }
        if(product==null){
            return "Object Null - USM02012";
        }

        return "Data Berhasil Diubah ";
    }

    @Override
    public String delete(Long id) {
        return "";
    }

    @Override
    public Product find(Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
