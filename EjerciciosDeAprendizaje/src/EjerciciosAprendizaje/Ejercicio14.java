/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Euros: ");
        double cantidad = leer.nextDouble();
        System.out.print("Ingrese la moneda a la cual desea convertir (Libras, Dolares, Yenes): ");
        
        leer.nextLine();
        String moneda = leer.nextLine();
    
        convertidor(cantidad,moneda);
   
    }


    public static void convertidor(double cantidad, String moneda){

    if (moneda.equalsIgnoreCase("Libras")){
    //0.86 libras es un 1 €
        System.out.println(cantidad + " Euros son " +(cantidad*0.86) + " Libras ");
    
    }else if (moneda.equalsIgnoreCase("Dolares")){
        //1.28611 $ es un 1 €
        System.out.println(cantidad + " Euros son " +(cantidad*1.28611) + " Dolares ");

    }else if (moneda.equalsIgnoreCase("Yenes")) {
        // 129.852 yenes es un 1 €
        System.out.println(cantidad + " Euros son " +(cantidad*129.852) + " Yenes ");
    
    }else{
        System.out.println("Moneda Invalida");
    }

  }
      
}

