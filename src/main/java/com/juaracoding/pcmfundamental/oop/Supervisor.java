package com.juaracoding.pcmfundamental.oop;

import java.time.LocalDate;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 12/06/2025 20:36
@Last Modified 12/06/2025 20:36
Version 1.0
*/

public class Supervisor{

    Double tunjanganJabatan;

    public static void main(String[] args) {
        ConfigDB configDB= new ConfigDB("paul","Paul@1234","jdbc:mssql:localhost:1433;databasename=BEB26");
        System.out.println(configDB.getUsername());
        System.out.println(configDB.getPassword());
        System.out.println(configDB.getConnectionURL());
        
        
    }

}
