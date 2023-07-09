
package HolaMundo;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese un primer valor");
    int num1 = leer.nextInt();
    
    
    System.out.println("Ingrese un segundo valor");
    int num2 = leer.nextInt();
    
    EsMultiplo(num1, num2);
    
   
    }
   
    public static void EsMultiplo(int num1, int num2) {
        
        if ((num1%num2)==0){
            System.out.println("El numero "+num1+" es multiplo del "+num2);
        }else {
            System.out.println("El numero "+num1+" NO es multiplo del "+num2);
        }
        
    }
}
