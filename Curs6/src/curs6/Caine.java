/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs6;

/**
 *
 * @author rmaftei
 */
public class Caine extends Animal{
float frecventaDeLucru;
    public Caine(String n) {
        super(n);
    }
    
    
     public void latra(){
        System.out.println(nume + "zise: Miau");
    }
    
  
    public void mananca(){
        System.out.println("Cainele " + nume + "mananca cu o frecventa " + frecventaDeLucru);
    }
}
