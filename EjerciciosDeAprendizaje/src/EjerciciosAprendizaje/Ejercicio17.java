/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio17 {
 
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio = leer.nextInt();
        
        int[] vector = new int [tamanio];
        
        
        for (int i = 0; i < tamanio; i++) {
            
            vector[i]= (int)(Math.random()*20000)+1; 
            System.out.print("["+ vector[i] +"]");
            
            
            
        }
        System.out.println("");
    }
}
