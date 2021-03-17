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
public class Número {
    private int n;
    
    Número(){
        n=0;
    }
    Número(int num){
        n=num;
    }
        
    public void añade(int m){
        n+=m;
    }
    public void rest(int r){
        n-=r;
    }
    public int gestValor(){
        return n;
    }
    public int getDoble(){
        return n*2;
    }
    public int getTriple(){
        return n*3;
    }
    public void setNumero(int n){
        this.n=n;
    }
    
}
