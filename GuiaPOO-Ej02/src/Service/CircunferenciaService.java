/*

 */
package Service;

import Entity.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class CircunferenciaService {
   private Scanner leer = new Scanner(System.in);
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
   
    public Circunferencia crearCircunferencia(){
       //Opcion 1  
//      Circunferencia Circulo = new Circunferencia();
//      System.out.println("Ingrese el radio del ciculo: ");
//      Circulo.setRadio(leer.nextDouble());
//      return Circulo;
        
       //Opcion 2 
       System.out.print("Ingrese el radio del ciculo: ");
       double radio = leer.nextDouble();
       return new Circunferencia(radio);
   
    }
   
// d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    
    public double area(Circunferencia Circulo){
    double area= PI*Circulo.getRadio()*Circulo.getRadio();
    return area;
    }
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).  
    public double perimetro(Circunferencia Circulo){
    double perimetro= 2*PI*Circulo.getRadio();
    return perimetro;
    }
}


