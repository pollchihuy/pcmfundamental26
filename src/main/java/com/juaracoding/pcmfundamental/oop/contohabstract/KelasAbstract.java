package com.juaracoding.pcmfundamental.oop.contohabstract;

public abstract class KelasAbstract {

    private String nama;

    public void panggilNama(String nama) {
        this.nama = nama;
        System.out.println(nama);
    }
    public String getNama() {
        return nama;
    }

    public abstract void isiDahTerserah();
}
