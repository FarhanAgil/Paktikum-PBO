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
public class Mesin {
  public String merek;
    public double kecepatan;

    public Mesin() {
        
    }

    public void setMerek(String merekMesin) {
        this.merek = merekMesin;
    }

    public String getMerek() {
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        if ("Honda".equals(getMerek()) && kecepatan < 90) {
            kecepatan += 10;
        } else if ("Yamaha".equals(getMerek()) && kecepatan < 90) {
            kecepatan += 15;
        } else {
            getKecepatan();
        }
    }

    public void kurangiKecepatan() {
        if ("Honda".equals(getMerek()) && kecepatan > 0) {
            kecepatan -= 5;
        } else if ("Yamaha".equals(getMerek()) && kecepatan > 0) {
            kecepatan -= 10;
        } else {
            getKecepatan();
        }
    }
}