/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. 
La clase deber tener un constructor vacío, parametrizado y get y set. 

En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran en el objeto con su respectivos set. 
Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guiapoo.ej09;

import Entity.Matematica;
import Service.MatematicaService;

/**
 * @author mfoso
 */

public class GuiaPOOEj09 {

    public static void main(String[] args) {
      
        Matematica mat = new Matematica();
        mat.setNum1(Math.random()*10);
        mat.setNum2(Math.random()*10);
        MatematicaService ms = new MatematicaService();
        
        
        System.out.println(mat.toString());
        System.out.println("El mayor de los dos numeros es : "+ms.devolverMayor(mat));
        System.out.println("La potencia redondeada de " + ms.devolverMayor(mat)+ " elevado a: "+ms.devolverMenor(mat)+ " es: " +ms.calcularPotencia(mat));
        System.out.println("La raiz cuadrada del valor absoluto de "+ms.devolverMenor(mat)+ " es: "+ms.calculaRaiz(mat));
    }
    
}
