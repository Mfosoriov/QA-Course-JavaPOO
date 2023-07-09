/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Operacion;
import java.util.Scanner;

/**
 *
 * @author mfoso
 */
public class OperacionService {
  private Scanner leer = new Scanner (System.in);
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.   

public Operacion crearOperacion(){
    
    System.out.println("Ingrese el numero 1: ");
    double numero1 = leer.nextDouble();
    System.out.println("Ingrese el numero 2: ");
    double numero2 = leer.nextDouble();
    return new Operacion(numero1, numero2);
}

//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.

public double sumar(Operacion operacion){
    double suma = operacion.getNumero1()+operacion.getNumero2();
      return suma;
}
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
public double restar(Operacion operacion){
    double resta = operacion.getNumero1()-operacion.getNumero2();
      return resta;
}
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
public void multiplicar(Operacion operacion){
    if(operacion.getNumero1()!=0 && operacion.getNumero2()!=0){
    double multiplicacion = operacion.getNumero1()*operacion.getNumero2();
        System.out.println(multiplicacion);
    }else{
      System.out.println("0  **Error:Multiplicación por 0**");  
    }
}
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
public void dividir(Operacion operacion){
    if(operacion.getNumero2()!=0){
    double division = operacion.getNumero1()/operacion.getNumero2();
        System.out.println(division);
    }else{
      System.out.println("0  **Error:Division por 0**");  
    }
}
}
