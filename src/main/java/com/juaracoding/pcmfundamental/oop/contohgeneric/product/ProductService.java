package com.juaracoding.pcmfundamental.oop.contohgeneric.product;

import com.juaracoding.pcmfundamental.oop.contohgeneric.IReport;
import com.juaracoding.pcmfundamental.oop.contohgeneric.IService;

import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 13/06/2025 20:52
@Last Modified 13/06/2025 20:52
Version 1.0
*/
/**
 * Platform Code : USM
 * Modul Code : 02
 */
public class ProductService implements IService<Product> ,IReport{

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Long id, Product product) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Product find(Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public void uploadFile() {

    }

    @Override
    public void downloadFileExcel() {

    }

    @Override
    public void downloadFilePDF() {

    }
}