/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176015.latihan21.programratanilai;

/**
 *
 * @author Asus
 * NAMA     : Natasya Adillah
 * KELAS    : PBO 06
 * NIM      : 23176015
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menghitung rata-rata nilai dari 
 * sejumlah mahasiswa berdasarkan nilai yang dimasukkan oleh pengguna.
 */import java.util.Scanner;
public class SI_RegPagi23176015Latihan21ProgramRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int totalNilai = 0;
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by: Rizki Adam Kurniawan");

        scanner.close();
    }
}
