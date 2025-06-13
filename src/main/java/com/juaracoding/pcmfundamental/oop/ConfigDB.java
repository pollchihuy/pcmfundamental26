package com.juaracoding.pcmfundamental.oop;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 13/06/2025 19:11
@Last Modified 13/06/2025 19:11
Version 1.0
*/
public class ConfigDB {
    
    private String username;
    private String password;
    private String connectionURL;

    public ConfigDB(String username, String password, String connectionURL) {
        this.username = username;
        this.password = password;
        this.connectionURL = connectionURL;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConnectionURL() {
        return connectionURL;
    }
}
