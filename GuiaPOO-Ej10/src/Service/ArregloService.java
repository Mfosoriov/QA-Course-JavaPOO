
package Service;

import java.util.Arrays;

/**
 * @author mfoso
 */
public class ArregloService {

//El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    
    public void llenarVecA(double[] vecA){
    
        for (int i = 0; i < vecA.length; i++) {
            vecA[i]=Math.random()*10;
        }
        System.out.println(Arrays.toString(vecA)); 
    }
//Luego, el arreglo A se debe ordenar de menor a mayor 
    
    public void ordenarArreglo(double[] vecX){
        Arrays.sort(vecX);
        System.out.println(Arrays.toString(vecX));
    }
    
// y copiar los primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5.    
    
    public void llenarVecB(double[] vecA, double[] vecB ){
    
        System.arraycopy(vecA, 0, vecB, 0, 10);
        Arrays.fill(vecB, 10, 20, 0.5);
        System.out.println(Arrays.toString(vecB));     
    }  
}
