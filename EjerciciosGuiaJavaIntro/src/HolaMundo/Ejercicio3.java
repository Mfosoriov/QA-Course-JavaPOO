/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo;

/**
 *
 * @author mfoso
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = 15;
        int num2 = 5;
        
        int suma = num1 + num2;
        int multip = num1 * num2;
        
        double division = num1 / num2;
        
        boolean validar = num2 < num1;
        
       
        System.out.println("suma = " + suma);
        System.out.println("multiplicación = "+ multip);
        System.out.println("división = " + division);
        System.out.println("No. 1 es mayor a N. 2 = " + validar);
        
    }
    
}
