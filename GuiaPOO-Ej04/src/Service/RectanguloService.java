/*

 */
package Service;

import Entity.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class RectanguloService {
    private Scanner leer = new Scanner(System.in);
    
//La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.     
    public Rectangulo crearRectangulo(){
        System.out.print("Ingrese Base: ");
        int base = leer.nextInt();
        System.out.print("Ingrese Altura: ");
        int altura = leer.nextInt();
        return new Rectangulo(base, altura);
    }
   
// También incluirá un método para calcular la superficie del rectángulo. Superficie = base * altura
    public int superficie (Rectangulo Rec){
      int area = Rec.getBase()*Rec.getAltura();
      return area;
    }
// y un método para calcular el perímetro del rectángulo. Perímetro = (base + altura) * 2.
    public int perimetro (Rectangulo Rec){
      int perimetro = (Rec.getBase()+Rec.getAltura())*2;
      return perimetro;
    } 
    
// Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.    
    public void dibujarRectangulo(Rectangulo Rec){
        System.out.println("Tu rectangulo: ");
        for (int i = 0; i < Rec.getAltura(); i++) {
            for (int j = 0; j < Rec.getBase(); j++) {
                System.out.print("*"); 
            }
          System.out.println("");
        }  
    }
}
