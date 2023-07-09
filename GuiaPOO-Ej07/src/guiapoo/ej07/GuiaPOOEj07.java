/*
Ejercicios de Aprendizaje N.7
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,  sexo ('H' hombre, 'M' mujer, 'O' otro), 
peso y altura. Si el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan 
a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, 
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje.
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal  y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal 
e indicar para cada objeto si la persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables, 
para después en el main, calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package guiapoo.ej07;

import Entity.Persona;
import Service.PersonaService;

/**
 *
 * @author mfoso
 */
public class GuiaPOOEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        
        Persona per1 = new Persona ("Maria", 32, "m", 63, 1.60);
        Persona per2 = new Persona ("Fabian", 35, "h", 63, 1.74);
        Persona per3 = new Persona ("Liliana", 12, "m", 60, 1.28);
        Persona per4 = new Persona ("Pablo", 15, "h", 40, 1.70);
      
        int imc1 = ps.calcularIMC(per1);
        int imc2 = ps.calcularIMC(per2);
        int imc3 = ps.calcularIMC(per3);
        int imc4 = ps.calcularIMC(per4);
           
        ps.validarIMC(imc1,per1);
        ps.validarIMC(imc2,per2);
        ps.validarIMC(imc3,per3);
        ps.validarIMC(imc4,per4);
        
        ps.porcentajePeso(imc1, imc2, imc3, imc4);
        
        boolean edad1 = ps.esMayorDeEdad(per1);
        boolean edad2 = ps.esMayorDeEdad(per2);
        boolean edad3 = ps.esMayorDeEdad(per3);
        boolean edad4 = ps.esMayorDeEdad(per4);
              
        ps.validarEdad(edad1,per1);
        ps.validarEdad(edad2,per2);
        ps.validarEdad(edad3,per3);
        ps.validarEdad(edad4,per4);
        
        ps.porcentajeEdad(edad1, edad2, edad3, edad4);
        
        
        
        
    }
    
}
