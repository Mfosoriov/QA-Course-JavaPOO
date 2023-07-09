/*
Crear un programa que dado un numero determine si es par o impar.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main (String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese un numero entero: ");
        int num = leer.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es Par");
        }else {
            System.out.println("El numero es Impar");
        }
    
    } 
    
}
