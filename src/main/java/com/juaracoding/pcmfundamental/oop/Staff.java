package com.juaracoding.pcmfundamental.oop;

import java.time.LocalDate;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 12/06/2025 20:35
@Last Modified 12/06/2025 20:35
Version 1.0
*/
public class Staff {

    private String nama;
    private String jabatan;
    private Integer gaji;
    private String alamat;
    private String email;
    private LocalDate tanggalLahir;


    public Staff(String nama, String jabatan, Integer gaji, String alamat, String email, LocalDate tanggalLahir) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.alamat = alamat;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public Integer getGaji() {
        return gaji;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }
}
