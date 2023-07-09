/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,  el primer carácter tiene queser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package EjerciciosAprendizaje;
import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main (String[] args){
    
    Scanner leer = new Scanner(System.in);
    
     String palabra = " ";
     int incorrectas = 0;
     int correctas = 0;
     int conteo = 1;
    
     System.out.println("Ingrese palabras de 5 letras, que empiecen por X y terminen en O "
             + "(Para salir escriba &&&&&): ");
     
        do {
            
            System.out.print("Ingrese palabra " +conteo +" : ");
            conteo += 1;
            
            palabra = leer.nextLine();
            
            int largo = palabra.length();
            
            if (largo!=5){
                incorrectas += 1;
              
            } else if (palabra.substring(0,1).equalsIgnoreCase("X") && palabra.substring(4,5).equalsIgnoreCase("O") ){
                correctas +=1;
            } else {
                incorrectas +=1;
            }
            
        } while (! palabra.equalsIgnoreCase("&&&&&"));
        
        System.out.println("Informe de Resultados: ");
        System.out.println("Correctas: " +correctas);
        System.out.println("Incorrectas: " +incorrectas);
        System.out.println("Total: " + (correctas+incorrectas));
    
    
    }
    
}
