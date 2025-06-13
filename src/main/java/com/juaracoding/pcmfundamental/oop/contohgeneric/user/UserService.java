package com.juaracoding.pcmfundamental.oop.contohgeneric.user;

import com.juaracoding.pcmfundamental.oop.contohgeneric.IService;

import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 13/06/2025 20:50
@Last Modified 13/06/2025 20:50
Version 1.0
*/

/**
 * Platform Code : USM
 * Modul Code : 01
 */
public class UserService implements IService<User> {

    @Override
    public void insert(User user) {
        //USM01005
    }

    @Override
    public void update(Long id, User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
