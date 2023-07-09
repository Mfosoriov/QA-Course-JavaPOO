/*
Ejercicios de Aprendizaje N.4
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guiapoo.ej04;

import Entity.Rectangulo;
import Service.RectanguloService;

/**
 *
 * @author mfoso
 */
public class GuiaPOOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RectanguloService serRec = new RectanguloService();
       Rectangulo Rec = serRec.crearRectangulo();
       System.out.println("Superficie: " + serRec.superficie(Rec));
       System.out.println("Perimetro: " + serRec.perimetro(Rec));
       serRec.dibujarRectangulo(Rec);
    }
    
}
