
package com.mycompany.uts2;

// Inheritance
public class JenisAsuransi extends LayananAsuransi {
    private String namaProduk;
    private String jenisPertanggungan;
    private double premi;

    public JenisAsuransi(String namaProduk, String jenisPertanggungan, double premi) {
        this.namaProduk = namaProduk;
        this.jenisPertanggungan = jenisPertanggungan;
        this.premi = premi;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getJenisPertanggungan() {
        return jenisPertanggungan;
    }

    public double getPremi() {
        return premi;
    }

    public void setPremi(double premi) {
        this.premi = premi;
    }

    @Override
    public void daftarPolis() {
        System.out.println("Polis untuk produk: " + namaProduk + " berhasil didaftarkan.");
    }

    @Override
    public void klaim() {
        System.out.println("Klaim untuk produk: " + namaProduk + " sedang diproses.");
    }

    @Override
    public double hitungPremi() {
        return premi; // Default premi
    }
}
