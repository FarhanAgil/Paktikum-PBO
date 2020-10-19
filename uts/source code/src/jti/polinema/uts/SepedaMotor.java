/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.uts;

/**
 *
 * @author ASUS
 */
public class SepedaMotor {
 private Mesin mesin;
    private String merekMotor;
    
    public SepedaMotor(String merekMotor, String merekMesin) {
        this.merekMotor = merekMotor;
        mesin = new Mesin();
        this.mesin.setMerek(merekMesin);
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public String getMerekMesin() {
        return mesin.merek;
    }

    public void tambahKecepatanMotor() {
        mesin.tambahKecepatan();
        System.out.println(mesin.getKecepatan() + " Km/jam");
    }

    public void kurangiKecepatanMotor() {
        mesin.kurangiKecepatan();
        System.out.println(mesin.getKecepatan() + " Km/jam");
    }
}
