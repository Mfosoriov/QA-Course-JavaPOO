/*

 */
package Entity;

/**
 *
 * @author mfoso
 */

//Desarrolle una clase Cafetera con los atributos capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) 
// y cantidadActual (la cantidad actual de café que hay en la cafetera).

public class Cafetera {
    
    private double capacidadMaxima; 
    private double cantidadActual;
    
// Constructor predeterminado o vacío
     public Cafetera() {
    }  
// Constructor con la capacidad máxima y la cantidad actual
      public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
// Métodos getters y setters.

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
 
}
