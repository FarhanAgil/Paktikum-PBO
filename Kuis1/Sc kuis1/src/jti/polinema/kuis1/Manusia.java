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
public class Manusia {
  private int umur;
    private String nama;
    private boolean dewasa;

    public void setUmur(int number) {
        umur = number;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String word) {
        nama = word;
    }

    public String getNama() {
        return nama;
    }

    public void setData(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;

    }

    public boolean getDewasaP1() {
        if (umur <= 18) {
            dewasa = false;
        } else {
            dewasa = true;
        }
        return dewasa;
    }

    public boolean getDewasaW1() {
        if (umur <= 18) {
            dewasa = false;
        } else {
            dewasa = true;
        }
        return dewasa;
    }

    public void info() {

        System.out.println("Nama :" + getNama());
        System.out.println("Umur :" + getUmur());
    }
}

  

