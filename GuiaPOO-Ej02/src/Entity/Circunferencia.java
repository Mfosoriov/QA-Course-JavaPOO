/*
 */
package Entity;

/**
 *
 * @author mfoso
 */

//Declarar una clase llamada Circunferencia A continuación, se deben crear los siguientes métodos:
public class Circunferencia {
 // que tenga como atributo privado el radio de tipo real. 

    private double radio; 

    public Circunferencia() {
    }    
    
 // a) Método constructor que inicialice el radio pasado como parámetro.

    public Circunferencia(double radio) {
        this.radio = radio;
    }
// b) Métodos get y set para el atributo radio de la clase Circunferencia.

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


}
