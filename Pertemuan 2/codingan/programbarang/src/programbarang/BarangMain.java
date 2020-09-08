/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programbarang;

/**
 *
 * @author ASUS
 */
public class BarangMain {
   public static void main(String[] args) {
        Barang b1 = new Barang();
        Barang b2 = new Barang();
        
        b1.kode = "101";
        b1.namaBarang = "Mobil Honda Hrv";
        b1.hargaDasar = 350000000;
        b1.diskon = 5;
        b1.tampilData();
        
        b2.kode = "102";
        b2.namaBarang = "Tshirt zara";
        b2.hargaDasar = 250000;
        b2.diskon = 25;
        b2.tampilData();
    }
} 

