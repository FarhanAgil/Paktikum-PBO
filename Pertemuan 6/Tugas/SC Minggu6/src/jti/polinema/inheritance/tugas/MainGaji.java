/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.inheritance.tugas;

/**
 *
 * @author ASUS
 */
public class MainGaji {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("1", "Farhan", "Malang");
        Dosen d2 = new Dosen("2", "Sela", "Mojokerto");
        Dosen d3 = new Dosen("3", "Hendri", "Mojokerto");
        
        d1.tarif_SKS = 10000;
        d2.tarif_SKS = 20000;
        d3.tarif_SKS = 10000;
        d1.setSKS(28);
        d2.setSKS(20);
        d3.setSKS(24);
        
        DaftarGaji g = new DaftarGaji(3);
        g.addPegawai(d1);
        g.addPegawai(d2);
        g.addPegawai(d3);
        g.printSemuaGaji();
        System.out.println("===========================");
    }
}
 

