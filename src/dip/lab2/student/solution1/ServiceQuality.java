/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

public enum ServiceQuality {
    
    GOOD(0.20) , FAIR(0.15), POOR(0.10) ;
    
    private double rate;

    private ServiceQuality(double rate) {
            this.rate = rate;
    } 

    public double getRate() {
        return rate;
    }
    
    
}
