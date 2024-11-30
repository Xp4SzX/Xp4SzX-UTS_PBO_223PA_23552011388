package com.mycompany.uts2;

// Inheritance
public class AsuransiJiwa extends JenisAsuransi {
    private String manfaatJiwa;

    public AsuransiJiwa(String namaProduk, String jenisPertanggungan, double premi, String manfaatJiwa) {
        super(namaProduk, jenisPertanggungan, premi);
        this.manfaatJiwa = manfaatJiwa;
    }

    public String getManfaatJiwa() {
        return manfaatJiwa;
    }

    @Override
    public void klaim() {
        System.out.println("Klaim Asuransi Jiwa untuk manfaat: " + manfaatJiwa + " sedang diproses.");
    }

    @Override
    public double hitungPremi() {
        // Perhitungan premi berdasarkan santunan jiwa (contoh: 15% tambahan)
        return super.getPremi() * 1.15;
    }
}
