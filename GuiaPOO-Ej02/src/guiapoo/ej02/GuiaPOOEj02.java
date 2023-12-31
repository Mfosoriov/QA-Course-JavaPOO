/*
Ejercicios de Aprendizaje N.2
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package guiapoo.ej02;

import Entity.Circunferencia;
import Service.CircunferenciaService;

/**
 * @author mfoso
 */
public class GuiaPOOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaService serCir = new CircunferenciaService(); 
        Circunferencia Cir1 = serCir.crearCircunferencia();
        System.out.println("Radio: " + Cir1.getRadio());
        System.out.println("Area: " + serCir.area(Cir1));
        System.out.println("Perimetro: " + serCir.perimetro(Cir1));
    }
    
}
