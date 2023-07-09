/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
*/
package HolaMundo;

import java.util.Scanner;
 
public class Ejercicio13y14 {
    
     public static void main(String[] args) {
         
     Scanner leer = new Scanner(System.in);
     
     String [] Equipo = new String [8];
     
     //Asigno valores mediante el bucle for 
     for (int i = 0; i < Equipo.length; i++) {
        System.out.println("Ingrese el nombre del compañero "+ (i+1));    
        Equipo[i]= leer.nextLine();  
         }
    
    for (int i = 0; i < Equipo.length; i++) {
             System.out.print("[" + Equipo[i] + "]");
         }
         System.out.println("");
     }
    
}
