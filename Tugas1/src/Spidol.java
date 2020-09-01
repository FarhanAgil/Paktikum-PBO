/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Spidol extends Bulpen {
   private String jenisSpidol;
    
public void SetJenisSpidol(String newValue) {
    jenisSpidol = newValue;
}

public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Jenis Spidol : " + jenisSpidol);
    }
} 

