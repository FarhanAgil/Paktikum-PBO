/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.inheritance2.tugas;

/**
 *
 * @author ASUS
 */
public class Laptop extends Komputer {
 public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       :" + jnsBatrei);
    }

}   

