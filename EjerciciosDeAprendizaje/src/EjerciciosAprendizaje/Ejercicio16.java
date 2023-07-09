/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio16 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio = leer.nextInt();
        
        int[] vector = new int [tamanio];
        
        
        
        for (int i = 0; i < tamanio; i++) {
            
            vector[i]= (int)(Math.random()*10); 
            System.out.print("["+ vector[i] +"]");
        }
    
        System.out.println("");
        System.out.println("");
        
        System.out.print("Ingrese un número de 1 a 9 para buscar en el vector: ");
        int Num = leer.nextInt();
        System.out.println(" ");
        int conteo = 0;
        
        for (int i = 0; i <  tamanio; i++) {
            
           if (vector[i]==Num) {
               System.out.println("El número esta en el indice: " + i);
               conteo += 1;
           }  
           
        } 
        
        switch (conteo) {
            case 1:
                System.out.println("El número no se repite");
                break;
            case 0:
                System.out.println("El número no hace parte del vector");
                break;
            default:
                System.out.println("El número se repite: " +conteo +" veces");
                break;
        }
    }
}
