/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlingkaran;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    double PHI;
    double r;
    
    double hitungLuas(){
        return PHI * r * r;
    }
    
    double hitungKeliling() {
        return PHI * (2*r);
    }
}
