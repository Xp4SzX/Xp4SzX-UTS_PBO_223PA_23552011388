/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts2;

/**
 *
 * @author MyBook Z Series
 */
// Inheritance
public class AsuransiKesehatan extends JenisAsuransi {
    private String jenisRawatInap;

    public AsuransiKesehatan(String namaProduk, String jenisPertanggungan, double premi, String jenisRawatInap) {
        super(namaProduk, jenisPertanggungan, premi);
        this.jenisRawatInap = jenisRawatInap;
    }

    public String getJenisRawatInap() {
        return jenisRawatInap;
    }

    @Override
    public void klaim() {
        System.out.println("Klaim Asuransi Kesehatan untuk rawat inap: " + jenisRawatInap + " sedang diproses.");
    }

    @Override
    public double hitungPremi() {
        // Perhitungan premi berdasarkan rawat inap (contoh: 20% tambahan)
        return super.getPremi() * 1.2;
    }
}
