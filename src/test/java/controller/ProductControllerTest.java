package controller;

import com.juaracoding.pcmfundamental.unittest.controller.ProductController;
import com.juaracoding.pcmfundamental.unittest.model.Product;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 16/06/2025 20:13
@Last Modified 16/06/2025 20:13
Version 1.0
*/
public class ProductControllerTest {

    public static ProductController productController = new ProductController();

    @Test
    public void save(){
        Product product = new Product();
        product.setMerk("XIOMI");
        product.setModel("SIOMAY");

        String message = productController.save(product);
        Assert.assertEquals(message, "Data Berhasil Disimpan ");
    }

    @Test
    public void update(){
        Long id = 1L;
        Product product = new Product();
        product.setMerk("XIOMI");
        product.setModel("SIOMAY");

        String message = productController.update(id,product);
        Assert.assertEquals(message, "Data Berhasil Diubah ");
    }
}
