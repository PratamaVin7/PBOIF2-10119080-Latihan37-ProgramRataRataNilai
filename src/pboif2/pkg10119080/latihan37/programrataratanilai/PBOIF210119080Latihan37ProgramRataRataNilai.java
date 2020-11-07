/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan37.programrataratanilai;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Program Rata-Rata Nilai
 */
public class PBOIF210119080Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RataRataNilaiMahasiswa nilaiMhs = new RataRataNilaiMahasiswa();
        double ratarata = nilaiMhs.hitungRataRataNilaiMahasiswa();
        System.out.println("\nMaka, Rata-rata Nilainya adalah: "+ratarata);
        System.out.println("Developed by : Kevin Pratama Sinaga");
    }
    
}