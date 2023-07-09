/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un primer número: ");
        double num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número: ");
        double num2 = leer.nextInt();
        int opcion;
        String Salir = "N"; 

        do {
            
            System.out.println("*****MENU********");
            System.out.println("1.SUMAR ");
            System.out.println("2. RESTAR ");
            System.out.println("3. MULTIPLICAR ");
            System.out.println("4. DIVIDIR ");
            System.out.println("5. SALIR ");
            System.out.println("Elija una opción ");
            
           opcion =leer.nextInt();
           
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La división es: " + (num1/num2));
                    break;   
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N)?");
                    leer.nextLine();
                    Salir = leer.nextLine();
                    break;          
                default:
                    System.out.println("Opcion invalida");;
            }

        } while (Salir.equalsIgnoreCase("N"));
        
        System.out.println("**PROGRAMA FINALIZADO**");
        } 
    
    }
   

    
  
