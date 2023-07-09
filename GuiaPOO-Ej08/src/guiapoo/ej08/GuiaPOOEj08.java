/*
Ejercicios de Aprendizaje N.8
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 

En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco y a través 
de los métodos set, se guardará la frase y la longitud de manera automática según la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:

a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guiapoo.ej08;

import Entity.Cadena;
import Service.CadenaService;

/**
 * @author mfoso
 */
public class GuiaPOOEj08 {

    public static void main(String[] args) {
      
        CadenaService cs = new CadenaService();
        Cadena frase1 = cs.crearFrase();
        
        System.out.println("La frase tiene: " + cs.mostrarVocales(frase1) + " vocales");
        System.out.println("La frase invertida: " + cs.invertirFrase(frase1));
        cs.vecesRepetido(frase1);
        cs.compararLongitud(frase1);
        System.out.println("La frase unida: "+cs.unirFrases(frase1));
        System.out.println("La frase codificada: "+cs.reemplazar(frase1));
        System.out.println("Es "+cs.contiene(frase1)+ " que la frase contiene el caracter");
        
    }
    
}
