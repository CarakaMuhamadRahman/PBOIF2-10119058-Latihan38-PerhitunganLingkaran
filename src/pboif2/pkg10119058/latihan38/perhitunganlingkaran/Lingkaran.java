/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan38.perhitunganlingkaran;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung lingkaran.
 */
public class Lingkaran {
    private double jarijari, luas, keliling;
    public  double diameter;
    private final double PHI = 3.14;
        
    public  double hitungJariJari() {
        jarijari = diameter /2 ;
        return jarijari;
    }
    
    public double hitungLuas() {
        luas = PHI * jarijari * jarijari;
        return luas;
    }
    
    public  double hitungKeliling() {
        keliling = PHI * diameter;
        return keliling;
    }
    
}
