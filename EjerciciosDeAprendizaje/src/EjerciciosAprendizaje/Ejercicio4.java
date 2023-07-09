/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package EjerciciosAprendizaje;

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese temperatura en grados centigrados: ");
        double Centigrados = leer.nextInt();
        
        double Farenheit = (32+(Centigrados*9/5));
        
        System.out.println(Centigrados + " grados centigrados, equivalen a " + Farenheit + " grados Farenheit");
  
  
    }
    
}
