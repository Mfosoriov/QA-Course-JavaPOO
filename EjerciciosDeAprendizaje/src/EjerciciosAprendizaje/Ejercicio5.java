/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese un numero entero: ");
        int num = leer.nextInt();
        
        int doble = num*2;
        int triple = num*3;
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble de " +num+ " es: " + doble);
        System.out.println("El triple de " +num+ " es: " + triple);
        System.out.println("La raiz cuadrada de "+num+ " es: " + raiz);
    
    }
   
}
