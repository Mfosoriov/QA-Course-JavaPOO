
package Service;

import Entity.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * @author mfoso
 */
public class PersonaService {
    
    private Scanner leer = new Scanner(System.in);
            
// Agregar un método de creación del objeto que respete la siguiente firma: crearPersona().Este método 
//rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la 
//persona a crear,recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.  

public Persona crearPersona(){
    
    System.out.print("Ingrese Nombre: ");
    String nombre = leer.nextLine();
    System.out.print("Ingrese año de Nacimiento: ");int anio= leer.nextInt();
    System.out.print("Ingrese mes de Nacimiento: ");int mes= leer.nextInt();
    System.out.print("Ingrese día de Nacimiento: ");int dia= leer.nextInt();
    Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
    
    return new Persona(nombre, fechaNacimiento, 0);
    }
// Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. 
// Tener en cuenta que para conocer la edad de la persona también se debe conocer la fecha actual.

public void calculaEdad(Persona persona){
    Date fechaActual = new Date();
    int anios = 0;
    
    if (fechaActual.getYear()==persona.getFechaNacimiento().getYear()) {
        anios = 0;
    } else if (fechaActual.getYear()>persona.getFechaNacimiento().getYear()) {
        if (fechaActual.getMonth()>persona.getFechaNacimiento().getMonth()) { 
          anios = fechaActual.getYear()-persona.getFechaNacimiento().getYear();  
        }else{
          anios = (fechaActual.getYear()-persona.getFechaNacimiento().getYear())-1; 
        }
    }
    
    persona.setEdad(anios);
    System.out.println(persona.getNombre()+" tiene "+anios+" años");
    
    }
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso
// de que el receptor tenga menor edad que la persona que se recibe como parámetro, o false en caso contrario.

public boolean menorQue(Persona persona){
    
    System.out.print("Ingrese la edad de la segunda persona: ");
    int edad2 = leer.nextInt();
    
    return edad2<persona.getEdad();
    }

//  Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
 public void mostrarPersona(Persona persona){
     System.out.println(persona.toString());
 }

}  


