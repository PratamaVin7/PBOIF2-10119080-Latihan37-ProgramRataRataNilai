/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Program Rata-Rata Nilai
 */
class RataRataNilaiMahasiswa {
    private static Scanner scanner = new Scanner(System.in);
    private static int i, jumlahMhs;
    private static float jumlah, nilaiMhs, ratarata;
    
    private static int inputJumlahMahasiswa() {
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scanner.nextInt();
        return jumlahMhs;
    }
    
    public static double hitungRataRataNilaiMahasiswa() {
        inputJumlahMahasiswa();
        jumlah = 0;
        i=1;
        while (i <= jumlahMhs){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilaiMhs = scanner.nextFloat ();
                jumlah += nilaiMhs;
                i++;
        }
        ratarata = jumlah / jumlahMhs;
        return ratarata;
    }
    
}