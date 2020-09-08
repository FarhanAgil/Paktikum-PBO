/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjaman;

/**
 *
 * @author ASUS
 */
public class Peminjaman {
 public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int bayar;
    public int transaksi;
    
    public void hasilPeminjaman(int a, String b, String c, int d){
        id = a;
        namaMember = b;
        namaGame = c;
        harga = d;
        
        System.out.println("Id : " + id);
        System.out.println("Nama Member : " + namaMember);        
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Harga : " + harga);
    }
    
    public int hargaBayar(int d, int e){
        transaksi = d;
        harga = e;
        bayar = transaksi * harga;
        
        System.out.println("Berapa kali transaksi : " + transaksi);
        System.out.println("Harga : " + harga);
        System.out.println();
        System.out.println("Harga yang harus dibayar : " + bayar);
        
        return bayar;
    }
}