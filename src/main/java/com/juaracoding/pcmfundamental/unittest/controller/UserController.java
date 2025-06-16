package com.juaracoding.pcmfundamental.unittest.controller;

import com.juaracoding.pcmfundamental.oop.contohgeneric.user.UserService;
import com.juaracoding.pcmfundamental.unittest.model.User;
import com.juaracoding.pcmfundamental.unittest.service.UserServices;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 16/06/2025 19:20
@Last Modified 16/06/2025 19:20
Version 1.0
*/
public class UserController {

    UserServices userService = new UserServices();

    public String save(User user){
      return userService.insert(user);
    }

    public String update(Long id,User user){
        return userService.update(id,user);
    }

    public String delete(Long id){
        return userService.delete(id);
    }
}
