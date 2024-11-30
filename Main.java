package com.mycompany.uts2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Nasabah> nasabahList = new ArrayList<>();
    private static ArrayList<JenisAsuransi> polisList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Asuransi ===");
            System.out.println("1. Registrasi Nasabah");
            System.out.println("2. Hitung Premi");
            System.out.println("3. Klaim Asuransi");
            System.out.println("4. Laporan Polis");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    registrasiNasabah(scanner);
                    break;
                case 2:
                    hitungPremi();
                    break;
                case 3:
                    klaimAsuransi();
                    break;
                case 4:
                    laporanPolis();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem asuransi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void registrasiNasabah(Scanner scanner) {
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan nama nasabah: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat nasabah: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nomor polis: ");
        String nomorPolis = scanner.nextLine();

        Nasabah nasabah = new Nasabah(nama, alamat, nomorPolis);
        nasabahList.add(nasabah);

        System.out.print("Pilih jenis asuransi (1: Kesehatan, 2: Jiwa): ");
        int jenis = scanner.nextInt();
        if (jenis == 1) {
            polisList.add(new AsuransiKesehatan("Asuransi Kesehatan", "Rawat Inap", 500000, "VIP"));
        } else if (jenis == 2) {
            polisList.add(new AsuransiJiwa("Asuransi Jiwa", "Santunan Jiwa", 1000000, "Manfaat Keluarga"));
        } else {
            System.out.println("Jenis asuransi tidak valid.");
        }

        System.out.println("Nasabah berhasil diregistrasi.");
    }

    private static void hitungPremi() {
        for (JenisAsuransi polis : polisList) {
            System.out.println("Produk: " + polis.getNamaProduk());
            System.out.println("Premi yang harus dibayar: Rp " + polis.hitungPremi());
        }
    }

    private static void klaimAsuransi() {
        for (JenisAsuransi polis : polisList) {
            polis.klaim();
        }
    }

    private static void laporanPolis() {
        System.out.println("\nLaporan Polis:");
        for (int i = 0; i < nasabahList.size(); i++) {
            Nasabah nasabah = nasabahList.get(i);
            JenisAsuransi polis = polisList.get(i);
            System.out.println("Nasabah: " + nasabah.getNama());
            System.out.println("Produk Asuransi: " + polis.getNamaProduk());
            System.out.println("Premi: Rp " + polis.hitungPremi());
            System.out.println("Jenis Pertanggungan: " + polis.getJenisPertanggungan());
        }
    }
}
