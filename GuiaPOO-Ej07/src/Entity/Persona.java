/*

 */
package Entity;

/**
 *
 * @author mfoso
 */

//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,  sexo ('H' hombre, 'M' mujer, 'O' otro), 
//peso y altura. Si el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:
public class Persona {
    
    private String nombre; 
    private int edad;
    private String sexo;
    private double peso;
    private double altura; 
    
// Un constructor por defecto.
    public Persona() {
    }
    
// Un constructor con todos los atributos como parámetro.
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
// Métodos getters y setters de cada atributo.
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
