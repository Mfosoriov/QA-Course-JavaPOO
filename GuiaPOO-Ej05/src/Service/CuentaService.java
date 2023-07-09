/*
Las operaciones asociadas a dicha clase son:
 */
package Service;

import Entity.Cuenta;
import java.util.Scanner;

/*
 * @author mfoso
 */
public class CuentaService {
    private Scanner leer = new Scanner(System.in);
    
// c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.   
    public Cuenta crearCuenta(){
        System.out.print("Ingrese No. de Cuenta: ");
        int numeroCuenta=leer.nextInt();
        System.out.print("Ingrese No. de DNI: ");
        long DNI=leer.nextLong();
        System.out.print("Ingrese Saldo Actual: $");
        int saldoActual=leer.nextInt();
    return new Cuenta(numeroCuenta, DNI, saldoActual);
    }
    
// d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.   
   public void ingresar(Cuenta cta){
       System.out.print("Cuanto desea ingresar: $");
       int ingreso = leer.nextInt();
       cta.setSaldoActual(cta.getSaldoActual()+ingreso);
       System.out.println("Nuevo Saldo: $" + cta.getSaldoActual());
    }  
   
// e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. 
// Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0. 
 public void retirar(Cuenta cta){
       System.out.print("Cuanto desea retirar: ");
       int retiro = leer.nextInt();
       if (cta.getSaldoActual()<retiro){
           System.out.println("Saldo insuficiente, podrá retirar: $" + cta.getSaldoActual());
           cta.setSaldoActual(cta.getSaldoActual()-cta.getSaldoActual());
           System.out.println("Nuevo Saldo: $" + cta.getSaldoActual());
       } else {
           cta.setSaldoActual( cta.getSaldoActual()-retiro);
           System.out.println("Nuevo Saldo: $" + cta.getSaldoActual());
       } 
    }  
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
 
 public void extraccionRapida(Cuenta cta){
       System.out.print("Retiro Rapido, cuanto desea retirar: ");
       int retiro = leer.nextInt();
       if (retiro<(cta.getSaldoActual()*0.20)){
           cta.setSaldoActual( cta.getSaldoActual()-retiro);
           System.out.println("Nuevo Saldo: $" + cta.getSaldoActual());
       } else {
           System.out.println("Valor supera el 20%, podrá retirar: $" + cta.getSaldoActual()*.20);
           cta.setSaldoActual((int) (cta.getSaldoActual()-cta.getSaldoActual()*0.20));
           System.out.println("Nuevo Saldo: $" + cta.getSaldoActual());
       } 
    }  
 
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 public void consultarSaldo(Cuenta cta){
     System.out.println("Su saldo actual es: $"+ cta.getSaldoActual());
 }
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 public void consultarDatos(Cuenta cta){
     System.out.println(cta.toString());
 }

}
