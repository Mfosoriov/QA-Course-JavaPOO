/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:

*/
package Entity;

import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class Operacion {
    private double numero1;
    private double numero2;
    
// a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
// b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }
    
// c) Métodos get y set.

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
   
}