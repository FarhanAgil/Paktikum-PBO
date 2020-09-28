/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.kuis1;

/**
 *
 * @author ASUS
 */
public class MainManusia {
   public static void main(String[] args) {
        Wanita w = new Wanita();
        Pria p = new Pria();
       
        System.out.println("Contoh Pria dan wanita belum dewasa");
        p.setUmur(22);
        p.setNama("Farhan");
        p.infoPria();
        System.out.println("");

        w.setUmur(19);
        w.setNama("Anya");
        w.infoWanita();

        p.setData(25, "Farhan jr");
        p.infoPria();

        w.setData(23, "Silvia");
        w.infoWanita();
    } 
}
