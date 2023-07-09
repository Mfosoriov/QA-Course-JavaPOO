/*
 */
package Service;

import Entity.Persona;
import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class PersonaService {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
//  Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan 
//a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, 
//es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje.
    
    public Persona crearPersona(){
        System.out.print("Ingrese Nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese Edad: ");
        int edad = leer.nextInt();
        
        System.out.print("Ingrese Sexo, H, M u O: ");
        String sexo = leer.next();
        while(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("O")){
            System.out.println("Ingrese un valor valido, H, M u O: ");
            sexo = leer.next();
        }
        
        System.out.print("Ingrese Peso en Kgs: ");
        double peso = leer.nextDouble();
        System.out.print("Ingrese Altura en Mts: ");
        double altura = leer.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
//Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal  y la función devuelve un -1. 
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
//Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.  
    
    public int calcularIMC(Persona persona){
    
    double IMC = persona.getPeso()/Math.pow(persona.getAltura(), 2);
    
    if(IMC<20){
        return -1;
    }if(IMC>=20 && IMC <=25){
        return 0;
    }else {
        return 1;      
        }
    }
// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.    
    public boolean esMayorDeEdad(Persona persona){
  
        return persona.getEdad()>=18;
 }
   
// Método validarIMC(): indica si el resultado del IMC es -1 Debajo del peso ideal, 0 Peso ideal,  1 sobrepeso
    public void validarIMC(int IMC, Persona persona){
        
        switch (IMC) {
            case -1:
                System.out.println(persona.getNombre()+" esta por debajo del peso ideal");
                break;
            case 1:
                System.out.println(persona.getNombre() + " esta por encima del peso ideal");
                break;   
            case 0:
                System.out.println(persona.getNombre() +" esta en el peso ideal");
                break;
            default:
                break;
        }
    }
// Método validarEdad(): indica si la persona es mayor de edad
    public void validarEdad(Boolean edad, Persona persona){
    
        if (edad) {System.out.println(persona.getNombre() + " es mayor de edad");        
        } else {System.out.println(persona.getNombre()+" es menor de edad");}
    }
// Método porcentajePeso():indica el % por cada peso (bajo, ideal, alto)
    public void porcentajePeso(int imc1, int imc2, int imc3, int imc4){
        
        int[] vectorImc = new int [4];
        vectorImc[0]=imc1;
        vectorImc[1]=imc2;
        vectorImc[2]=imc3;
        vectorImc[3]=imc4;
        
        int bajo=0;
        int ideal=0;
        int alto=0;
        
        for (int i = 0; i < 4; i++) {       
           if (vectorImc[i] == -1){
                bajo++;
            }else if (vectorImc[i] == 1) {
                alto++;
            }else if(vectorImc[i] == 0) {
                ideal++;
            }
        }
        
        System.out.println("El " + (bajo*100/4)+"% esta bajo de peso, el "+ (ideal*100/4)+"% esta en el peso ideal, el "+ (alto*100/4)+"% esta en sobrepeso"); 
    
    }
    
// Método porcentajeEdad():indica el % por edad (mayor o menor)
    
        public void porcentajeEdad(boolean edad1, boolean edad2, boolean edad3, boolean edad4){
        
        boolean[] vectorEdad = new boolean [4];
        vectorEdad[0]=edad1;
        vectorEdad[1]=edad2;
        vectorEdad[2]=edad3;
        vectorEdad[3]=edad4;
        
        int menor=0;
        int mayor=0;
        
        for (int i = 0; i < 4; i++) {       
           if (vectorEdad[i] == true){
                mayor++;
            }else {
                menor++;
            }
        }
        System.out.println("El " + (mayor*100/4)+"% es mayor de edad, el "+ (menor*100/4)+"% es menor de edad"); 
    
    }
}