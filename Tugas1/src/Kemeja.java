/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Kemeja extends Kaos {
    
    private int jumlahKancing;
    
public void SetJumlahKancing(int newValue) {
    jumlahKancing = newValue;
}

public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Jumlah Kancing : " + jumlahKancing);
    }
}    
    
