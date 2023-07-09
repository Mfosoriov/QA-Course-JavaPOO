/*
 */
package Service;

import Entity.Cadena;
import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class CadenaService {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
// Método crearFrase(), se le pedirá al usuario que ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco 
// y a través de los métodos set, se guardará la frase y la longitud de manera automática según la longitud de la frase ingresada.
   
    public Cadena crearFrase (){
        
        Cadena nvaFrase = new Cadena();
        System.out.print("Ingrese una palabra o frase: ");
        nvaFrase.setFrase(leer.nextLine());
        nvaFrase.setLongitud(nvaFrase.getFrase().length());
        
    return nvaFrase; 
    }
    
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada. 
   
    public int mostrarVocales(Cadena frase){
   int contVocales = 0;
   
       for (int i = 0; i <frase.getFrase().length(); i++) {
           String letra = frase.getFrase().substring(i, i+1);
           
           if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                   || letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
               contVocales++;   
           }  
       }
       return contVocales;
   }
   
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
   
    public String invertirFrase(Cadena frase){
   String fraseInvertida=""; 
   
   for (int i = frase.getFrase().length(); i > 0; i--) {
           String letra = frase.getFrase().substring(i-1, i);
           fraseInvertida= fraseInvertida.concat(letra); 
        }
       return fraseInvertida; 
   }
   
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase,
// por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
   
    public void vecesRepetido(Cadena frase){
        System.out.print("Ingrese un carácter a buscar: ");
        String caracter = leer.nextLine();
        
        int contCaracter = 0;
   
       for (int i = 0; i <frase.getFrase().length(); i++) {
           String letra = frase.getFrase().substring(i, i+1);
           
           if (letra.equalsIgnoreCase(caracter)) {
               contCaracter++;   
           }  
       }
        System.out.println("El caracter " + caracter + " se repite "+contCaracter+" vez/veces");   
    }

//d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(Cadena frase){
        System.out.print("Ingrese una nueva frase para comparar su longitud con la primera: ");
        String frase2 = leer.nextLine();
        
        
        if (frase.getLongitud()==frase2.length()) {System.out.println("Las frases tienen la misma longitud");   
        }else if (frase.getLongitud()>frase2.length()) {System.out.println("La primera frase es más larga que la segunda");
        }else if (frase.getLongitud()<frase2.length()) {System.out.println("La segunda frase es más larga que la primera");
            }
    }
// e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante. 
    
    public String unirFrases(Cadena frase){
        String fraseUnida = frase.getFrase().concat(" ");
        System.out.print("Ingrese la frase a unir: ");
        fraseUnida=fraseUnida.concat(leer.nextLine());
        
    return fraseUnida;
    }
    
//f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
// por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

    public String reemplazar(Cadena frase){
        
        System.out.print("Ingrese caracter que reemplazará la letra 'a' ");
        String caracter=leer.nextLine();
        String  fraseCodificada= frase.getFrase().replace("a", caracter);
        fraseCodificada = fraseCodificada.replace("A", caracter);
    return fraseCodificada;
    }
//g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public boolean contiene(Cadena frase) {
        System.out.print("Ingrese un caracter, para validar si está en la frase: ");
        String caracter=leer.nextLine().toLowerCase();
        boolean validar = frase.getFrase().toLowerCase().contains(caracter);
    return validar; 
    }
}
