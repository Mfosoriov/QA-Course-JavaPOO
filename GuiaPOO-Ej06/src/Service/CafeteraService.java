/*
 */
package Service;

import Entity.Cafetera;
import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class CafeteraService {
    
    private Scanner leer = new Scanner (System.in);
 
    public Cafetera crearCafetera(){
         Cafetera caf = new Cafetera();
         System.out.print("Ingrese la capacidad maxima de la cafetera en ml: ");
         caf.setCapacidadMaxima(leer.nextDouble()); //Se adigna la capacidad de la cafetera
         caf.setCantidadActual(0); //Se asigna la cantidad actual en 0
         return caf;
    } 
       
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.  
    public void llenarCafetera(Cafetera caf){
    caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("Cafetera llena");
    }
    
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
// y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
// para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
// y de no haberse llenado en cuanto quedó la taza.   
    public void servirTaza(Cafetera caf){
        System.out.print("Ingrese tamaño de la taza en ml: ");
        double taza = leer.nextDouble();
    
        if (taza>caf.getCantidadActual()){
        System.out.println("La taza no se lleno, se sirvieron : "+ caf.getCantidadActual()+" ml");
        caf.setCantidadActual(0);
        }else {
        System.out.println("La taza se lleno");
        caf.setCantidadActual(caf.getCantidadActual()-taza);
         }
    }

// Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera caf){
        caf.setCantidadActual(0);
        System.out.println("La cafetera se vacio");
}
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
// recibe y se añade a la cafetera la cantidad de café indicada.
    
    public void agregarCafe(Cafetera caf){
        System.out.println("Ingrese la cantidad de cafe a agregar en ml: ");
        double cafe =leer.nextDouble();
        
        while(caf.getCantidadActual()+cafe>caf.getCapacidadMaxima()){
            System.out.println("Cantidad excede la capacidad, podrá agregar maximo "+ (caf.getCapacidadMaxima()-caf.getCantidadActual()));
            System.out.println("Ingrese la cantidad de cafe a agregar en ml: ");
            cafe =leer.nextDouble();
        }
        caf.setCantidadActual(caf.getCantidadActual()+cafe);
        System.out.println("Cantidad actual de cafe: "+caf.getCantidadActual()+ " ml");
    }
}
