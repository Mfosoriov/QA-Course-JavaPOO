/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;


public class Ejercicio3 {
    
    
    public static void main (String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese una frase: ");
        
        String Frase = leer.nextLine();
        
        System.out.println("Frase en Mayusculas: " + Frase.toUpperCase());
        
        System.out.println("Frase en Minusculas: " + Frase.toLowerCase());
    
    }
}
