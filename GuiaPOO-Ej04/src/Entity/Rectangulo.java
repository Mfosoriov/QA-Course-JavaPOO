/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. 
 */
package Entity;

/**
 *
 * @author mfoso
 */
public class Rectangulo {
    private int base;
    private int altura;
    
//  Se deberán además definir los constructores correspondientes.     
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
 
//  Se deberán además definir los métodos getters y setters 
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
