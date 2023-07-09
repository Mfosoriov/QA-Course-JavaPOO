
package HolaMundo;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresa un numero decimal");
        double decimal = leer.nextDouble();
        
        System.out.println("Es usted mujer, ingrese true or false");
        boolean validar = leer.nextBoolean();
        
        char letra1 = 'A';
        System.out.println(letra1);
        
    }
    
}
