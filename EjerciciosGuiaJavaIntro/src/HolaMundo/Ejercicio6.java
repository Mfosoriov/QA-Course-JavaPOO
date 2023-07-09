/*
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
*/

package HolaMundo;

import java.util.Scanner;

public class Ejercicio6 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero entero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero entero");
        int num2 = leer.nextInt();
        
        
        if (num1>25 && num2>25){
            System.out.println("Los numeros "+ num1 + " y "+ num2 +" son mayores a 25");
        
        }else if (num1>25){
            System.out.println("El numero " +num1+ " es mayor a 25 ");
            
        }else if (num2>25){
            System.out.println("El numero " +num2+ " es mayor a 25 ");
        }else {
            System.out.println("Ninguno de los numeros es mayor a 25");  
        }
    }  
}
