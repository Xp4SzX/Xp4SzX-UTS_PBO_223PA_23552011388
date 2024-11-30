package com.mycompany.uts2;
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
        return super.getPremi() * 1.2;
    }
}
