/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.

El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5. 

Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.

 */
package guiapoo.ej10;

import Service.ArregloService;

/**
 * @author mfoso
 */
public class GuiaPOOEj10 {
    
    public static void main(String[] args) {
        
        double[] vecA = new double [50];
        double[] vecB = new double [20];
         
        ArregloService as = new ArregloService();
        
        System.out.println("Arreglo A: ");as.llenarVecA(vecA);
        System.out.println("Arreglo A en orden ascendente: ");as.ordenarArreglo(vecA);
        System.out.println("Arreglo B: ");as.llenarVecB(vecA, vecB);
        
    }
}
