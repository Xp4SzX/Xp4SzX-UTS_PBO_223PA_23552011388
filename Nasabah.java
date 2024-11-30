package com.mycompany.uts2;
// Encapsulation
public class Nasabah {
    private String nama;
    private String alamat;
    private String nomorPolis;

    public Nasabah(String nama, String alamat, String nomorPolis) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorPolis = nomorPolis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorPolis() {
        return nomorPolis;
    }

    public void setNomorPolis(String nomorPolis) {
        this.nomorPolis = nomorPolis;
    }
}
