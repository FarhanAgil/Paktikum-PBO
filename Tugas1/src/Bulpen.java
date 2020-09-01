/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Bulpen {
    private String merek;
    private String warnaTinta;
    private String ukuran;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setWarna(String newValue){
        warnaTinta = newValue;
    }
    
    public void setUkuran(String newValue){
        ukuran = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Warna tinta : " + warnaTinta);
        System.out.println("Ukuran : " + ukuran);
  
    }
}