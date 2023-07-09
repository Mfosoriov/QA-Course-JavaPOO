/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int dimension = leer.nextInt();
    
    
        for (int i = 1; i < (dimension+1); i++) {
            
            for (int j = 1; j < (dimension+1); j++) {
                
                if (i==1 || i==dimension || j==1 || j==dimension){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }

    }
    
}
