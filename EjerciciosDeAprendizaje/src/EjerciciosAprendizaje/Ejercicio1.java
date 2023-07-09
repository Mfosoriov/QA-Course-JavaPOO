/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package EjerciciosAprendizaje;

import java.util.Scanner;


public class Ejercicio1 {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Vamos a calcular la suma de dos números");
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número número: ");
        int num2 = leer.nextInt();
        
        System.out.println("La suma de los numeros es: " + (num1+num2));
        
    }
    
}
