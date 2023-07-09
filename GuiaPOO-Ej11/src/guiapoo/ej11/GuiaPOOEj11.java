/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la clase Date. 
En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, para esto vamos a tener que crear 3 variables, 
dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual,
que se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package guiapoo.ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class GuiaPOOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese día(dd): ");int dia = leer.nextInt();
        System.out.print("Ingrese mes(mm): ");int mes = leer.nextInt();
        System.out.print("Ingrese año(AAAA): ");int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
                
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        System.out.println("Diferencia de: " + (fechaActual.getYear()-fecha.getYear())+" años y " + (fechaActual.getMonth()-fecha.getMonth())+" meses");
                                                                                                                         
    }
    
}
