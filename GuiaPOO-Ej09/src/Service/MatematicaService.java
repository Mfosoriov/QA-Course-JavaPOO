
package Service;

import Entity.Matematica;


/**
 *
 * @author mfoso
 */
public class MatematicaService {

//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public double devolverMayor(Matematica mat){
        return Math.max(mat.getNum1(),mat.getNum2());
    }
//a.2)Método devolverMenor() para retornar cuál de los dos atributos tiene el menor valor

    public double devolverMenor(Matematica mat){
        return Math.min(mat.getNum1(),mat.getNum2());
    }
    
// b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.   
    
    public double calcularPotencia(Matematica mat){
        
        double mayor = Math.max(mat.getNum1(),mat.getNum2());
        double menor = Math.min(mat.getNum1(),mat.getNum2());
        
        return Math.pow(Math.round(mayor), Math.round(menor));
    }
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.   

    public double calculaRaiz(Matematica mat){
        return Math.sqrt(Math.abs(Math.min(mat.getNum1(), mat.getNum2())));
 
    }
    
}
