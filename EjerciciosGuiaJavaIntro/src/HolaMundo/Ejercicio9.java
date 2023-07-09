/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/
package HolaMundo;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int conteo = 0;
       int suma = 0;
        
        do {
            conteo = conteo+1;
            System.out.println("Ingrese el numero " + conteo+":");
            num = leer.nextInt();
            
            if (num>0){
                suma=suma+num;
            }
            
        } while (num != 0 && conteo<20);
        
        if (num==0) {
             System.out.println("Se capturo el numero 0");
             System.out.println("La suma de los numeros es: " + suma);
        }else {
            System.out.println("La suma de los numeros es: " + suma);
        }
   
    }
   
}
