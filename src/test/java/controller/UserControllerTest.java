package controller;

import com.juaracoding.pcmfundamental.unittest.controller.UserController;
import com.juaracoding.pcmfundamental.unittest.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 16/06/2025 19:27
@Last Modified 16/06/2025 19:27
Version 1.0
*/
public class UserControllerTest {

    private static UserController userController = new UserController();

    @Test(priority = 1)
    public void save(){
        User u = new User();
        u.setAlamat("BogorBogorBogor");
        u.setNama("Paul");
        u.setEmail("paul@gmail.com");
        u.setJenisKelamin("Pria");
        String message = userController.save(u);
        /**
         * Expectation
         * Assertion
         */
        Assert.assertEquals(message, "Data Berhasil Disimpan ");
    }

    //SDLC
    //STLC
    @Test(priority = 5)
    public void findAll(){

    }
    @Test(priority = 10)
    public void update(){
        Long id = 1L;
        User u = new User();
        u.setAlamat("BogorBogorBogor");
        u.setNama("Paul");
        u.setEmail("paul@gmail.com");
        u.setJenisKelamin("Pria");
        String message = userController.update(id,u);
        /**
         * Expectation
         * Assertion
         */
        Assert.assertEquals(message, "Data Berhasil Diubah ");
    }

    @Test(priority = 20)
    public void delete(){
        Long id = 1L;
        String message = userController.delete(id);
        /**
         * Expectation
         * Assertion
         */
        Assert.assertEquals(message, "Data Berhasil Dihapus ");
    }

}
