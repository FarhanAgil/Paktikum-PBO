/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
       Kaos   ks1 = new Kaos();
       Kaos   ks2 = new Kaos();
       Kemeja km = new Kemeja();
       Bulpen bp1 = new Bulpen();
       Bulpen bp2 = new Bulpen();
       Spidol sp  = new Spidol ();
       System.out.println("---------------------------------------------------------");
        System.out.println("                       PAKAIAN                          ");
        System.out.println("---------------------------------------------------------");
        System.out.println();
       ks1.setMerk("Bape");
       ks1.setSize("XL");
       ks1.setWarna("Light green");
       ks1.cetakStatus();
       System.out.println("---------------------------------------------------------");
       
       ks2.setMerk("OffWhite");
       ks2.setSize("L");
       ks2.setWarna("Camo Blue");
       ks2.cetakStatus();
       System.out.println("---------------------------------------------------------");
       
       km.setMerk("Celcius");
       km.setSize("M");
       km.setWarna("Red Maroon");
       km.SetJumlahKancing(6);
       km.cetakStatus();
       
       System.out.println("---------------------------------------------------------");
       System.out.println("                   ALAT TULIS                            ");
       System.out.println("---------------------------------------------------------");
       System.out.println();
       bp1.setMerek("Standart");
       bp1.setWarna("Hitam");
       bp1.setUkuran("Kecil");
       bp1.cetakStatus();
       System.out.println("---------------------------------------------------------");
       
       bp2.setMerek("C7");
       bp2.setWarna("Biru");
       bp2.setUkuran("Sedang");
       bp2.cetakStatus();
       System.out.println("---------------------------------------------------------");
       
       sp.setMerek("Snowman");
       sp.setWarna("Merah");
       sp.setUkuran("Besar");
       sp.SetJenisSpidol("Permanent");
       sp.cetakStatus();
       
    }
  
}
