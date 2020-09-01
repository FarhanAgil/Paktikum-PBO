/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Kaos {
   private String merk;
   private String size;
   private String warna;
   
public void setMerk(String newValue){   
   merk = newValue; 
}

public void setSize(String newValue){
    size = newValue;
}

public void setWarna(String newValue){
    warna = newValue;
}

public void cetakStatus(){
    System.out.println("Merk  : " + merk);
    System.out.println("Size  : " + size);
    System.out.println("Warna : " + warna);
    }
}