/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjaman;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PeminjamanMain {
    public static void main(String[] args) {
        Peminjaman pinjam = new Peminjaman();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
            
        System.out.print("Masukkan id : ");
        pinjam.id = sc.nextInt();
        System.out.print("Masukkan nama member : ");
        pinjam.namaMember = s.nextLine();
        System.out.print("Masukkan nama game : ");
        pinjam.namaGame = s.nextLine();
        System.out.print("Masukkan harga : ");
        pinjam.harga = sc.nextInt();      
        System.out.print("Berapa kali transaksi : ");
        pinjam.transaksi = sc.nextInt();
        
        
        System.out.println();
        System.out.println("HASIL PEMINJAMAN");
        pinjam.hasilPeminjaman(pinjam.id, pinjam.namaGame, 
                    pinjam.namaGame, pinjam.harga);
        
        System.out.println();
        System.out.println("HARGA YANG HARUS DI BAYAR");
        pinjam.hargaBayar(pinjam.transaksi, pinjam.harga);
        
    }
}

