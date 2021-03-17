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
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Temperatura t = new Temperatura();
        System.out.println("45 grados celsius son en farenheid: " + t.celsiusToFarenheid(45));
        System.out.println("113 grados farenheid son en celsius: "+t.farenheidToCelsius(113));

    }

}
