/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;


public class Ejercicio2 {
    
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.print("Ingrese su Nombre: ");
         String Nombre= leer.nextLine();
         
         System.out.println("Su nombre es "+Nombre);
     }
    
}
