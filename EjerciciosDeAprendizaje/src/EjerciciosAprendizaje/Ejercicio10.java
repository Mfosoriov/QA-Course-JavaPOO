/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;


public class Ejercicio10 {
    
    public static void main (String[] args){
    
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un número positivo, el cual será el valor limite: ");
         double limite = leer.nextDouble();
         
         double suma = 0;
         
         do {
             
             System.out.println("Ingrese un numero:");
             double num2 = leer.nextDouble();
             suma += num2;
             
        } while (suma<limite);

    }
   
}
