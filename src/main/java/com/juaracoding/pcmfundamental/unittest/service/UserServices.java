package com.juaracoding.pcmfundamental.unittest.service;

import com.juaracoding.pcmfundamental.unittest.core.IService;
import com.juaracoding.pcmfundamental.unittest.model.User;

import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 16/06/2025 19:19
@Last Modified 16/06/2025 19:19
Version 1.0
*/

/**
 * Platform code : USM
 * Modul Code : 01
 */
public class UserServices implements IService<User> {

    @Override
    public String insert(User user) {
        if(user==null){
            return "Object Null - USM01001";
        }
        String email = user.getEmail()==null?"":user.getEmail();
        if(email.equals("") ){
            return "Email Empty - USM01002";
        }
        if(user.getEmail() == null){
            return "Email Null - USM01003";
        }
        return "Data Berhasil Disimpan ";
    }

    @Override
    public String update(Long id, User user) {
        if(id==null){
            return "Object Null - USM01011";
        }
        if(user==null){
            return "Object Null - USM01012";
        }
        String email = user.getEmail()==null?"":user.getEmail();
        if(email.equals("") ){
            return "Email Empty - USM01013";
        }
        if(user.getEmail() == null){
            return "Email Null - USM01014";
        }

        return "Data Berhasil Diubah ";
    }

    @Override
    public String delete(Long id) {
        if(id==null){
            return "Object Null - USM01021";
        }

        return "Data Berhasil Dihapus ";
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
