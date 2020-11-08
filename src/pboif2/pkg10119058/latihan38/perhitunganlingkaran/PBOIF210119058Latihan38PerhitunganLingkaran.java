/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung lingkaran.
 */
public class PBOIF210119058Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        
          System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) {
            try {
                lingkaran.diameter = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        double jarijari = lingkaran.hitungJariJari();
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari - jari Lingkaran = " + jarijari + " cm ");
        System.out.println("Luas Lingkaran = " + luas + " cm ");
        System.out.println("Keliling lingkaran = " + keliling + " cm ");
    }
    
}
    
    

