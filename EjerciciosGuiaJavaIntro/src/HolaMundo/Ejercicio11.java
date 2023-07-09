
package HolaMundo;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        do {
            System.out.println("Ingrese una frase a codificar y termine con punto");
            frase = leer.nextLine();
        } while (! frase.endsWith("."));
        
        String fraseCodificada = codificar(frase);
        
        System.out.println("Frase codificada: ");
        System.out.println(fraseCodificada);
    }
    
    public static String codificar (String frase){
        
         String frase2 = "";
         int longitud = frase.length();
         
         for (int i = 0; i < longitud; i++) {
             String letra;
             
            letra= frase.substring(i, i+1);
            
             switch (letra.toLowerCase()) {
                 case "a":
                     letra = "@";
                     break;
                 case "e":
                     letra = "#";
                     break;
                 case "i":
                     letra = "$";
                     break;
                 case "o":
                     letra = "%";
                     break;
                 case "u":
                     letra = "*";
                     break;
                     
                 default:
                        ;
                
             }
           frase2 = frase2.concat(letra); 
        }
         
          return frase2;  
        
    }
}
