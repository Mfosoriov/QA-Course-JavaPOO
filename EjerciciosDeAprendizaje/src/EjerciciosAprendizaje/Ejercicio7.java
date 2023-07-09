/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una palabra: ");
    String frase1 = leer.nextLine();
    
    String frase2 = "eureka";
    
    if (frase1.equals(frase2)){
        System.out.println("Correcto");
    }else {
        System.out.println("Incorrecto");
    }
    
    }
}
