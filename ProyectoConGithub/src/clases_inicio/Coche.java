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
public class Coche {
    private int velocidad;
    
    Coche(){
        velocidad=0;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void acelerar(int a){
        velocidad+=a;
    }
    public void frena(int f){
        if(this.velocidad-f<0)
            velocidad =0;
        else
            velocidad-=f;
    }
    
}
