/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_inicio;

/**
 *
 * @author DAM1
 */
public class Temperatura {
    
    
    public double celsiusToFarenheid(double c){
        //formula = (C × 9 / 5) + 32 = x °F
      return (c*9/5)+32;  
    }
    
    public double farenheidToCelsius(double f){
        //formula = (F − 32) × 5 / 9 = x °C
      return (f-32)*5/9;  
    }
    
    
}
 
